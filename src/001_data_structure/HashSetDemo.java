package simple_formal_data_structure;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Swing");
        set.add("Java spring");
        set.add("Banana");

        System.out.println(set);
        System.out.println("Remove Java: " + set.remove("Java"));
        System.out.println("Set contains swing: " + set.contains("swing"));
        System.out.println("size: " + set.size());

        for(Object o: set){
            System.out.print(o + " ");
        }

        HashSet<String> obj = new HashSet<>();
        obj.add("Java");
        if(obj.add("Java")){
            System.out.println("true");
        }else System.out.println("false");

        for(Object o: set){
            System.out.print(o + " ");
        }
    }
}
