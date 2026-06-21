/*
Name: Kobe Alexander
Date: 6/20/2026
Assignment: Module 4.2 Assignment

The purpose of this code is to have values in an array and then take an average of them and display the values and averages of the arrays
*/

    public static short average(short[] array) {
        short sum = 0;

        for (short number : array) {
            sum += number;
        }

        return (short)(sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;

        for (int number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;

        for (long number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;

        for (double number : array) {
            sum += number;
        }

        return sum / array.length;
    }

    public static void displayArray(short[] array) {
        System.out.print("Short array values: ");

        for (short number : array) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    public static void displayArray(int[] array) {
        System.out.print("Int array values: ");

        for (int number : array) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    public static void displayArray(long[] array) {
        System.out.print("Long array values: ");

        for (long number : array) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    public static void displayArray(double[] array) {
        System.out.print("Double array values: ");

        for (double number : array) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        short[] shortArray = {10, 20, 30};
        int[] intArray = {15, 25, 35, 45};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {2.5, 4.5, 6.5, 8.5, 10.5, 12.5};

        System.out.println("Average Method Overloading Test Program");
        System.out.println("--------------------------------------");

        displayArray(shortArray);
        System.out.println("Average of short array: " + average(shortArray));
        System.out.println();

        displayArray(intArray);
        System.out.println("Average of int array: " + average(intArray));
        System.out.println();

        displayArray(longArray);
        System.out.println("Average of long array: " + average(longArray));
        System.out.println();

        displayArray(doubleArray);
        System.out.println("Average of double array: " + average(doubleArray));
    }
}