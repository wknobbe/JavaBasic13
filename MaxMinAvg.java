
public class MaxMinAvg {
    public void calcStats(int[] arr){
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        int avg = sum / arr.length;
        System.out.println("Max: " + max + " Min: " + min + " Avg: " + avg);
    }
}