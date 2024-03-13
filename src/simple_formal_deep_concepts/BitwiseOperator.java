package simple_formal_deep_concepts;


import java.util.Arrays;

public class BitwiseOperator {
    public char name;
    BitwiseOperator(){

    }

    public static void main(String[] args) {
        float fVal = 30.45f;
        int iVal = -7;

        System.out.println(Float.toString(fVal));
        System.out.println(Integer.toBinaryString(iVal));

        int iVal2 = 123_456_789_9;
        float fVal2 = iVal2;
        System.out.println(fVal2);

        double x = 9.9997;
        int nx = (int)Math.round(x);
        System.out.println(nx);

        int nx1 = 130;
        byte bx = (byte)nx1;
        System.out.println(bx);
        System.out.println(Integer.toBinaryString(126));

        byte x1 = 100;
        byte x2 = 100;
        byte x3 = (byte) (x1 + x2);
        System.out.println(x3);

        BitwiseOperator bitwiseOperator = new BitwiseOperator();
        System.out.println(bitwiseOperator.name);

        char c = 'A';
        int charC = c;
        System.out.println(Integer.toBinaryString(65));

        int[] arry1 = {1,2,3,4,5,6,7};
        int[] arry2 = new int[5];
        System.arraycopy(arry1, 0, arry2, 0, 5);
        System.out.println(Arrays.toString(arry2));

    }
}
