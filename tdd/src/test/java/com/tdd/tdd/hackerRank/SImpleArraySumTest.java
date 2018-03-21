package com.tdd.tdd.hackerRank;

import org.junit.Assert;
import org.junit.Test;

public class SImpleArraySumTest {


    @Test
    public void sumOneVal() {
        int a[] = {3};
        Assert.assertEquals(ArraySumm.simpleArraySum(a),3);
    }

    @Test
    public void sumZero() {
        int []a=new int[9];
        Assert.assertEquals( ArraySumm.simpleArraySum(a),0);
    }

    @Test
    public void summValues() {
        int a[] = {3,3};

        Assert.assertEquals(ArraySumm.simpleArraySum(a),6);
    }
}
