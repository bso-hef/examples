package de.bso.java.examples.arrays;

public class ArrayOfPrimitives {

    public static void main(String[] args) {
        int[] testArray = new int[5];

        for (int i = 0; i < testArray.length; i++){
            System.out.println(testArray[i]);
        }


        for (int element : testArray) {
            System.out.println(element);
        }

        testArray[0] = 1;
        testArray[1] = 10;
        testArray[2] = 3;

        int[] testArray1 = { 1, 10, 3};

    }
}
