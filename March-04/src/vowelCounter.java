import java.util.ArrayList;
import java.util.Iterator;

public class vowelCounter {
	public static int countVowel(String s) {
		int count = 0;
		String vow = "aeiouAEIOU";
		ArrayList<Character> vowels = new ArrayList<Character>();
        for(int i=0;i<vow.length();i++)
        {
            vowels.add(vow.charAt(i));
        }
        for(int i=0;i<s.length();i++)
		if(vowels.contains(s.charAt(i))) {
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String s1 = "Literal";
		System.out.println("Vowel using String Literal: "+countVowel(s1));
	}
}
