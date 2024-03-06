package simple_formal_reflection_nested;

public class MyClass_abstract {
    private int val = 10;
    public static void main(String[] args) {
    new MyClass_abstract();
    }

    MyClass_abstract(){
        MyInnerClass myInnerClass = new MyInnerClass();
        System.out.println(myInnerClass.intVal);
        MyInnerClass.innerMethod(myInnerClass);
    }
    static class MyInnerClass{
        private int intVal = 3;
        private static void innerMethod(MyInnerClass myInnerClass){
            System.out.println(myInnerClass.intVal);
        }
    }
}
