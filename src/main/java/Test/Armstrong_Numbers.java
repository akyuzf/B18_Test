package Test;

import java.util.Scanner;

public class Armstrong_Numbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Pls enter a number : ");
        int number = scan.nextInt();

        int div;
        int rem;
        int total = 0;

        div = number; // number=153

                                         // 153    ->    15      ->          1
        while (div != 0)
        {
            rem = div % 10;              // 3         // 5                // 1
            total = total + rem*rem*rem; // 3*3*3=27  // 27+(5*5*5)=152   // 152+(1*1*1)=153
            div /= 10;                   // 15        // 1                // 0
        }

        if(total == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");



        System.out.println("===================");
        int num2 = 1;
        int rem2 = num2%10;
        int div2 = num2/10;
        System.out.println(rem2);
        System.out.println(div2);


    }
}
