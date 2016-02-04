package com.bayamp.generics;

/**
 * Created by naresh on 2/3/2016.
 */
public class BinarySearch {
    public static boolean binarySearch(int[] data,
                                int size, int key) {
        int low = 0;
        int high = size - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (data[middle] == key) {
                return true;

            }
            if (data[middle] < key) {
                low = middle + 1;
            }
            if (data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arrayList = {5, 3, 9, 7, 1, 8};
        int key = 1;
        int size = arrayList.length;
        boolean asd = binarySearch(arrayList,key,size);
        System.out.println(asd);
    }
}


