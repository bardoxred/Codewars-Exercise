public class ReplaceLastFirst {

    public static void main(String[] args) {

        System.out.println(Solution.remove("anna"));

    }

    static class Solution{

        public static String remove(String str) {
            return str.substring(1,str.length()-1);
        }
    }
}
