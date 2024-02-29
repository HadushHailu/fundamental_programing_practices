package simple_formal_projects_1;

public class Prog1 {

    static int getRandomNumber(int x_init, int y_final){
        return RandomNumbers.getRandomInt(x_init,y_final);
    }

    static double computePiExpX(int x){
        return Math.pow(Math.PI, x);
    }

    static double computeXExpPi(int x){
        return Math.pow(x, Math.PI);
    }
    public static void main(String[] argv){
        //1. get a random number x in the range 1 .. 9 and compute π x .
        int x = 1, y = 9;
        int randVal = Prog1.getRandomNumber(x,y);
        System.out.println(Prog1.computePiExpX(randVal));

        //get a random number y in the range 3 .. 14 and compute y π .
        int x1 = 3;
        int y1 = 14;
        int randVal1 = Prog1.getRandomNumber(x1,y1);
        System.out.println(Prog1.computeXExpPi(randVal1));

    }
}
