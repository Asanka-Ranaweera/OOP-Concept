
import java.util.*;

public class Mymain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		String ab = scanner.next();
		System.out.println(ab.length());
		System.out.println(ab.charAt(1));
		System.out.println(ab.substring(2,6));
		System.out.println(ab.toLowerCase());
		System.out.println(ab.toUpperCase());
		
		System.out.println(ab.startsWith("as"));  // return true or false       
		System.out.println(ab.replace( "a", "X"));
		
		char ch[] = ab.toCharArray();
		for(int i =0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		//stringbuffer
		
		StringBuffer kk = new StringBuffer("Asankar");
		
		
		kk.append("anaweera");
		
		System.out.println(kk.reverse());
		System.out.println(kk);
		
		
		
//		
//		String s1 = "ab";
//		String s2 = "ab";
//			System.out.println("============================");
//		
		
	
		
 		
		String a = new String();
		String num[] =new String[10];
		
		
		System.out.println("asanka");
		
		a = scanner.next();
		System.out.println(a);
		
		
//		for (int i=0; i<10; i++) {
//			num[i] = scanner.next();
//		}
//		
//		for (int i=0; i<10; i++) {
//			System.out.println(num[i]);
//		}
	}

}
