package simple_formal_exercise;

import java.util.Optional;

public class BinaryToString {
    public static void main(String[] args) {
        int val = 10;
        int val1 = Integer.valueOf(10);
        int val2 = new Integer(10);
        System.out.println(val == val2);
    }
}
