package simple_formal_exercise;

public class RecursiveCountdown {
    public static void main(String[] args) {
        System.out.println(len("Orange"));
        countDown(4);
        printCharsReverse("APPLE");
        System.out.println("End of Main Method.");

        System.out.println(fact(5));
    }

    public static int fact(int num){
        if(num ==1 || num == 0){
            return 1;
        }
        return num * fact(num-1);
    }

    public static void printCharsReverse(String str){
        if(str == null || str.isEmpty()){
            return;
        }else{
            printCharsReverse(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }
    public static int len(String str){
        if(str == null || str.length() == 0){
            return 0;
        }else{
            int sum = 1 + len(str.substring(1));
            return sum;
        }

    }

    public static void countDown(int num){
        System.out.println("Beginning of method countDown("+ num +").");
        if(num <= 0){
            System.out.println("END");
        }else{
            System.out.println(num);
            countDown(num-1);
        }
        System.out.println("Method end of countDown("+ num +").");
    }
}
