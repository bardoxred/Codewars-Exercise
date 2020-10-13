import java.util.ArrayList;

public class ReverseLetter {
    public static void main(String[] args) {
        System.out.println(Solution.reverseLetter("ultr53o?n"));
    }

    static class Solution{
        public static String reverseLetter(final String str) {

            return new StringBuilder(str.replaceAll("[^a-zA-Z]","")).reverse().toString();

        }
    }
}
