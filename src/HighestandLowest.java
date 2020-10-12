import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HighestandLowest {
    public static void main(String[] args) {
        System.out.println(Solution.highAndLow("1 9 3 4 -5"));
    }
    static class Solution{

        public static String highAndLow(String numbers) {
            String [] str = numbers.split(" ");
            int[] arr = new int[str.length];
            for(int i=0; i<arr.length;i++){
                arr[i]=Integer.parseInt(str[i]);
            }
            Arrays.sort(arr);
            int low = arr[0];
            int high = arr[arr.length-1];
            return high +" "+ low;
        }

    }
}
