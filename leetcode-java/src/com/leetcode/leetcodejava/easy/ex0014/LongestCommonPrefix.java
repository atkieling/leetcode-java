package com.leetcode.leetcodejava.easy.ex0014;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] array = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefixIdealSolution(array);

        System.out.println("O prefixo comum mais longo é: " + prefix);
    }

    public static String longestCommonPrefixBruteForceSolution(String[] array) {

        if (array == null || array.length == 0) {
            return "";
        }

        for (int i = 0; i < array[0].length(); i++) {

            char c = array[0].charAt(i);

            for (int j = 1; j < array.length; j++) {
                if (i == array[j].length() || array[j].charAt(i) != c) {
                    return array[0].substring(0, i);
                }
            }
        }

        return array[0];
    }

    public static String longestCommonPrefixIdealSolution(String[] array) {

        if (array == null || array.length == 0) {
            return "";
        }

        Arrays.sort(array);

        String first = array[0];
        String last = array[array.length - 1];
        int charIndex = 0;

        while (charIndex < first.length()) {
            if (first.charAt(charIndex) == last.charAt(charIndex)) {
                charIndex++;
            } else {
                break;
            }
        }

        return charIndex == 0 ? "" : first.substring(0, charIndex);
    }
}
