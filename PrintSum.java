public class PrintSum {
    public void printSum(){
        int sum = 0;
        for (int i = 0; i < 256; i ++){
            sum += i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }
}