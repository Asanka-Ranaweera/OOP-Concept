package asa2019;

import java.util.ArrayList;

public class GenericPerson<T extends Iperson>{
	
	ArrayList<T> genericList = new ArrayList<>();
	
	
	
	public void displayElements(ArrayList<T> person) {

		genericList  = (ArrayList<T>) person;
		
		for(int i=0; i<genericList.size(); i++) {
			genericList.get(i).displayDetails();
		
	}
		
//		for (T i:person) {
//			System.out.println(i.displayDetails());
//		}

	}
}
