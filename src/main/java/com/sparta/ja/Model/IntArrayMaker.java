package com.sparta.ja.Model;

import java.util.*;

public class IntArrayMaker
{

    public int[] createArrayOfIntegers(int arrayLength)
    {
        int[] generatedArray = new int[arrayLength];
        Random random = new Random();

        for (int i = 0; i < generatedArray.length; i++)
        {
            generatedArray[i] = random.nextInt(1, 1000);
        }
        return generatedArray;
    }
}
