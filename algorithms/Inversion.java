package algorithms;

import java.util.List;

public class Inversion<T> {
	public List<T> collection;
	public long count;
	
	public Inversion(List<T> collection, long l){
		this.collection = collection;
		this.count = l;
	}
}
