public class Banjo {
    public static void main(String[] args) {
        System.out.println(Solution.areYouPlayingBanjo("Eas"));
    }
    static class Solution{
        public static String areYouPlayingBanjo(String name) {
            if(name.startsWith("R")||name.startsWith("r")){
                return name+" plays banjo";
            }
            else {
                return name+ " does not play banjo";
            }
        }
    }
}
