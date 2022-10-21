package com.sparta.ja.Model;

public class BubbleSort {

    public static int[] sortByBubble(int[] inputArray)
    {
        int length = inputArray.length; // calculating the length of array
        for (int i = 0; i < length; i++)
        {  // for example 5, 2, 4, 8
            for (int j = 0; j < length - 1; j++)
            {
                if (inputArray[j] > inputArray[j + 1]) //comparing the pair of elements
                {
                    // swapping inputArray[j+1] and inputArray[j]
                    int temp = inputArray[j];
                    //for example 5, 2
                    inputArray[j] = inputArray[j + 1];
                    //for example 2, 2
                    inputArray[j + 1] = temp;
                    //for example 2, 5
                }
            }
        }
        return inputArray;
    }

    /* Prints the array */
    static void printArray(int a[])
    {
        int len = a.length;
        for (int i = 0; i < len; i++)
            System.out.print(a[i] + " "); //printing the sorted array

        System.out.println();
    }

    // Main method to test above
    public static void bubbleSortGenerator()
    {
        int a[] = {64, 34, 25, 12, 22, 11, 91};

        sortByBubble(a);//calling the bubbleSort function

        System.out.println("Sorted array");

        printArray(a); //calling the printArray function
    }
}