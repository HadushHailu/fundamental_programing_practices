package simple_formal_reflection_nested;

class MyStatic{
    private String s = "Hello";
    MyStatic(){
        //access static methods in the usual way
    }

    static class MyStaticNestedClass{
        private int x = 0;
        static void myStaticMethod(){
            //compiler error --no access
            // String t = s

        }
    }

    private void myOtherMethod(){

    }
}

public class MyClassStatic{
    public static void main(String[] args) {
        MyStatic.MyStaticNestedClass cl = new MyStatic.MyStaticNestedClass();
        MyStatic m = new MyStatic();
        //The following is illegal-- compiler error
        //MyStatic.MyStaticNestedClass cl2 = m.new MyStaticNestedClass();

    }
}
