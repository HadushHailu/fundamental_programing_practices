package simple_formal_reflection_nested;

public class MyClass {
    private String s = "hello";

    MyClass(){
        MyInnnerClass myInnnerClass = new MyInnnerClass();
        System.out.println(myInnnerClass.intVal);
        myInnnerClass.innerMethod();
    }

    public static void main(String[] argv){
        new MyClass();
    }

    private class MyInnnerClass{
        private int intVal = 3;
        private void innerMethod(){
            System.out.println(s);
        }
    }


}

