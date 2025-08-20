import java.util.ArrayList;

public class arrays1 {
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        System.out.println("Array elements:" + arr.size());
        for(int nums : arr){
            System.out.print(" " + nums);
        }
    }
}
