package oop2022my;

import java.util.ArrayList;

public class TCalculation<T extends Number> {
	
	ArrayList<T> numList = new ArrayList<>();
	double total ;
	
	
	public void append(T x) {
		numList.add(x);
	}
	
	public double average() {
		for(int i=0; i<numList.size(); i++) {
			total = total + numList.get(i).doubleValue();
		}
		
		
		return total/numList.size();
	}
	

}
