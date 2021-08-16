package com.sparta.nirel.completed;

public class Insertion {


    public static int[]  insert(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    private static void swap(int[] numArray, int num1, int num2) {
        int temp = numArray[num1];
        numArray[num1] = numArray[num2];
        numArray[num2] = temp;
    }
}
