package simple_formal_deep_concepts;

class SuperClass{
    protected void superMethod(){
        System.out.println("My supperClass superMethod");
    }
}

public class OnlyOneDefaultClass extends SuperClass{
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.superMethod();
    }
}
