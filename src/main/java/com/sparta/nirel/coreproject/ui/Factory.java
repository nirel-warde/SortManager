package com.sparta.nirel.coreproject.ui;

import com.sparta.nirel.completed.*;

public class Factory {

    private Factory() {

    }

    public static void chooseSort(int choice, int[] intArray) {
        long start;
        switch (choice) {
            case 1:
                Bubble bubble = new Bubble();
                start = SpeedTest.startTime();
                bubble.bubbleSort(intArray);
                System.out.println(SpeedTest.totalTime(start));
            case 2:
                start = SpeedTest.startTime();
                Insertion.insert(intArray);
                System.out.println(SpeedTest.totalTime(start));
            case 3:
                start = SpeedTest.startTime();
                Merge.Merge(intArray);
                System.out.println(SpeedTest.totalTime(start));
            case 4:
                start = SpeedTest.startTime();
                Quick.quickSort(intArray, 0, intArray.length - 1);
                System.out.println(SpeedTest.totalTime(start));
            case 5:
                start = SpeedTest.startTime();
                Selection.sortArray(intArray);
                System.out.println(SpeedTest.totalTime(start));
            case 6:
//                binary tree
            default:
                getDefaultMessage();


        }
    }

    private static String getDefaultMessage() {

        return "please select a sort from 1 to 6";


    }
}
