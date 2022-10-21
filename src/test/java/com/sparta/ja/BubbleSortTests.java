package com.sparta.ja;

import com.sparta.ja.Model.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class BubbleSortTests
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ShouldSortArrayOfIntegers()
    {
        //Arrange
        int[] numbersToSort = new int[]{13, 62, 5, 1, 19, 68};
        int[] expectedOutput = new int[]{1, 5, 13, 19, 62, 68};

        //Act
        int[] sortedArray = BubbleSort.sortByBubble(numbersToSort);

        //Assert
        assertArrayEquals(expectedOutput, sortedArray);
    }
}
