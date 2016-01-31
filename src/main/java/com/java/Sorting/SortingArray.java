package com.java.Sorting;

import java.util.Arrays;

/**
 * Created by naresh on 1/27/2016.
 */

public class SortingArray {

    public static void main(String args[]) {
        int data[] = {4, -5, 2, 6, 1};
        Arrays.sort(data);
        for (int c : data) {
            System.out.println(c);
        }
    }
}

