package com.sparta.nirel;

import com.sparta.nirel.completed.*;
import com.sparta.nirel.coreproject.ui.Factory;
import com.sparta.nirel.coreproject.ui.RandomArray;

import java.util.Scanner;

public class Start {


    public static void start() {
        Scanner keyIn = new Scanner(System.in);
        System.out.println("Please enter the the length you would like your array to be");
        int [] array = userChoiceArray(keyIn.nextInt());

        System.out.println("Please select a sort form the list below" +
                "\n 1.) Bubble Sort" +
                "\n 2.) Insertion Sort" +
                "\n 3.) Merge Sort" +
                "\n 4.) Quick Sort" +
                "\n 5.) Selection Sort" );
        userChoiceSort(keyIn.nextInt(),array);


    }


    public static void userChoiceSort(int userChoice, int[] array) {
        Factory.chooseSort(userChoice, array);
    }

    public static int[] userChoiceArray(int arrayLength) {
        return RandomArray.randArray(arrayLength);
    }

//     case 1:
//    Bubble bubble = new Bubble();
//    start = SpeedTest.startTime();
//                bubble.bubbleSort(intArray);
//                System.out.println(SpeedTest.totalTime(start));
//            case 2:
//    start = SpeedTest.startTime();
//                Insertion.insert(intArray);
//                System.out.println(SpeedTest.totalTime(start));
//            case 3:
//    start = SpeedTest.startTime();
//                Merge.Merge(intArray);
//                System.out.println(SpeedTest.totalTime(start));
//            case 4:
//    start = SpeedTest.startTime();
//                Quick.quickSort(intArray, 0, intArray.length - 1);
//                System.out.println(SpeedTest.totalTime(start));
//            case 5:
//    start = SpeedTest.startTime();
//                Selection.sortArray(intArray);
//                System.out.println(SpeedTest.totalTime(start));
//            case 6:
}
