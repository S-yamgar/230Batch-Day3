package com.day3arrayproblem.homework;

public class SmallestElementsP4 {
    public static void main(String[] args)
    {
        int[] initializedArray = new int[] { 50, 30, 500,140, 158, 369 };

             System.out.println("Given array ");

             for (int i = 0; i < initializedArray.length; i++) {
                System.out.println(initializedArray[i]);
             }
                int minimumValue = initializedArray[0];
             for (int i = 0; i < initializedArray.length; i++) {
                if (initializedArray[i] < minimumValue)
                    minimumValue = initializedArray[i];
        }
        System.out.println("Smallest element present in given array: "+ minimumValue);
    }

}
