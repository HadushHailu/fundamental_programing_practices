package simple_formal_exercise;

public class Child extends Parent {
    static String str;
    String instanceStr;

    static{
        str = "Hello world";
        System.out.println("Child static block str = " + str);
    }

    {
        instanceStr = "Hi";
        System.out.println("Child instance block str = " + instanceStr);
    }

    Child(String s){
        super(100);
        instanceStr = s;
        System.out.println("Child constructor instanceStr: " + instanceStr);
    }
}

