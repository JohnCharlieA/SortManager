package com.sparta.ja.Controller;

import com.sparta.ja.Model.BubbleSort;
import com.sparta.ja.Model.IntArrayMaker;

import java.util.Scanner;

public class Starter
{
    public void Start()
    {
        System.out.println("Welcome to the integer sorter." +
                "\nPlease input how many numbers you would like to sort:");
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] arrayOfNumbers = new int[arrayLength];
        IntArrayMaker intArrayMaker = new IntArrayMaker();
        int[] arrayOfNumbers = intArrayMaker.createArrayOfIntegers(arrayLength);

        System.out.println("Please select method of sorting, type \"bubble\" or \"merge\"");
        String userInput = scanner.nextLine();

        switch(userInput)
        {
            case "bubble":
                //BubbleSort.sortByBubble();
                break;
            case "merge":
                break;
            default:
                break;
        }

        BubbleSort.sortByBubble(arrayOfNumbers);
    }
}
