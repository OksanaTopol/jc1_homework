package second.task22;

import java.util.Arrays;

public class PerevernytyjMassiv {
    public static void main(String[] args) {

        int[] myArray;
        myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i <myArray.length; i++) {
            System.out.print(myArray[i]+" ");
        }

        System.out.println();

        for (int i = 9; i >=0; i--) {
            System.out.print(myArray[i]+" ");
        }

    }
}
