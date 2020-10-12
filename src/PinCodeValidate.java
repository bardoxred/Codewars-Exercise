public class PinCodeValidate {

    public static void main(String[] args) {

        System.out.println(Solution.validatePin("123423"));

    }

    static class Solution{

//        ^(\d)(?!\1+$)\d{5}$
        public static boolean validatePin(String pin) {
            if(pin.matches("\\d{4}+|\\d{6}+"))return true;
            else return false;
        }
    }
}
