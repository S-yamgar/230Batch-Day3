package com.day3arrayproblem.homework;

import java.util.ArrayList;

public class DuplicateElementP8 {

    public static void main(String[] args) {

        int[] array = {7,9,3,1,7,9,5,6,5,4,3,1};

        System.out.print("duplicate values are : ");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.print(array[i] + ",");
                }
            }
        }
    }
}

