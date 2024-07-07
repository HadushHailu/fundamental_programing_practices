package simple_formal_exercise;

public class MyConcrete extends MyAbstract{
    MyConcrete(int value){
        super(value);
    }

    @Override
    public void abstractMethod(){
        System.out.println("Implementation of abstract method");
    }

    public static void staticMethod(){
        System.out.println("Static method override");
    }

    public static void main(String[] args) {
        MyConcrete.staticMethod();

        MyConcrete myConcrete = new MyConcrete(12);
        myConcrete.instanceMethod();
        myConcrete.abstractMethod();
        System.out.println(myConcrete.getClass().getSimpleName());

    }
}
