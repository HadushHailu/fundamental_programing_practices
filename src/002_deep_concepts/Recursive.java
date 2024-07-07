package simple_formal_deep_concepts;

public class Recursive {
    static void CountDown(int num){
        if(num == 1){
            System.out.print(num + " ");
        }else{
            System.out.print(num + " ");
            CountDown(num-1);
        }
    }

    public static void main(String[] args) {
        Recursive.CountDown(5);
    }
}
