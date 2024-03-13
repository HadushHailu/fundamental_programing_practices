package simple_formal_deep_concepts;

interface AbstractInterface{
    public abstract void getName();
    public default void saySomthing(){
        System.out.println("I am a default interface method");
    }
    private static void hereIs(){
        System.out.println("Here is");
    }
}
class AbstractSupClass{
    static void staticMethod(){
        System.out.println("Super class static method");
    }


    AbstractSupClass(String name){

    }

    AbstractSupClass(){}
}
public class AbstractInherit extends AbstractSupClass{

    static void staticMethod(){
        System.out.println("Child class static method");
    }
    public static void main(String[] args) {
        AbstractInherit abstractInherit = new AbstractInherit();
        AbstractInherit.staticMethod();

    }
}
