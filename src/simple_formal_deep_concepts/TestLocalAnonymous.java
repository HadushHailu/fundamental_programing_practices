package simple_formal_deep_concepts;

interface InterfaceA{
    public static final int a = 10;

    public abstract void getName();
    public static void utterStaticName(){
        System.out.println("My name is interface A stqtic method");
    }

    public default void utterDefaultName(){
        System.out.println("My name is interface A default method");
    }

}
class ClassA{
    public String name;
    ClassA(String name){
        System.out.println("s: " + name);
        this.name = name;
    }

    public void getName(){
        System.out.println("parent class - Anonymous class name: " + name);
    }
}
public class TestLocalAnonymous{
    public static void main(String[] args) {
       new ClassA("Hadush"){
            @Override
            public void getName(){
                System.out.println("child class: Anonymous class");
            }

            public void myAnonymousMethod(){
                System.out.println("I am method within anonymous class");
            }
        }.getName();

       //
        InterfaceA interfaceA = new InterfaceA() {
            @Override
            public void getName() {
                System.out.println("anonymous class: get Namw");
            }
        };

        InterfaceA.utterStaticName();
        interfaceA.getName();


    }
}
