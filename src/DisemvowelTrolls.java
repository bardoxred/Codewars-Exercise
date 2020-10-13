public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(Solution.disemvowel("This website is for losers LOL!"));
    }
    static class Solution{

        public static String disemvowel(String str) {
            return str.replaceAll("[AaEeIiOoUu]", "");
        }
    }
}
