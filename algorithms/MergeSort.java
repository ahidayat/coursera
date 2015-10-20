package algorithms;

import java.util.List;

import common.Util;

public class MergeSort {
	
	public static <T extends Comparable<T>> List<T> sort(List<T> a){
		if(a.size() <= 1) return a;
		
		List<T> left = sort(Util.leftHalf(a));
		List<T> right = sort(Util.rightHalf(a));
		return InversionCounter.merge(left, right).collection;
	}

}
