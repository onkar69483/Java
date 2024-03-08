// write a java code to store unique characters from a String in hashset

import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<Character> uniqueChars = new HashSet<>();
		String something = "Hi welcome to my youtube channel";
		
		for(int i=0; i<something.length(); i++) {
			uniqueChars.add(something.charAt(i));
		}
		System.out.println(uniqueChars);
	}
}
