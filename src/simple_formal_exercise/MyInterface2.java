package simple_formal_exercise;

public interface MyInterface2 {
    public static final int MY_CONSTANT = 10;


    public abstract void greet();

    //public abstract void myAbstractMethod()
    private static void myAbstractMethod(){
        System.out.println("Hello");
    };

    //public default void myMethodWithBody()
    public default void myMethod(){
        System.out.println("Implemented method in an interface.");
    }

    //public static void staticMethodInsideInterface()
    private void printSomething(){
        System.out.println("Private Method in an interface.");
    }
}
