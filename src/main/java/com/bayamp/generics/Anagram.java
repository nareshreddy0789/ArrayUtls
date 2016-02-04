package com.bayamp.generics;

import java.util.Arrays;

/**
 * Created by naresh on 2/4/2016.
 */
public class Anagram {
    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
    public static void main(String[] args) {
        String a1 = "asdf";
        String a2 = "fdswa";
        boolean asd = isAnagram(a1,a2);
        System.out.println(asd);
    }
}
