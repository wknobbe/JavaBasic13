import java.util.ArrayList;

public class ArrayWithOdds {
    public void oddsArray(){
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i < 256; i+= 2){
            y.add(i);
        }
        System.out.println(y);
    }
}