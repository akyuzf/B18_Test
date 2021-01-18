package Test;

/*
String str1="cat"
String str2="act"

Does str1 contains all str2??

 */

public class Test9 {

    /*
 // Creating array of string length
        char[] ch = new char[str.length()];

        // Copy character by character into array
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        // Printing content of array
        for (char c : ch) {
            System.out.println(c);
        }
 */

/*
 // Creating array and Storing the array
        // returned by toCharArray()
        char[] ch = str.toCharArray();

        // Printing array
        for (char c : ch) {
            System.out.println(c);
        }
 */
public static void main(String[] args) {

    String str3 = "cat";
    String str4 = "actb";

//    char[] charSearch = str4.toCharArray();

    for(int i=0; i<str3.length(); i++)
    {
       // char chr = str3.charAt(i);
        for(int j=0; j<str4.length(); j++)
        {
            if(str4.charAt(j) == str3.charAt(i))
            {
                System.out.println("Char Value "+str4.charAt(j)+" is present in "+str3);
            }

        }

    }


    String str = "Hello World!";
    if(str.contains("World"))
    {
        System.out.println("It is true");
    }
    else
    {
        System.out.println("It is false");
    }


    String str1 = "acat";
    String str2 = "acta";

//    char[] charArr1 = str1.toCharArray();
//    char[] charArr2 = str2.toCharArray();


    //to print array
//    System.out.println(charArr2);

    //to print each char separately
//    for ( char ch : charArr2 )
//    {
//        System.out.println(ch);
//    }

    System.out.println("----------");
    System.out.println( str2.charAt(0)) ;


    System.out.println("============");

    System.out.println(str2.indexOf('t'));
    System.out.println("==============");

//        if ( str1.contains("a") ) {
//            System.out.println("ok");    ;
//        } else {
//            System.out.println("n/a");
//        }

    for (int i = 0; i < str2.length() ; i++) {

        if (str1.indexOf(str2.charAt(i)) != -1) {
            System.out.println(str2.charAt(i)+" exists in str1");

        } else {
            System.out.println("NO!");
        }
    }





}

}
