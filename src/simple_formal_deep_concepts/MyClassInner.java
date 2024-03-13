package simple_formal_deep_concepts;

import simple_formal_reflection_nested.MyClass;
class Outsider{
    Outsider(){
        MyClassInner myClassInner = new MyClassInner();
        MyClassInner.MyInner myInner = myClassInner.new MyInner();
        MyClassInner.MyInner.MyInnerInner myInnerInner = new MyClassInner.MyInner.MyInnerInner();
        MyClassInner.myInnerStatic myInnerStatic = new MyClassInner.myInnerStatic();

    }
}
public class MyClassInner {
    private MyInner myInner;
    private static int myOuterInt = 10;

    MyClassInner(){
        myInner = new MyInner();
    }
    public MyInner getMyInner(){
        return myInner;
    }

    static class myInnerStatic{

    }
    public class MyInner{
        private int innerInt;
        MyInner(){
            innerInt = myOuterInt;
        }

        public static class MyInnerInner{
            private int innerInnerInt;
            MyInnerInner(){
                innerInnerInt = myOuterInt;
            }
        }
    }

    public static void main(String[] args) {
        MyClassInner myClassInner = new MyClassInner();
        MyClassInner.MyInner myInner1 = myClassInner.new MyInner();
        MyClassInner.MyInner.MyInnerInner myInnerInner = new MyInner.MyInnerInner();
        MyClassInner.myInnerStatic myInnerStatic = new myInnerStatic();


        System.out.println(myInner1.innerInt);



    }
}
