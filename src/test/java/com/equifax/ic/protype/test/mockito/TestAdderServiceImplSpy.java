package com.equifax.ic.protype.test.mockito;

import org.junit.Before;
import org.junit.Test;

import com.equifax.ic.protype.test.Adder;
import com.equifax.ic.protype.test.AdderService;
import com.equifax.ic.protype.test.AdderServiceImpl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class TestAdderServiceImplSpy {
	Adder adder;
	AdderService service;

	@Before
	public void setup() {
		adder = new AdderServiceImpl();
		service = spy(AdderService.class);
		((AdderServiceImpl)adder).setService(service);
	}

	@Test
	public void testNoSpy() {
		assertTrue (adder.add(1, 1) == -1);
		assertEquals (15, adder.multiAdder(2, 1, 5));
	}

	@Test
	public void testSpy() {
		doReturn(2).when(service).add(anyInt(), anyInt());
		assertTrue (adder.add(1, 1) == 2);
		assertEquals (15, adder.multiAdder(2, 1, 5));
	}
}
