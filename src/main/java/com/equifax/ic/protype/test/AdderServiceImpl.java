package com.equifax.ic.protype.test;

public class AdderServiceImpl implements Adder {
	
	private AdderService service;
	
	@Override
	public int add(int a, int b) {
		return service.add(a, b);
	}
	
	@Override
	public int multiAdder(int a, int b, int times) {
		return service.multiAdder(a, b, times);
	}
	
	public AdderService getService() {
		return service;
	}

	public void setService(AdderService service) {
		this.service = service;
	}

	
}
