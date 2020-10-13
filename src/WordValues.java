import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WordValues {

    public static void main(String[] args) {

        int[] s = Solution.nameValue(new String[]{"abc", "bbb"});
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }

    }

    static class Solution{

        public static int [] nameValue(String [] arr){

            List<Character> list = new LinkedList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
            int[] sums = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (char character : arr[i].toCharArray()) {
                    sum += list.indexOf(character) + 1;
                }
                sums[i] = sum * (i + 1);
            }
            return sums;
        }
    }
}

