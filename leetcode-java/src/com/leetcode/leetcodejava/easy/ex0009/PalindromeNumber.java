package com.leetcode.leetcodejava.easy.ex0009;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 121;
        boolean result = isPalindromeIdealSolution(num);

        System.out.println("O número " + num + " é palíndromo? " + result);
    }

    public static boolean isPalindromeBruteForceSolution(int x) {

        String original = Integer.toString(x);
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }

    public static boolean isPalindromeIdealSolution(int x) {

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;

        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x = x / 10;
        }

        return x == revertedNumber || x == revertedNumber / 10;
    }
}
