package com.cognizant.md.parking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class parkingFeeTest {
    ParkingFee pf;

    @Before
    public void setup() {
        pf = new ParkingFee();
    }

    @Test
    public void calculateFeeOverMax() {
        int expected = 30;

        int actual = pf.calculateTotal(false, 7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateFeeWithPass() {
        int expected = 0;

        int actual = pf.calculateTotal(true, 7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calculateFeeUnderMax() {
        int expected = 25;

        int actual = pf.calculateTotal(false, 5);
        Assert.assertEquals(expected, actual);
    }
}
