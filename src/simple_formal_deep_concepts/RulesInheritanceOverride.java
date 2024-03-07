package simple_formal_deep_concepts;

interface interfaceAllrules{
    public static final int ival = 10;
    public static final int sVal = 12;
    public abstract void sayInterface();
    public default void defaultInterfaceMethod(){
        System.out.println("Default Interface Method");
    }

    public static void staticInterfaceMethod(){
        System.out.println("Static Interface Method");
    }
}

abstract class AbstractAllRules implements interfaceAllrules{
    public int a = 10;
    abstract void saySomething();

}


public class RulesInheritanceOverride extends AbstractAllRules{


    @Override
    public void defaultInterfaceMethod(){
        System.out.println("Default interface method in child");
    }
    @Override
    public void sayInterface(){
        System.out.println("Say interface is implemented!");
    }
    @Override
    void saySomething(){
        System.out.println("I am a method from child class: " + a);
    }
    public static void main(String[] args) {
        RulesInheritanceOverride allRule = new RulesInheritanceOverride();
        allRule.saySomething();
        allRule.sayInterface();

        AbstractAllRules[] abstractAllRules = new AbstractAllRules[2];
        abstractAllRules[0] = allRule;

        //Call static interface

        abstractAllRules[1] = new AbstractAllRules() {
            private int a = 10;
            @Override
            void saySomething() {
                System.out.println("Anonymous saySomething");
            }

            @Override
            public void sayInterface() {
                System.out.println("Anonymous sayInterface");
            }
        };

        for (AbstractAllRules ab: abstractAllRules)
            System.out.println(ab.getClass());

        System.out.println(abstractAllRules[1].a);
        //System.out.println(abstractAllRules[1] instanceof RulesInheritanceOverride);

        abstractAllRules[0].defaultInterfaceMethod();
        abstractAllRules[1].defaultInterfaceMethod();

        interfaceAllrules.staticInterfaceMethod();

        String s = abstractAllRules[0] + " @mine";
        System.out.println(s);

    }
}
