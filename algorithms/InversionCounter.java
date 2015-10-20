package algorithms;

import java.util.ArrayList;
import java.util.List;

import common.Util;

public class InversionCounter {
	
	public static <T extends Comparable<T>> Inversion<T> count(List<T> list){
		if(list.size() <= 1) return new Inversion<T>(list, 0);
		Inversion<T> left = count(Util.leftHalf(list));
		Inversion<T> right = count(Util.rightHalf(list));
		Inversion<T> split = countSplit(left.collection, right.collection);
		return new Inversion<T>(split.collection, left.count + right.count + split.count);
	}

	private static <T extends Comparable<T>> Inversion<T> countSplit(List<T> leftHalf, List<T> rightHalf) {
		return merge(leftHalf, rightHalf);
	}
	
	public static <T extends Comparable<T>> Inversion<T> merge(List<T> left, List<T> right) {
		List<T> result = new ArrayList<T>();
		int li = 0, ri = 0, inversionCounter = 0;
		while(li < left.size() && ri < right.size()){
			if(left.get(li).compareTo(right.get(ri)) < 0){
				result.add(left.get(li));
				li++;
			}
			else{
				result.add(right.get(ri));
				ri++;
				inversionCounter += (left.size() - li);
			}
		}
		while(li < left.size()){
			result.add(left.get(li));
			li++;
		}
		while(ri < right.size()){
			result.add(right.get(ri));
			ri++;
			inversionCounter += (left.size() - li);
		}
		return new Inversion<T>(result, inversionCounter);
	}
}
