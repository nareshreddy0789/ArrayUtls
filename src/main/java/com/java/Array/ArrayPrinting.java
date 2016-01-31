package com.java.Array;
/*
 Created by naresh on 1/26/2016.*/

public class ArrayPrinting {
    public static void main(String[] args) {
        int[] myList = {2, 3, 4, 5};
        // Print all the array elements
        for (int a : myList) {
            System.out.println(a);

        }// / Summing all elements
       /* int total = 0;
        for (int add : myList) {
            total += add;
        }
        System.out.println("Total is " + total);*/
        // Finding the largest element
        int max = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] > max) max = myList[i];
        }
        System.out.println("Max is " + max);
    }
}


