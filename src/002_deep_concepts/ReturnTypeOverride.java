package simple_formal_deep_concepts;

class SuperReturnTypeOverride{
    protected int valSuper = 30;
    public Object getName(){
        System.out.println("Super Class");
        return new Object();
    }

    public String getSomething(Object o){
        return "Something from super";
    }

    private void printPrivate(){
        System.out.println("This is private super Method!");
    }
}
public class ReturnTypeOverride extends SuperReturnTypeOverride {
    public int val = 10;
    public String getName(String string){
        return "Hadush";
    }

    public String getSpecific(){
        return "Specific";
    }

    @Override
    public String getSomething(Object o){
        return "Something from child";
    }

    @Override
    public String getName(){
        return new String();
    }


    public static void main(String[] args) {
        ReturnTypeOverride returnTypeOverride = new ReturnTypeOverride();
        System.out.println(returnTypeOverride.getName("Hadush"));

        SuperReturnTypeOverride[] superReturnTypeOverrides = new SuperReturnTypeOverride[2];
        superReturnTypeOverrides[0] = new ReturnTypeOverride();
        superReturnTypeOverrides[1] = new SuperReturnTypeOverride();

        System.out.println(superReturnTypeOverrides[0].getName());

        //System.out.println(superReturnTypeOverrides[0].val);

        ReturnTypeOverride r1 = (ReturnTypeOverride) superReturnTypeOverrides[0];
        System.out.println(r1.getName("Hadush"));
        System.out.println(r1.getSpecific());
        System.out.println(r1.val);
        System.out.println(r1.getName());
        System.out.println(r1.valSuper);

        //System.out.println(superReturnTypeOverrides[0].getName("Hadush"));


    }
}
