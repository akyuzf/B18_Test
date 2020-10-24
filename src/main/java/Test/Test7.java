package Test;

public class Test7 {

    public static void main(String[] args) {

        String input = "abc123";
        System.out.println("Input is " + input);


        System.out.println("DrawDigits is " + extractNum(input));

        System.out.println("==============================");

        String alpha = "";
        String num = "";

        char[] c_arr = input.toCharArray();
        for (char each : c_arr) {
            if (Character.isDigit(each)) {
                num += each;
            } else {
                alpha += each;
            }
        }

        System.out.println("Alphabet: " + alpha);
        System.out.println("num: " + num);


 
    }




    public static String extractNum (String s) {

        String digits = "";
        for (int i = 0; i < s.length(); i++) {
            char chrs = s.charAt(i);
            if (Character.isDigit(chrs))
                digits += chrs;
        }
        return digits;
    }



//public static String extractNum (String s) {
//
//    String alpha = "";
//    String num = "";
//
//    char[] c_arr = s.toCharArray();
//    for (char each : c_arr) {
//        if (Character.isDigit(each)) {
//            num += each;
//        } else {
//            alpha += each;
//        }
//    }
//
//    return num;
//
//}


}


