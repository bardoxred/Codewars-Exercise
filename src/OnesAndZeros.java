import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OnesAndZeros {
    public static void main(String[] args) {

        System.out.println(Solution.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,1,0,1))));

    }
    static class Solution{

        public static int ConvertBinaryArrayToInt(List<Integer> binary) {
            String result = binary.stream().map(n-> String.valueOf(n)).collect(Collectors.joining());
            return Integer.parseInt(result,2);
        }

    }
}
