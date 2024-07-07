package simple_formal_projects_1;

public class Prog6 {

    static int min(int[] arrayOfInts){
        int min = arrayOfInts[0];

        for(int i: arrayOfInts){
            if(i<min){
                min = i;
            }
        }

        return min;

    }
    public static void main(String[] argv){
        int[] a = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println(Prog6.min(a));

    }
}
