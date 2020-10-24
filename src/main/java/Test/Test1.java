package Test;

import java.util.*;

public class Test1 {


    public static void main(String[] args) {

        int[] numberF       = { 0, -3, -8, 5, 1, 2, 3, 4  };
        double[] numberD    = { 0, 3.1, 1.4, 1.0, 1.1, 1.2, 1.3  };

        System.out.println(findMax(numberF));
        System.out.println(findMax(numberD));


    }



    public static int findMax(int[] numberF) {

//        int number1 = 0;
//        for (int i = 0; i < numberF.length; i++) {
//            if (numberF[i]>number1){
//                number1 = numberF[i];
//            }
//        }

        Arrays.sort(numberF);

        return numberF[numberF.length-1];
    }


    public static double findMax(double[] numberD) {
//        double number2 = 0.0;
//        for (int i = 0; i < numberD.length; i++) {
//            if (numberD[i]>number2){
//                number2 = numberD[i];
//            }
//        }

        Arrays.sort(numberD);
        return numberD[numberD.length-1];

    }



}


