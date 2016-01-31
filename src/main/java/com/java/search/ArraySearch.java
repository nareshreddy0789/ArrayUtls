package com.java.search;

/**
 * Created by naresh on 1/27/2016.
 */
public class ArraySearch {

    public static boolean stringContainsItemFromList(String inputString, String[] items) {
        if(inputString != null && items !=null){
            for (int i = 0; i < items.length; i++) {
                if (inputString.contains(items[i])) {
                    return true;
                }
            }
        }
        return false;
    }
/*
    public static void main(String[] args) {
        String[] items = {"ew", "wewe", "wre"};
        String inputString = "ew";
        boolean search = stringContainsItemFromList(inputString, items);
        if (search) {
            System.out.println("present");
        } else {
            System.out.println("Not Present");
        }
    }*/

}