import java.util.Arrays;

public class SquareValues {
    public void squares(int[] arr){
        int[] x = arr;
        for (int i = 0; i < arr.length; i++){
            x[i] = x[i] * x[i];
        }
        System.out.println(Arrays.toString(x));
    }
}