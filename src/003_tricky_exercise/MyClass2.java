package simple_formal_exercise;

public class MyClass2 implements MyInterface2{
    @Override
    public void greet(){
        System.out.println("Hi");
        myMethod();
    }

    @Override
    public void myMethod(){
        System.out.println("Implemented method in a class!");
    }
    public static void main(String[] argv){
        new MyClass2().myMethod();
        new MyClass2().greet();
    }
}
