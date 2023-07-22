package oop2019B;

import java.util.ArrayList;

public class GenericEmployee <T extends IEmployee> {
		ArrayList<T> arrayList =new ArrayList<>();
		
		public void showElements(ArrayList<T> obj) {
			arrayList = obj;
			
			for(int i=0; i<arrayList.size(); i++) {
				arrayList.get(i).showEmployeeDetails();
			}
		}
}
