import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumbersInStrings {
    public static void main(String[] args) {
        System.out.println(Solution.solve("lu1j8qbbb85"));
    }

    static class Solution {
        public static int solve(String s) {
            Pattern p = Pattern.compile("\\d+");
            Matcher m = p.matcher(s);
            int maxNum = 0;
            while (m.find()) {
                int num = Integer.parseInt(m.group());
                if (num > maxNum) {
                    maxNum = num;
                }
            }
            return maxNum;
        }
    }
}