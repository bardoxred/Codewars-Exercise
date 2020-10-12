import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(Solution.sortDesc(2314));

    }

    static class Solution{

        public static int sortDesc(final int num){

           String str = Integer.toString(num);
           char[] chars = str.toCharArray();
           Arrays.sort(chars);
           String sorted = String.valueOf(chars);

           StringBuilder sb = new StringBuilder();
           sb.append(sorted);
           sb.reverse();
           return Integer.valueOf(sb.toString());
        }

    }
}
