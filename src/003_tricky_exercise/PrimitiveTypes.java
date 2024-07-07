package simple_formal_exercise;

public class PrimitiveTypes {
    public static void main(String[] args) {
        int a = new Integer(0);
        System.out.println(a);

        /*
         * If a floating number with more decimal points are given then it will be rounded to
         * a 7 digit where the 7th digit will be rounded of based on the value of the 8th digit(>=7)
         */
        float fNum = 143434234453242423543242343233443243434.12345676954345f;
        System.out.println("floating number: "+fNum);


        /*
         * The effect of precision
         */
        float x = 2.3456f;
        float y = 5.4193f;
        double x1 = 2.3456;
        double y1 = 5.4193;
        System.out.println("Floating res: "+x*y + " Double res: " + x1*y1);

        /*
         * compare int and float
         */

        float fVal = 6.3_4f;
        double dVal = 6.3_4;
        String sVal = "Hadush";
        boolean bVal = false;
        char cVal = 'A';
        char cVal2 = 'C';
        long lVal = 12_3;
        int iVal = 1_23;
        byte byVal = 1_27;
        short shVal = 127;

        //Compare int and long: could be true if they have the same value
        System.out.println("Int val: "+ iVal + " Long val: " + lVal);
        if( iVal == lVal){
            System.out.println("int and long are the same!");
        }

        //compare float and double: always false
        System.out.println("Float val: " + fVal + " Double val: " + dVal);
        if(fVal == dVal){
            System.out.println("float and double are the same!");
        }

        //Comapring short and Byte
        System.out.println("Byte val: " + byVal);
        if(byVal == shVal){
            System.out.println("Byte and Short have the same value!");
        }

        float tfVal = 12.0f;
        int tiVal = 12;
        double tdVal = 12.0;

        if(tiVal == tdVal){
            System.out.println("Float and int are equal");
        }

        float mfVal = 12.1f;
        double mdVal = 12.1;
        double mdVal1 = 12.34;

        System.out.println(mfVal*mdVal1 + " " +  mdVal*mdVal1);



    }
}
