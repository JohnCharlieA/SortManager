package com.sparta.ja.Controller;

import com.sparta.ja.Model.BubbleSort;

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

        System.out.println("Please select method of sorting, type \"bubble\" or \"merge\"");

        BubbleSort.sortByBubble(arrayOfNumbers);
    }
}
