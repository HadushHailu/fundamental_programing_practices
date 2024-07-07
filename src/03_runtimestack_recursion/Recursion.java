package simple_formal_projects_3;

public class Recursion {
    public static void main(String[] args) {
        int num = 5768;
        reverseInt(num);

        int numDigits = 123;
        System.out.println("\nCount of digits: " + countDigits(numDigits) );

        int[] intArray = {6,1,2,3};
        System.out.println("Total sum: " + sumArray(intArray, intArray.length));

    }

    public static void reverseInt(int num){
        if(num < 10){
            System.out.print(num);
            return;
        }
        int fract = num%10;
        num = num/10;
        System.out.print(fract);
        reverseInt(num);
    }

    public static int countDigits(int num){
        if(num < 10){
            System.out.println("\ncount is: " + 1);
            return 1;
        }
        int fract = num%10;
        num = num/10;
        int count = 1 + countDigits(num);
        System.out.println("count is: " + count);
        return count;
    }

    public static int sumArray(int[] intArray, int pointer){
        if(pointer == 1){
            return intArray[pointer-1];
        }else{
            return intArray[pointer-1] + sumArray(intArray, pointer-1);
        }
    }
}
