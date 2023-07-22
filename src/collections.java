import java.util.ArrayList;
import java.util.Scanner;

public class collections {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	
		
	ArrayList<String> arrayList  = new ArrayList<>();
	
	arrayList.add("ABC");
	arrayList.add("EF");
	arrayList.add("KLM");
	arrayList.add("s");
	arrayList.add("d");
	arrayList.add("w");
	arrayList.remove(5);	
	
	arrayList.add(0,"asanka");
	
	System.out.println(	arrayList.contains("asanka"));
	System.out.println(	arrayList.contains("asan"));
	
	

	System.out.println(arrayList);
	arrayList.set(5, "set");
	System.out.println(arrayList);
	

	
	System.out.println(arrayList.indexOf("s")); // s tiyenne kiweni index ekeeda kiyala
	
	
	
	int size = arrayList.size();
	System.out.println(size);
	
	
	Object[] arr = new String[size];
	arr =  arrayList.toArray();
	
//	for(String a: arr) {
//	System.out.println(a);
//	}
	
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i].toString());
	}
	

	for(int i=0; i<arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
	}
	
	for(String aq: arrayList) {
		System.out.println(aq);
	}
	
	}
	
}
