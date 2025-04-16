package org.example;

public class RomanNumeral {
    public static String toRoman(int n) {
        if (n < 1 || n > 3999) {
            throw new IllegalArgumentException("n must be between 1 and 3999");
        }

        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < symbols.length; i++) { // Loop corrected here
            while (n >= values[i]) { // Continue until the number is smaller than the value
                sb.append(symbols[i]);
                n -= values[i]; // Subtract the value from the number
            }
        }
        return sb.toString();
    }
}
