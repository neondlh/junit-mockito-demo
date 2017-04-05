package com.equifax.ic.protype.test;


public class AdderImpl implements Adder {
	
    public int add(int a, int b) {
        return a + b;
    }

	@Override
	public int multiAdder(int a, int b, int times) {
		return (a + b) * times;
	}

}