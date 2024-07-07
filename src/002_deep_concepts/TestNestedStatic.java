package simple_formal_deep_concepts;

class MyOtherClass{
    private String s = "Heloo";
    static int x = 7;
    MyOtherClass(){
        MyOtherClass.MyInnerClass myInnerClass = new MyOtherClass.MyInnerClass();
        MyInnerClass.staticMethod();
        myInnerClass.myOtherMethod();

    }

    public String add(){
        class innerLocalClass{
            public int y = 20;

            public String add(){
                return s + x;
            }
        }
        innerLocalClass innerLocalClass = new innerLocalClass();
        return innerLocalClass.add();
    }

    public class MyInnerClass{
        private String st = s;
        private static int iVal;

        static void staticMethod(){
            System.out.println("inner member class: my static method");
        }
        public void myOtherMethod(){
            System.out.println("inner Memeber class: My other method");
        }
    }

    static class MyStaticClass{
        private int i = 9;
        static void myStaticMethod(){
            int y = x;
            System.out.println("Nested static class: my static method");
        }

        public void myOtherMethod(){
            System.out.println("Nested static class: My other method");
        }
    }
}
public class TestNestedStatic {
    public static void main(String[] args) {
        MyOtherClass myOtherClass = new MyOtherClass();
        MyOtherClass.MyStaticClass myStaticClass = new MyOtherClass.MyStaticClass();


        MyOtherClass.MyStaticClass.myStaticMethod();
        myStaticClass.myOtherMethod();
        //
        MyOtherClass.MyInnerClass myInnerClass = myOtherClass.new  MyInnerClass();
        //
        System.out.println(myOtherClass.add());
    }
}
