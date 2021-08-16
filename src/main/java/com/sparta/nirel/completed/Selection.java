package com.sparta.nirel.completed;

import java.util.Arrays;

public class Selection {

    public static int[] sortArray(int[] array) {
        if (array.length <= 0) {
            return array;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array[4]);
        int pointer = 0;
        int swappedIntTemp = 0;

        for (int i = 0; i < array.length; i++) {
            int smallest = array[i];
            pointer = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < smallest) {
                    smallest = array[j];
                    pointer = j;
                }

            }
//                swap
            if (smallest < array[i]) {
                swappedIntTemp = array[i];
                array[i] = smallest;
                array[pointer] = swappedIntTemp;


            }
//            }

//            if(smallest==array[i])

        }
        return array;
    }
}
