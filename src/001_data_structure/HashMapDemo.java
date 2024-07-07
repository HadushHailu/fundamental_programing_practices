package simple_formal_data_structure;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable();

        //System.out.println(MyHashTable.class.g);

        myHashTable.put("CSE01", "Data structure");
        myHashTable.put("CSE02", "Java");
        myHashTable.put("CSE03", "Robotics");
        myHashTable.put("CSE09", "Computer Vision");
        System.out.println(myHashTable);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Keys");
        hashMap.put(2, "Books");
        hashMap.put(3, "Systems");
        hashMap.put(7, "Mobiles");

        for(Map.Entry<Integer, String> entry: hashMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + "-> Value: " + entry.getValue() );
        }

        hashMap.keySet();
        hashMap.values();
        System.out.println(hashMap.containsKey(4));
        System.out.println(hashMap.get(null));
        System.out.println(hashMap.containsValue("Books"));
        hashMap.put(7, "Samsung");
        hashMap.put(7, "Samsung1");
        hashMap.put(null, "Apple");
        hashMap.put(null, "AppleMac");
        System.out.println(hashMap);
    }
}
