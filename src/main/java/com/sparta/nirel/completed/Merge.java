package com.sparta.nirel.completed;

import java.util.Arrays;

public class Merge {


    public static void Merge(int[] numArray) {
        int[] tempArray = new int[numArray.length];
        splitMerge(numArray, tempArray, 0, numArray.length -1);
    }

    private static void splitMerge(int[] mainArray, int[] tempArray, int leftStart, int rightEnd) {

        if (leftStart>=rightEnd) {
            return;
        }

        int midPoint = (leftStart + rightEnd) / 2;
        mergeSort(mainArray, tempArray, leftStart, midPoint);
        mergeSort(mainArray, tempArray, midPoint + 1, rightEnd);
        mergeSort(mainArray, tempArray, leftStart, rightEnd);


    }

    private static int[] mergeSort(int[] array, int[] tempArray, int leftStart, int rightEnd) {

        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;
        int size = rightEnd -leftStart +1;

        while (left <= leftEnd && right <= rightEnd) {

            if (array[left] <= array[right]) {

                tempArray[index] = array[left];
                left++;
            } else {
                tempArray[index] = array[right];
                right++;
            }
            index++;

        }
        System.arraycopy(array, left,tempArray,index, leftEnd - left+1);
        System.arraycopy(array, right,tempArray,index, rightEnd - right+1);
        System.arraycopy(tempArray, leftStart,array,leftStart, size);
        displayArray(array);
        return array;
    }

    private static void  displayArray(int[] displayArray) {
        System.out.println(Arrays.toString(displayArray));
    }
}
