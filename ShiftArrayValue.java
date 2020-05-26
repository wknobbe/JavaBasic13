import java.util.Arrays;

public class ShiftArrayValue {
    public void shift(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println(Arrays.toString(arr));
    }
}