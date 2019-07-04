package com.flopez;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        System.out.print("Please write a number: ");
        Scanner scanner = new Scanner(System.in);
        final String s = scanner.nextLine();
        try {
            final Integer input = Integer.valueOf(s);
            final String output = stringifyNumber(input);
            System.out.println(output);
        } catch (Exception e) {
            System.err.println("Unable to process given input. Input = " + s);
            e.printStackTrace();
        }
    }

    public static String stringifyNumber(int number) {
        // Work with negative values as Integer.MIN_VALUE overflows integers when converted to a positive value
        final String stringified = convert(number < 0 ? number : number * -1);
        if (number < 0) {
            return "Minus " + stringified;
        }
        // Capitalise first letter
        return stringified.substring(0, 1).toUpperCase() + stringified.substring(1);
    }

    /**
     * Expects a negative number. Works only for numbers smaller than twenty
     * @param number
     * @return
     */
    private static String asString(int number) {
        switch (number) {
            case 0:
                return "Zero";
            case -1:
                return "one";
            case -2:
                return "two";
            case -3:
                return "three";
            case -4:
                return "four";
            case -5:
                return "five";
            case -6:
                return "six";
            case -7:
                return "seven";
            case -8:
                return "eight";
            case -9:
                return "nine";
            case -10:
                return "ten";
            case -11:
                return "eleven";
            case -12:
                return "twelve";
            case -13:
                return "thirteen";
            case -14:
                return "fourteen";
            case -15:
                return "fifteen";
            case -16:
                return "sixteen";
            case -17:
                return "seventeen";
            case -18:
                return "eighteen";
            case -19:
                return "nineteen";
            default:
                return null;
        }
    }

    /**
     * Expects negative numbers (all positive integers can safely be converted to negative but {@see Integer.MIN_VALUE}
     * can't be converted to positive)
     * @param number the number to convert to string
     * @return English representation of the given number
     */
    private static String convert(int number) {
        if (number <= -1_000_000_000) {
            final int leadingBillions = number/1_000_000_000;
            final int temp = number + leadingBillions * -1_000_000_000;
            return convert(leadingBillions) + " billion" + (temp == 0 ? "" : " " + convert(temp));
        } else if (number <= -1_000_000) {
            final int leadingMillions = number/1_000_000;
            final int temp = number + leadingMillions * -1_000_000;
            return convert(leadingMillions) + " million" + (temp == 0 ? "" : " " + convert(temp));
        } else if (number <= -1_000) {
            final int leadingThousands = number/1_000;
            final int temp = number + leadingThousands * -1000;
            return convert(leadingThousands) + " thousand" + (temp == 0 ? "" : " " + convert(temp));
        } else if (number <= -100) {
            final int leadingHundreds = number/100;
            final int temp = number + leadingHundreds * -100;
            return asString(leadingHundreds) + " hundred" + (temp == 0 ? "" : " and ") + (temp == 0 ? "" : convert(temp));
        } else if (number <= -90) {
            final int temp = number + 90;
            return "ninety" + (temp == 0 ? "" : " " + asString(temp));
        } else if (number <= -80) {
            final int temp = number + 80;
            return "eighty" + (temp == 0 ? "" : " " + asString(temp));
        } else if (number <= -70) {
            final int temp = number + 70;
            return "seventy" + (temp == 0 ? "" : " " + asString(temp));
        } else if (number <= -60) {
            final int temp = number + 60;
            return "sixty" + (temp == 0 ? "" : " " + asString(temp));
        } else if (number <= -50) {
            final int temp = number + 50;
            return "fifty" + (temp == 0 ? "" : " " + asString(temp));
        } else if (number <= -40) {
            final int temp = number + 40;
            return "forty" + (temp == 0 ? "" : " " + asString(temp));
        } else if (number <= -30) {
            final int temp = number + 30;
            return "thirty" + (temp == 0 ? "" : " " + asString(temp));
        } else if (number <= -20) {
            final int temp = number + 20;
            return "twenty" + (temp == 0 ? "" : " " + asString(temp));
        } else {
            return asString(number);
        }
    }
}
