package com.sparta.ja;

import com.sparta.ja.Model.BubbleSort;
import com.sparta.ja.Model.IntArrayMaker;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class IntArrayMakerTests
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ShouldSortArrayOfIntegers()
    {
        //Arrange
        IntArrayMaker intArrayMaker = new IntArrayMaker();
        int lengthOfArray = 6;

        //Act
        int[] arrayOfIntegers = intArrayMaker.createArrayOfIntegers(lengthOfArray);

        //Assert
        assertTrue(arrayOfIntegers.length == 6);
    }
}
