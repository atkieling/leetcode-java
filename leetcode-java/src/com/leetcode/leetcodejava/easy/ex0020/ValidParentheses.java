package com.leetcode.leetcodejava.easy.ex0020;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String testString = "{[]}";

        System.out.println("A String " + testString + " é válida? " + isValidIdealSolution(testString));

        testString = "{[}]";
        System.out.println("A String " + testString + " é válida? " + isValidIdealSolution(testString));
    }

    public static boolean isValidBruteForceSolution(String input) {

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j <= input.length(); j += 2) {

                if (isValidSubstring(input.substring(i, j))) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean isValidSubstring(String input) {

        Stack<Character> stack = new Stack<>();

        for (char currentChar : input.toCharArray()) {

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (stack.isEmpty() || !isMatchingPair(stack.pop(), currentChar)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }

    public static boolean isValidIdealSolution(String input) {

        Stack<Character> stack = new Stack<>();

        for (char currentChar : input.toCharArray()) {

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (!stack.isEmpty() &&
                    ((currentChar == ')' && stack.peek() == '(') ||
                            (currentChar == '}' && stack.peek() == '{') ||
                            (currentChar == ']' && stack.peek() == '['))) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}

