import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {

    public static void findEvenNums(int[] arr1){

        int temp = arr1[arr1.length - 1];

        for (int i = arr1.length -1; i > 0 ; i--){
            arr1[i] = arr1[i - 1];
        } 

        arr1[0] = temp;
       
    }

    public static void main (String[] args){

        int [] arr1 = {-9, 3, 2, -8, 12, -16};
        findEvenNums(arr1);
        Arrays.stream(arr1).forEach(System.out::println);

        

    }    
}
