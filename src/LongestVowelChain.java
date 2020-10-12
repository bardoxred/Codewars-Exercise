public class LongestVowelChain {

    public static void main(String[] args) {
        System.out.println(Solution.solve("codewarriors"));
    }

    static class Solution{

        public static int solve(String s){

            int count = 0;
            int result = 0;

            char [] chars = s.toCharArray();

            for(int i=0; i<s.length(); i++){

                if(isVovel(chars[i])){
                    count++;
                }
                else {
                    result = Math.max(count, result);
                    count = 0;
                }
            }
            return Math.max(count,result);
        }

        public static boolean isVovel(char c){
            return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
        }

    }
}
