package com.day3arrayproblem.homework;

public class SecondLargestNumberP10 {
    public static int getSecondLargestNumber(int[] array, int total){
        int tempary;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if ( array[i] > array[j])
                {
                    tempary = array[i];
                    array[i] = array[j];
                    array[j] = tempary;
                }
            }
        }
        return array[total-2];
    }
    public static void main(String args[]){
        int array[] = {15,25,30,90,95,70};

        System.out.println("Second Largest number is : " + getSecondLargestNumber(array,6));

    }
}
