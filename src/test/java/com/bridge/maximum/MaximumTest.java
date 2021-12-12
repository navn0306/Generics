package com.bridge.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaxNumberAtFirstPositionShouldReturnMax() {
        int actualResult = Maximum.getMax(9, 4, 2);
        int expectedResult = 9;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenMaxNumberAtSecondPositionShouldReturnMax() {
        int actualResult = Maximum.getMax(2, 7, 3);
        int expectedResult = 7;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenMaxNumberAtThirdPositionShouldReturnMax() {
        int actualResult = Maximum.getMax(1, 4, 8);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult,actualResult);
    }
}
