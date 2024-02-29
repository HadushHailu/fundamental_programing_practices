package simple_formal_projects_1;
import java.util.Arrays;

final public class Prog3 {

    private static String[] noDupsArray;
    private static String[] removeDups(String[] input_array){
        int countRedu = 0;

        //Count Redundancy
        for(int i=0; i<input_array.length; i++){
            for(int j=i+1; j<input_array.length; j++){
                if(input_array[i].equals(input_array[j])){
                    countRedu++;
                }
            }
        }

        //Populate only unique strings
        String[] newString = new String[input_array.length-countRedu];
        int newStringIndex = 0;
        boolean isRedu = false;

        for(int i=0; i<input_array.length; i++){
            isRedu = false;
            for(int j=i+1; j<input_array.length; j++){
                if(input_array[i].equals(input_array[j])){
                    isRedu = true;
                    break;
                }
            }

            if(!isRedu) {
                newString[newStringIndex] = input_array[i];
                newStringIndex++;
            }

        }

        //System.out.println(Arrays.toString(newString));
        noDupsArray = newString;
        return noDupsArray;
    }
    public static void main(String[] argv){
        String[] name1 = {"cat", "dog", "dog", "cow"};

        String[] ret = Prog3.removeDups(name1);
        System.out.println(Arrays.toString(ret));
    }
}
