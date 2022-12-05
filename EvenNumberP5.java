package com.day3arrayproblem.homework;

public class EvenNumberP5 {
    public static void main(String[] args) {
        int[] array= {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Even position element in array : ");
        for(int i=1;i<array.length;i = i+ 2) {
            System.out.print(array[i]+", ");
        }

    }
}
