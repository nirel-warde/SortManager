package com.sparta.nirel.coreproject.ui;

public class RandomArray {
    public static int[] randArray(int arrayLength) {
        int[] intArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = (int)(Math.random() * 100) +1;

        }
        return intArray;
    }
}
