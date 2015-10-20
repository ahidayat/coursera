package algorithms.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import algorithms.InversionCounter;

public class InversionCounterTests {

	@Test
	public void testIntegers() {
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		Assert.assertEquals(0, InversionCounter.count(a).count);
		
		a.add(4);
		Assert.assertEquals(1, InversionCounter.count(a).count);
		
		a.add(10);
		Assert.assertEquals(1, InversionCounter.count(a).count);
		
		a.add(3);
		Assert.assertEquals(4, InversionCounter.count(a).count);
		
		a.add(2);
		Assert.assertEquals(8, InversionCounter.count(a).count);
		
		a.add(20);
		Assert.assertEquals(8, InversionCounter.count(a).count);
		
		a.add(19);
		Assert.assertEquals(9, InversionCounter.count(a).count);
	}
}
