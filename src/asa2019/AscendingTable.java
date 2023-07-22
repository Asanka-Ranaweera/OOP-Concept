package asa2019;


import java.awt.DisplayMode;
import java.util.*;
import java.util.Map.Entry;

import javax.management.ValueExp;
import javax.xml.validation.Validator;

public class AscendingTable <T , E> {
	
	Map<T , E > treemap = new TreeMap<>();

	public void add(T t , E e) {
		
		treemap.put(t, e);
	}
	
	
	public static <T,E> void display(AscendingTable<T,E> table) {
		
	for(Map.Entry<T, E> value : table.treemap.entrySet()) {
		System.out.println(value.getKey()+"=="+value.getValue());
	}
	}

}

