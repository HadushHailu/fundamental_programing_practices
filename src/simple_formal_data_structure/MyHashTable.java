package simple_formal_data_structure;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashTable {
    private int numOfElements;
    private static final int INITIAL_SIZE = 19;
    private int tableSize;
    //To avoid collision with same index, every index is implemented linkedList
    private LinkedList[] table;
    public MyHashTable(){
        this(INITIAL_SIZE);
    }

    public MyHashTable(int tableSize){
        this.tableSize = tableSize;
        table = new LinkedList[tableSize];
        numOfElements = 0;
    }

    //First try
    public void put(Object key, Object value){
        if(key == null){
            return;
        }

        int hasCode = key.hashCode();
        int hashValue = hash(hasCode);

        Entry e = new Entry(key, value);
        boolean keyAlreadyInUse = false;
        if(table[hashValue] != null){
            for(Object ob: table[hashValue]){
                Entry ent = (Entry) ob;
                if(ent.key.equals(key)){
                    keyAlreadyInUse = true;
                    ent.value = value;
                    return;
                }
            }
        }
        if(!keyAlreadyInUse){
            if(table[hashValue] == null){
                table[hashValue] = new LinkedList();
            }
            table[hashValue].add(e);
            numOfElements++;
        }
    }

    public class Entry{
        private Object key;
        private Object value;
        Entry(){}
        Entry(Object key, Object value){
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString(){
            return key.toString() + "->" + value.toString();
        }
    }

    public Object get(Object key){
        if(key == null){
            return null;
        }

        int hasCode = key.hashCode();
        int hashValue = hash(hasCode);
        if(table[hashValue] == null){
            return null;
        }

        Entry e = null;
        for(Iterator it = table[hashValue].iterator(); it.hasNext();){
            e = (Entry) it.next();
            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;
    }

    public int hash(int hashCode){
        return Math.abs(hashCode) % tableSize;
    }

    @Override
    public String toString() {
        String n = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < table.length; i++) {
            if(table[i] != null){
                sb.append("Index[" + i + "]");
                Entry next = null;
                for (Iterator it = table[i].iterator(); it.hasNext(); ) {
                    next = (Entry) it.next();
                    if (next.value != null)
                        sb.append(next + n);
                    else
                        sb.append(next.key + "->null" + n);
                }
        }
    }
        return sb.toString();
    }


}
