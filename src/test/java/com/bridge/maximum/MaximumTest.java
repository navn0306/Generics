package com.bridge.maximum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {

    @Test
    public void givenMaxIntegerNumberAtFirstPositionShouldReturnMax() {
        int actualResult = Maximum.getIntMax(9, 4, 2);
        int expectedResult = 9;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenMaxIntegerNumberAtSecondPositionShouldReturnMax() {
        int actualResult = Maximum.getIntMax(2, 7, 3);
        int expectedResult = 7;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenMaxInegerNumberAtThirdPositionShouldReturnMax() {
        int actualResult = Maximum.getIntMax(1, 4, 8);
        int expectedResult = 8;
        Assert.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void givenMaxFloatNumberAtFirstPositionShouldReturnMax() {
        double actualResult = Maximum.getFloatMax(8.6,2.4,5.7);
        double expectedResult = 8.6;
        Assert.assertEquals( actualResult, expectedResult,0.001);
    }

    @Test
    public void givenMaxFloatNumberAtSecondPositionShouldReturnMax () {
        double actualResult = Maximum.getFloatMax(2.4,8.6,5.7);
        double expectedResult = 8.6;
        Assert.assertEquals( actualResult, expectedResult,0.001);
    }

    @Test
    public void givenMaxFloatNumberAtThirdPositionShouldReturnMax() {
        double actualResult = Maximum.getFloatMax(2.4,5.7,8.6);
        double expectedResult = 8.6;
        Assert.assertEquals( actualResult, expectedResult,0.001);
    }


    @Test
    public void givenMaxStringAtFirstPositionShouldReturnMax() {
        String actualResult = Maximum.getStringMax("a","b","c");
        String expectedResult = "a";
        Assert.assertEquals( actualResult, expectedResult);
    }

    @Test
    public void givenMaxStringAtSecondPositionShouldReturnMax() {
        String actualResult = Maximum.getStringMax("d","b","c");
        String expectedResult = "b";
        Assert.assertEquals( actualResult, expectedResult);
    }

    @Test
    public void givenMaxStringAtThirdPositionShouldReturnMax() {
        String actualResult = Maximum.getStringMax("b","c","a");
        String expectedResult = "a";
        Assert.assertEquals( actualResult, expectedResult);
    }
}
