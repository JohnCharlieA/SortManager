package com.sparta.ja;

import com.sparta.ja.Sorters.BubbleSort;

public class Starter
{
    public void Start()
    {
        int[] arrayOfNumbers = new int[5];
        BubbleSort bubbleSorter = new BubbleSort();
        bubbleSorter.SortByBubble(arrayOfNumbers);
    }
}
