package simple_formal_data_structure;

import java.util.Hashtable;
import java.util.Set;

class Empl{
    private String name;
    private int salary;
    private int id;
    public Empl(int id,
                String n,
                int s){
        this.id = id;
        this.name = n;
        this.salary =s;
    }

    public String toString(){
        return id + "\n" + name +
                "\n" + salary + "\n";
    }
}
public class HashTableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, Empl> tm = new Hashtable<>();
        tm.put(1, new Empl(134, "Ramu", 3000));
        tm.put(5, new Empl(235, "Jony", 6000));
        tm.put(4, new Empl(879, "Cris", 200));

        System.out.println("HashTable entries: ");
        Set<Integer> keys = tm.keySet();
        for(Integer key: keys){
            System.out.println(key + "==> " + tm.get(key));
        }

        tm.remove(4);
        tm.replace(5, new Empl(235, "Jony", 3200));
        System.out.println(tm);
    }
}
