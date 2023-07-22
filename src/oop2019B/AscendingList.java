package oop2019B;

import java.util.Set;
import java.util.TreeSet;

public class AscendingList<E> {

	Set<E> set = new TreeSet<>();
	
	public void add(E e) {
		set.add(e);
	}
	
	public void displayMyList(AscendingList<E> s) {
		for(E val: set) {
			System.out.println(val);
		}
	}
	
	
}
