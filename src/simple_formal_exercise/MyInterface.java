package simple_formal_exercise;

public interface MyInterface {
    //public static final int MY_CONSTANT = 10;
    int MY_CONSTANT = 10;

    //public abstract void myAbstractMethod()
    void myAbstractMethod();

    //public default void myMethodWithBody()
    default void myMethodWithBody(){
        System.out.println("Implemented method in an interface.");
    }

    //public static void staticMethodInsideInterface()
    static void staticMethodInsideInterface(){
        System.out.println("Static method inside an interface");
    }
}
