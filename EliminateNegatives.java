import java.util.Arrays;

public class EliminateNegatives {
    public void elimnegs(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}