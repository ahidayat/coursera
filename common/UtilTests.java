package common;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class UtilTests {
	
	@Test
	public void leftHalfTest(){
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(4);
		a.add(3);
		List<Integer> left = Util.leftHalf(a);
		Assert.assertEquals(1, left.size());
		Assert.assertEquals(5, left.get(0).intValue());		
	}
	
	@Test
	public void rightHalfTest(){
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(4);
		a.add(3);
		List<Integer> right = Util.rightHalf(a);
		Assert.assertEquals(2, right.size());
		Assert.assertEquals(4, right.get(0).intValue());		
		Assert.assertEquals(3, right.get(1).intValue());		
	}

}
