public class HungarianVowel {
    public static void main(String[] args) {
        System.out.println(Solution.dative("úr"));
    }
    static class Solution{

        public static String dative(String word) {
            char[] chars = word.toCharArray();
            for(int i=chars.length-1;i>=0;i--){
                if(isNak(chars[i])){
                    word = word+"nak";
                    break;
                }
                else if(isNek(chars[i])){
                    word = word+"nek";
                    break;
                }
            }
            return word;
        }


        public static boolean isNek(char c){
            return (c=='e' || c=='é' || c=='i' || c=='í' || c=='ö' || c=='ő' || c=='ü' || c=='ű');
        }
        public static boolean isNak(char c){
            return (c=='a' || c=='á' || c=='ó' || c=='o' || c=='u' || c=='ú');
        }

    }
}
