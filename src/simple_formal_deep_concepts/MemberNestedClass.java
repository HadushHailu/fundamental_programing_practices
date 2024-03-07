package simple_formal_deep_concepts;

import simple_formal_exercise.MyInterface;

class InnerClassInstance{
    MemberNestedClass.MyInnerClass myInnerClass1;
    MemberNestedClass.MyInnerClass myInnerClass2;
    MemberNestedClass memberNestedClass;
    InnerClassInstance(){
        MemberNestedClass memberNestedClass = new MemberNestedClass("Hadush");
        MemberNestedClass.MyInnerClass myInnerClass1 = memberNestedClass.new MyInnerClass("From outside");
        MemberNestedClass.MyInnerClass myInnerClass2 = memberNestedClass.new MyInnerClass("From outside");
        //MemberNestedClass.MyInnerClass myInnerClass1 = new MemberNestedClass.MyInnerClass(); //new requires an enclosing instance
    }

    public void saySomething(){
       memberNestedClass.outerMethod();
       myInnerClass1.innerMethod();
       myInnerClass2.innerMethod();
    }
}

public class MemberNestedClass {
    private MyInnerClass myInnerClass;
    private String param;

    static void staticOuterMethod(){
        MyInnerClass.staticInnerMethod();
        //System.out.println(MemberNestedClass.this.myInnerClass.intParam);
    }
    void outerMethod(){
        System.out.println(myInnerClass.intParam);
        System.out.println(this.myInnerClass.intParam);
        myInnerClass.innerMethod();
    }
    MemberNestedClass(String param){
        myInnerClass = new MyInnerClass("innerStr");
        this.param = param;
    }

    public class MyInnerClass{
        private String intParam;
        MyInnerClass(String intParam){
            this.intParam = intParam;
        }

        void innerMethod(){
            System.out.println("Enclosing param: " + param);
            //System.out.println(this.intParam);
            //System.out.println(MyInnerClass.this.intParam);
            //System.out.println(MemberNestedClass.this.param);
        }

        static void staticInnerMethod(){
            System.out.println("static inner method");
        }

    }

    public static void main(String[] args) {
        (new MemberNestedClass("OuterStr")).outerMethod();
        MemberNestedClass.MyInnerClass.staticInnerMethod();
        MemberNestedClass.staticOuterMethod();
        MyInnerClass.staticInnerMethod();

        //
        InnerClassInstance innerClassInstance = new InnerClassInstance();

        //
        InnerClassInstance innerClassInstance1 = new InnerClassInstance();
        innerClassInstance1.saySomething();
    }
}
