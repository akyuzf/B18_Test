package Test;

import java.util.Arrays;

public class Test2 {
    /*
    mergR([1,2,3],[4,5,6])
    returns [1,2,3,4,5,6]

    mergR([1,2],[6,8])
    returns [1,2,6,8]
     */

    public static int[] mergR(int[] a,int[] b) {

        int[] mergedArr = new int[a.length+b.length];


        for (int i=0; i< a.length; i++ ) {

            mergedArr[i] = a[i];
        }
            for (int j = 0; j < b.length; j++) {

                mergedArr[j+a.length] = b[j];

        }

        return mergedArr;
    }



    public static void main(String[] args) {

              System.out.println(Arrays.toString(mergR( new int[]{1, 2, 3}, new int[]{4, 5, 6}) ) );

    }

}











