package Test;

public class Test4 {

    public static boolean isError(String line)
    {
        if (line.startsWith("error") ){
            return true;
        } else{
            return false;
        }


    }

    public static void main(String[] args) {
        String line = "one two error";

        System.out.println(isError(line));


    }


}
