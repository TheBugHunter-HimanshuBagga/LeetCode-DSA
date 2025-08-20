import java.util.Arrays;

public class arrays3 {
    public static void main(String[] args){

        int[] arr = new int[] {10,2,11,5,3};
        Arrays.sort(arr , 2 , arr.length  );
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
