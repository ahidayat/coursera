package common;

import java.util.ArrayList;
import java.util.List;

public class Util {
	
	public static <T> List<T> leftHalf(List<T> list){
		int leftSize = list.size()/2;
		return new ArrayList<T>(list.subList(0, leftSize));
	}
	
	public static <T> List<T> rightHalf(List<T> list){
		int leftSize = list.size()/2;
		return new ArrayList<T>(list.subList(leftSize, list.size()));
	}
}
