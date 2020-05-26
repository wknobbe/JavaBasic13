public class GreaterThanY {
    public void greaterY(int[] arr, int Y){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > Y){
                count ++;
            }
        }
        System.out.println(count);
    }
}