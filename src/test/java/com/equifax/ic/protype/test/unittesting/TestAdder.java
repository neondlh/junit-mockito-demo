package com.equifax.ic.protype.test.unittesting;

import org.junit.Test;

import com.equifax.ic.protype.test.Adder;
import com.equifax.ic.protype.test.AdderImpl;

public class TestAdder {

    @Test
    public void testSumPositiveNumbersOneAndOne() {
        Adder adder = new AdderImpl();
        assert(adder.add(1, 1) == 2);
    }

    @Test
    public void testSumPositiveNumbersOneAndTwo() {
        Adder adder = new AdderImpl();
        assert(adder.add(1, 2) == 3);
    }

    @Test
    public void testSumPositiveNumbersTwoAndTwo() {
        Adder adder = new AdderImpl();
        assert(adder.add(2, 2) == 4);
    }

    @Test
    public void testSumZeroNeutral() {
        Adder adder = new AdderImpl();
        assert(adder.add(0, 0) == 0);
    }

    @Test
    public void testSumNegativeNumbers() {
        Adder adder = new AdderImpl();
        assert(adder.add(-1, -2) == -3);
    }

    @Test
    public void testSumPositiveAndNegative() {
        Adder adder = new AdderImpl();
        assert(adder.add(-1, 1) == 0);
    }

    @Test
    public void testSumLargeNumbers() {
        Adder adder = new AdderImpl();
        assert(adder.add(1234, 988) == 2222);
    }

}