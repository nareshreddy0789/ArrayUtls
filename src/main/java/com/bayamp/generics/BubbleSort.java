package com.bayamp.generics;

import java.util.Arrays;

/**
 * Created by naresh on 2/3/2016.
 */
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {

        int temp, i, j;
        for (i = 0; i < arr.length - 1; i++) {
        for (j = 1; j < arr.length - i; j++) {
        if (arr[j - 1] > arr[j]){
            temp = arr[j - 1] ;
            arr[j - 1] = arr[j];
             arr[j] = temp;
        }
        }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arrayList = {5, 3, 9, 7, 1, 8};
        System.out.println(Arrays.toString(bubbleSort(arrayList)));
    }
}