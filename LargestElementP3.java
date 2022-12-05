package com.day3arrayproblem.homework;

import java.util.Scanner;

public class LargestElementP3 {
    public static void main(String[] args) {
            int number[], size, largeNumber;
        Scanner inputNumber = new Scanner(System.in);
             System.out.println("declare size of array :");
             size = inputNumber.nextInt();
                number = new int[size];
        System.out.println("Enter elements of array : ");
            for (int j = 0; j < number.length; j++) {
                number[j] = inputNumber.nextInt();
            }
            largeNumber = number[0];
            for(int j = 1; j < number.length; j++) {
            if (largeNumber < number[j]) {
                largeNumber = number[j];
            }
        }
        System.out.println("Largest value is : " + largeNumber);
    }
}
