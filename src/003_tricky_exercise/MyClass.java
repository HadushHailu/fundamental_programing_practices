package simple_formal_exercise;

public class MyClass implements MyInterface{
    @Override
    public void myAbstractMethod(){
        MyInterface.staticMethodInsideInterface();
        myMethodWithBody();
        System.out.println("My implementation!");
    }

    public static void main(String[] argv){
        MyClass myClass = new MyClass();
        myClass.myAbstractMethod();
    }
}
