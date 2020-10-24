package Test;

public class Test5 {

    public static String clean (String text ,String badWord) {

                return text.replace(badWord, " ").replaceAll(" ", "");

        }

    public static void main(String[] args) {
        String text = "one two th ree two";
        String badWord = "two";
        String result = clean(text, badWord);
        System.out.println(result);
    }

}
