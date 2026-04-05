package org.example;

import java.util.Locale;
import java.util.Stack;

public class Main {

    public static boolean checkForPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String cleaned = input
                .toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z0-9]", "");

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("INPUT   = " + input);
        System.out.println("CLEANED = " + cleaned);
        System.out.println("REVERSE = " + reversed);
        System.out.println("RESULT  = " + cleaned.equals(reversed.toString()));
        System.out.println("------------------------");

        return cleaned.equals(reversed.toString());
    }

    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}