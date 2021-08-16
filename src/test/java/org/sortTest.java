package org;

import com.sparta.nirel.completed.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class sortTest {
    @Test
    public void testBubbleOdd() {
        int[] array = {5, 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(Bubble.bubbleSort(array), sortedArray);
    }

    @Test
    public void testMergeOdd() {
        int[] array = {5, 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};


//        Assertions.assertArrayEquals(Merge.Merge(array), sortedArray);
    }

    @Test
    public void testQuickOdd() {
        int[] array = {5, 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(Quick.quickSort(array, 0, array.length - 1), sortedArray);
    }

    @Test
    public void testSelectOdd() {
        int[] array = {5, 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(Selection.sortArray(array), sortedArray);
    }

    @Test
    public void testInsertionOdd() {
        int[] array = {5, 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(Insertion.insert(array), sortedArray);
    }
  @Test
    public void testBubbleEven() {
      int[] array = { 4, 3, 2, 1};
      int[] sortedArray = {1, 2, 3, 4};

        Assertions.assertArrayEquals(Bubble.bubbleSort(array), sortedArray);
    }

    @Test
    public void testMergeEven() {
        int[] array = { 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4};


//        Assertions.assertArrayEquals(Merge.Merge(array), sortedArray);
    }

    @Test
    public void testQuickEven() {
        int[] array = { 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4};
        Assertions.assertArrayEquals(Quick.quickSort(array, 0, array.length - 1), sortedArray);
    }

    @Test
    public void testSelectEven() {
        int[] array = { 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4};
        Assertions.assertArrayEquals(Selection.sortArray(array), sortedArray);
    }

    @Test
    public void testInsertionEven() {
        int[] array = { 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4};
        Assertions.assertArrayEquals(Insertion.insert(array), sortedArray);
    }


    @Test
    public void testEmptyBubble() {
        int[] array = {0};
        int[] sortedArray = {0};

        Assertions.assertArrayEquals(Bubble.bubbleSort(array), sortedArray);
    }

    @Test
    public void testEmptyMerge() {
        int[] array = {0};
        int[] sortedArray = {0};


//        Assertions.assertArrayEquals(Merge.Merge(array), sortedArray);
    }

    @Test
    public void testEmptyQuick() {
        int[] array = {0};
        int[] sortedArray = {0};
        Assertions.assertArrayEquals(Quick.quickSort(array, 0, array.length - 1), sortedArray);
    }

    @Test
    public void testEmptySelect() {
        int[] array = {};
        int[] sortedArray = {};
        Assertions.assertArrayEquals(Selection.sortArray(array), sortedArray);
    }

    @Test
    public void testEmptyInsertion() {
        int[] array = {};
        int[] sortedArray = {};
        Assertions.assertArrayEquals(Insertion.insert(array), sortedArray);
    }
    @Test
    public void testSortedBubble() {
        int[] array = {1, 2, 3, 4, 5};
        int[] sortedArray = {1, 2, 3, 4, 5};

        Assertions.assertArrayEquals(Bubble.bubbleSort(array), sortedArray);
    }

    @Test
    public void testSortedMerge() {
        int[] array = {1, 2, 3, 4, 5};
        int[] sortedArray = {1, 2, 3, 4, 5};


//        Assertions.assertArrayEquals(Merge.Merge(array), sortedArray);
    }

    @Test
    public void testSortedQuick() {
        int[] array = {1, 2, 3, 4, 5};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(Quick.quickSort(array, 0, array.length - 1), sortedArray);
    }

    @Test
    public void testSortedSelect() {
        int[] array = {1, 2, 3, 4, 5};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(Selection.sortArray(array), sortedArray);
    }

    @Test
    public void testSortedInsertion() {
        int[] array = {1, 2, 3, 4, 5};
        int[] sortedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(Insertion.insert(array), sortedArray);
    }




}