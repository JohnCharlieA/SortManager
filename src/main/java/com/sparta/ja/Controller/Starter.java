package com.sparta.ja.Controller;

import com.sparta.ja.Model.BubbleSort;

public class Starter
{
    public void Start()
    {
        int[] arrayOfNumbers = new int[5];
        BubbleSort bubbleSorter = new BubbleSort();
        bubbleSorter.SortByBubble(arrayOfNumbers);
    }
}
