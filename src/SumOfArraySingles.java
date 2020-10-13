import java.util.ArrayList;
import java.util.Arrays;

public class SumOfArraySingles {
    public static void main(String[] args) {

        System.out.println(Solution.repeats(new int []{4,5,7,5,4,8}));

    }
    static class Solution{

        public static int repeats(int [] array){
            Arrays.sort(array);
            int sum=array[0];
            for(int a=1;a<array.length;a++){
                if(array[a]==array[a-1])
                    sum-=array[a];
                else
                    sum+=array[a];
            }
            return sum;
        }

    }
}
