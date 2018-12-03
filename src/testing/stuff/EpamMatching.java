package testing.stuff;

import java.util.ArrayList;
import java.util.List;

public class EpamMatching {

	public static void main(String[] args) {
		String s1 = "Adam";
		String s2 = "Amanda";
		
		checkMatching(s2, s1);
		
		String s3 = "Javier";
		String s4 = "Bardem";
		
		checkMatching(s3, s4);
		
		String s5 = "abcccc";
		String s6 = "cbcef";
		
		checkMatching(s5, s6);
	}

	private static void checkMatching(String s1, String s2) {
		char[] c1 = s1.toLowerCase().toCharArray();
		char[] c2 = s2.toLowerCase().toCharArray();
		
		List<Character> l1 = new ArrayList<>();
		List<Character> l2 = new ArrayList<>();
		
		for(char ch : c1) {
			l1.add(ch);
		}
		
		for(char ch : c2) {
			l2.add(ch);
		}
		
		System.out.println(l1);
		System.out.println(l2);
		if(c1.length > c2.length) {
			System.out.println(l2.removeAll(l1));
			System.out.println("Matching: " + (c2.length-l2.size()));
		} else {
			System.out.println(l1.removeAll(l2));
			System.out.println("Matching: " + (c1.length-l1.size()));
		}
		System.out.println(l1);
		System.out.println(l2);

	}

}
