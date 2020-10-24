package Test;

public class Test3 {

    public static String reverse(String input) {

        String reversedString = "";

        for (int i = input.length()-1; i >= 0; i--) {
            reversedString += input.charAt(i);
        }

        return reversedString;

    }


    public static void main(String[] args) {
        String input = "abcde";
        System.out.println(input);
        System.out.println("============");
        System.out.println(reverse(input));
    }

}
