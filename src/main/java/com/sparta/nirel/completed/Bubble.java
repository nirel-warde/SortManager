package com.sparta.nirel.completed;

public class Bubble {
    public static int[] bubbleSort(int[] numArray) {
        for (int j = 0; j < numArray.length - 1; j++) {
            for (int i = 0; i < numArray.length - (1 + j); i++) {
                if (numArray[i] > numArray[i + 1]) {
                    int tempInt;
                    tempInt = numArray[i];
                    numArray[i] = numArray[i + 1];
                    numArray[i + 1] = tempInt;
                }
            }
        }
        return numArray;
    }
}
