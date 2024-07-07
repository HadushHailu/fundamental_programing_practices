package simple_formal_deep_concepts;

import java.util.Objects;

public class TestHashCodes {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(s.hashCode());
        System.out.println(Objects.hashCode(s));
    }
}
