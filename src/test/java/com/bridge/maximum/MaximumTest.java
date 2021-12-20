package com.bridge.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaxIntegerNumberAtFirstPositionShouldReturnMax() {
        int actualResult = Maximum.maximum(9, 4, 2);
        int expectedResult = 9;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenMaxIntegerNumberAtSecondPositionShouldReturnMax() {
        int actualResult = Maximum.maximum(2, 7, 3);
        int expectedResult = 7;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenMaxInegerNumberAtThirdPositionShouldReturnMax() {
        int actualResult = Maximum.maximum(1, 4, 8);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void givenMaxFloatNumberAtFirstPositionShouldReturnMax() {
        double actualResult = Maximum.maximum(8.6, 2.4, 5.7);
        double expectedResult = 8.6;
        Assert.assertEquals(actualResult, expectedResult, 0.001);
    }

    @Test
    public void givenMaxFloatNumberAtSecondPositionShouldReturnMax() {
        double actualResult = Maximum.maximum(2.4, 8.6, 5.7);
        double expectedResult = 8.6;
        Assert.assertEquals(actualResult, expectedResult, 0.001);
    }

    @Test
    public void givenMaxFloatNumberAtThirdPositionShouldReturnMax() {
        double actualResult = Maximum.maximum(2.4, 5.7, 8.6);
        double expectedResult = 8.6;
        Assert.assertEquals(actualResult, expectedResult, 0.001);
    }


    @Test
    public void givenMaxStringAtFirstPositionShouldReturnMax() {
        String actualResult = Maximum.maximum("cdsa", "bbdds", "abc");
        String expectedResult = "cdsa";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void givenMaxStringAtSecondPositionShouldReturnMax() {
        String actualResult = Maximum.maximum("bbdd", "cdsa", "abc");
        String expectedResult = "cdsa";
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void givenMaxStringAtThirdPositionShouldReturnMax() {
        String actualResult = Maximum.maximum("as", "cs", "cdsa");
        String expectedResult = "cs";
        Assert.assertEquals(actualResult, expectedResult);
    }
}
