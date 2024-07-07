package simple_formal_exercise;

public class Parent {
    static int value;
    int instanceValue;

    static{
        value = 10;
        System.out.println("Parent static block value = " + value);
    }

    {
        instanceValue = 20;
        System.out.println("parent instance block instanceValue = " + instanceValue);
    }

    Parent(int v){
        instanceValue = v;
        System.out.println("Parent constructor instanceValue = " + instanceValue);
    }
}
