package algorithms.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;

import algorithms.MergeSort;


public class MergeSortTests {

	@Test
	public void testIntegers() {
		List<Integer> a = new ArrayList<Integer>();
		a.add(5);
		List<Integer> merged = MergeSort.sort(a);
		Assert.assertTrue(merged.get(0) == 5);
		
		a.add(4);
		merged = MergeSort.sort(a);
		Assert.assertTrue(merged.get(0) == 4);
		Assert.assertTrue(merged.get(1) == 5);
		
		a.add(3);
		merged = MergeSort.sort(a);
		Assert.assertTrue(merged.get(0) == 3);
		Assert.assertTrue(merged.get(1) == 4);
		Assert.assertTrue(merged.get(2) == 5);

		a.add(7);
		merged = MergeSort.sort(a);
		Assert.assertTrue(merged.get(0) == 3);
		Assert.assertTrue(merged.get(1) == 4);
		Assert.assertTrue(merged.get(2) == 5);
		Assert.assertTrue(merged.get(3) == 7);
	}

	@Test
	public void testStrings() {
		List<String> a = new ArrayList<String>();
		a.add("e");
		List<String> merged = MergeSort.sort(a);
		Assert.assertTrue(Objects.equals(merged.get(0), "e"));
		
		a.add("d");
		merged = MergeSort.sort(a);
		Assert.assertTrue(Objects.equals(merged.get(0), "d"));
		Assert.assertTrue(Objects.equals(merged.get(1), "e"));
		
		a.add("c");
		merged = MergeSort.sort(a);
		Assert.assertTrue(Objects.equals(merged.get(0), "c"));
		Assert.assertTrue(Objects.equals(merged.get(1), "d"));
		Assert.assertTrue(Objects.equals(merged.get(2), "e"));

		a.add("g");
		merged = MergeSort.sort(a);
		Assert.assertTrue(Objects.equals(merged.get(0), "c"));
		Assert.assertTrue(Objects.equals(merged.get(1), "d"));
		Assert.assertTrue(Objects.equals(merged.get(2), "e"));
		Assert.assertTrue(Objects.equals(merged.get(3), "g"));
	}
}
