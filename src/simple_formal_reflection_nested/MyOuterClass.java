package simple_formal_reflection_nested;

public class MyOuterClass {
    MyInnerClass myInnerClass;
    private String param;

    MyOuterClass(String param){
        myInnerClass = new MyInnerClass("innerStr");
        this.param = param;
    }

    void outerMethod(){
        System.out.println(myInnerClass.innerParam);
        myInnerClass.innerMethod();
        //String t = myInnerClass.this.innnerParam //compile error
    }

    public static void main(String[] args) {
        (new MyOuterClass("outerStr")).outerMethod();
    }
    class MyInnerClass{
        private String innerParam;
        MyInnerClass(String innerParam){
            //the inner class version of 'this'
            this.innerParam = innerParam;
        }

        void innerMethod(){
            //accessing enclosing class's version of this
            System.out.println(MyOuterClass.this.param);
            //same as the following
            System.out.println(param);
        }
    }
}
