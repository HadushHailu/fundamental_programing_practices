package simple_formal_deep_concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableTest {
    public static void main(String[] args) {
        List<String> javaList = new ArrayList<>();
        javaList.add("Bob");
        javaList.add("Carol");
        javaList.add("Berhe");

        javaList.forEach(name-> System.out.println(name));

        System.out.println("[+] Iterator");
        var it = javaList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
