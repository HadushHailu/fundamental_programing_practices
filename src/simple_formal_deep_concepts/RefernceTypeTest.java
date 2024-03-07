package simple_formal_deep_concepts;

public class RefernceTypeTest {

    private int val;

    RefernceTypeTest(int val){this.val = val;}

    public static void swap(RefernceTypeTest a, RefernceTypeTest b){
        //a.val = b.val;
        RefernceTypeTest refernceType = a;
        refernceType.val = 40;
        System.out.println("a val: " + a.val);
    }

    public int getVal(){
        return val;
    }
    public static void main(String[] args) {
        Integer val;
        val = 7;
        System.out.println(val);

        RefernceTypeTest refernceType = new RefernceTypeTest(20);
        RefernceTypeTest refernceType1 = new RefernceTypeTest(21);

        System.out.println("ref1 val: " + refernceType.getVal());

        swap(refernceType, refernceType1);

        System.out.println("ref1 val: " + refernceType.getVal());


        //Conversion between reference types
        String s = new String("Hadush");
        Object o = s; // widening
        System.out.println(o); // Implicit call to toString()

        Object oo = new Object();
        //String ss = (String) oo; //ClassCastException
        Art art = new Drawing(12,14);

        if(art instanceof Drawing){
            System.out.println("hello");
            //Drawing drawing = (Drawing) art;
        }

        System.out.println(art.getClass());


    }
}
