package simple_formal_projects_6;

import java.util.Arrays;

/**
 * @author Hadush
 * @since 0.1
 */
public class MyTable {
    Entry[] entries;
    MyTable(){
        entries = new Entry[26];
    }

    /**
     *
     * @param c character to be entered
     * @param s string to be entered
     */
    public void add(char c,
                    String s){
        int charIndex = charIndex(c);
        if(charIndex >= 0 && charIndex < 26){
            entries[charIndex] = new Entry(c,s);
        }
    }

    @Override
    public String toString() {
        String str = "";
        for(Entry entry: entries){
            if(entry != null){
                str += entry;
            }
        }
        return str;
    }

    public String get(char c){
        return this.entries[charIndex(c)].str;
    }
    private int charIndex(char c){
        return c - 'a';
    }

    private class Entry{
        private char ch;
        private String str;
        Entry(char c, String s){
            this.ch = c;
            this.str = s;
        }

        @Override
        public String toString(){
            return  ch + "->" + str + "\n";
        }

    }

    public static void main(String[] args) {
       MyTable myTable = new MyTable();

       myTable.add('a', "Andrew");
       myTable.add('b',"Billy");
       myTable.add('w',"Willie");
       System.out.println(myTable);

       MyTable[] myTables = new MyTable[4];
       System.out.println(myTables[0]);
    }

}
