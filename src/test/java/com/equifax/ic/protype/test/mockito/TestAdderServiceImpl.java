package com.equifax.ic.protype.test.mockito;

import org.junit.Before;
import org.junit.Test;

import com.equifax.ic.protype.test.Adder;
import com.equifax.ic.protype.test.AdderService;
import com.equifax.ic.protype.test.AdderServiceImpl;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class TestAdderServiceImpl {
	Adder adder;
	AdderService service;

	@Before
	public void setup() {
		adder = new AdderServiceImpl();
		service = mock(AdderService.class);
		((AdderServiceImpl)adder).setService(service);
	}

	public void prepareScenario(int result){
		when(service.add(any(Integer.class), any(Integer.class))).thenReturn(result);
	}
	@Test
	public void testSumPositiveNumbersOneAndOne() {
		prepareScenario(2);
		assertTrue (adder.add(1, 1) == 2);
	}

	@Test
	public void testSumPositiveNumbersOneAndTwo() {
		prepareScenario(3);
		assertTrue (adder.add(1, 2) == 3);
	}
}
