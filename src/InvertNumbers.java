import java.util.Arrays;

public class InvertNumbers {
    public static void main(String[] args) {
        int[] input = new int[] {-1,-2,3,-4,-5};
        System.out.println(Arrays.toString(Solution.invert(input)));
    }
    static class Solution{

        public static int[] invert(int[] array) {

            for(int i=0; i<array.length;i++){
                array[i]=array[i]*(-1);
            }
            return array;
        }
    }
}
