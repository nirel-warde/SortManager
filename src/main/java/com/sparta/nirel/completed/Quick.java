package com.sparta.nirel.completed;

public class Quick {
    public Quick() {

    }
    public static int[] quickSort(int[] numArray, int left, int right) {
        if (left >= right) {
            return numArray;
        }
        int pivot = numArray[left + (right-left)/2];
        int index = partition(numArray, left, numArray.length-1,pivot);
        quickSort(numArray, left, index-1);
        quickSort(numArray, index, right);

        return numArray;

    }



    private static void swapValues(int[] numArray, int num1, int num2) {
        int temp = numArray[num1];
        numArray[num1] = numArray[num2];
        numArray[num2] = temp;
    }

    public static int partition(int[] numArray, int left, int right, int pivot) {


        while (left <= right) {
            while (numArray[left] < pivot) {
                left++;
            }
            while (numArray[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swapValues(numArray, left, right);
                left++;
                right--;
            }

        }
        return left;
    }


}
