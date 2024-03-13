package simple_formal_data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> vowels = new ArrayList<>();
        vowels.add("A");
        vowels.add("E");
        vowels.add("U");
        System.out.println(vowels);
        vowels.add(1,"I");
        vowels.add(1,"O");
        System.out.println(vowels);

        List<Integer> primeNumbers = new ArrayList<>();
        System.out.println(Arrays.asList(2,5,7,11,13));
        primeNumbers.addAll(Arrays.asList(2,3,5,7,11,13));
        primeNumbers.addAll(1, Arrays.asList(23,25));
        System.out.println(primeNumbers);

    }
}
