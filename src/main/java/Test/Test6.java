package Test;

public class Test6 {

    public static void main(String[] args) {

        String check = "Nur un";
        System.out.println(check);
     if (isPalindrome(check)){
         System.out.println("yes");
     } else{
         System.out.println("no");
     }


    }


    public static boolean isPalindrome( String check){

        String check2 = check.replace(" ", "");
        String reversedStr = "";

        for (int i = check2.length()-1; i >= 0 ; i--) {
            reversedStr += check2.charAt(i);
        }


        if ( reversedStr.equalsIgnoreCase(check2) ) {
            return true;
        } else {
            return false;
        }

    }




}
