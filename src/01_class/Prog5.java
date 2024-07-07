package simple_formal_projects_1;
import java.util.Arrays;

public class Prog5 {
    private static int[] combinedInt;
    private static int[] combine(int[] a, int[] b){
        combinedInt = new int[a.length + b.length];

        System.arraycopy(a, 0,combinedInt,0,a.length);
        System.arraycopy(b,0,combinedInt,a.length,b.length);
        return combinedInt;
    }
    public static void main(String[] argv){
        int[] a = {5,6,-4,3,1};
        int[] b = {3,8,9,11};
        int[] ret = Prog5.combine(a,b);
        System.out.println(Arrays.toString(ret));

    }
}
