package com.day3arrayproblem.homework;

public class ReverseOrderP6 {
    static void printReverseOrderArray(int a[], int n) {

        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.print("Reversed array is: ");
        for (int k = 0; k < n; k++) {
            System.out.print(b[k] + " ");
        }
    }
    public static void main(String[] args)
    {
        int [] array = {10, 20, 30, 40, 50};
        printReverseOrderArray(array, array.length);
    }
}
