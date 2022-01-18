package java_8_exmp.udemy.Interview_tasks;

import java.util.Arrays;

public class FindLargeCombinationFromBigArray {
    public static void main(String[] args) {
        int[] arrayVal = {1, 2, 10, -11, 5, 2};


        int finalLargeTotal = 0;
        int[] finalArr = null;
        for (int i=0; i<arrayVal.length; i++) {
            for (int j=i; j< arrayVal.length; j++) {
               int[] subArra = Arrays.copyOfRange(arrayVal, i, j);
                System.out.println("subarray : "+Arrays.toString(subArra));
               int totalVal = 0;
               for (int k =0; k<subArra.length; k++) {
                   totalVal += subArra[k];
               }
                System.out.println(" val : "+totalVal);
                if (totalVal > finalLargeTotal) {
                    finalLargeTotal = totalVal;
                    finalArr = subArra;
                }
            }
        }
        System.out.println("large final total : "+finalLargeTotal);
        System.out.println("final array : "+Arrays.toString(finalArr));


    }
}
