import java.util.Arrays;

public class SimpleConsecutivePairs {

    public static void main(String[] args) {

        System.out.println(Solution.solve(new int[]{1,2,5,8,-4,-3,7,6,5}));
        System.out.println(Solution.solve(new int[]{21, 20, 22, 40, 39, -56, 30, -55, 95, 94}));
        System.out.println(Solution.solve(new int[]{81, 44, 80, 26, 12, 27, -34, 37, -35}));
    }

    static class Solution{

        public static int solve(int [] arr){
            int count = 0;
            for(int i=0; i<arr.length-1; i++){
                int temp = arr[i];
                if(i%2==0){
                    if(arr[i+1]-temp==1 || temp-arr[i+1]==1){
                        count++;
                    }
                }
            }

            return count;
        }

    }
}
