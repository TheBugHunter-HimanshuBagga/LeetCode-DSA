import java.util.ArrayList;
import java.util.Arrays;

public class arrays2 {
    
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Array elements:" + arr.size());
        for(int nums : arr){
            System.out.print(" " + nums);
        }
    
}
}
