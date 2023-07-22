package oop2022my;

public class DemoApp {

	public static void main(String[] args) {
		
		

		TCalculation<Integer> ob1 = new TCalculation();
		TCalculation<Double> ob2 = new TCalculation();
		
		ob1.append(5);
		ob1.append(15);
		ob1.append(10);
		ob2.append(10.2);
		ob2.append(5.2);
		
		double average1 = ob1.average();
		System.out.println(average1);
		
		double average2 = ob2.average();
		System.out.println(average2);
	}

}
