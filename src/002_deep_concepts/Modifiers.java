package simple_formal_deep_concepts;

class WhatsThere{
    public int valPublic = 6;
    int valDefault = 7;
    protected int valProtected = 8;
    private int valPrivate;

    protected void saySomething(){
        System.out.println("I am what is there");
    }
}
public class Modifiers extends WhatsThere{

    Modifiers(){
        saySomething();
    }
    void printVals(){
        System.out.println(super.valDefault);
        System.out.println(super.valProtected);
        System.out.println(super.valPublic);
        //System.out.println(valPrivate);
    }
    public static void main(String[] args) {
        WhatsThere whatsThere = new WhatsThere();
        System.out.println(whatsThere.valPublic);
        System.out.println(whatsThere.valDefault);
        System.out.println(whatsThere.valProtected);
        //System.out.println(whatsThere.valPrivate);

        Modifiers modifiers = new Modifiers();

    }
}
