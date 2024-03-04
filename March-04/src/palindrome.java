
public class palindrome {
	public static boolean isPalindrome(String s) {
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		return rev.equalsIgnoreCase(s);
	}
	public static void returnAns(Boolean isPalindrome) {
		if(isPalindrome) System.out.println("Palindrome!");
		else System.out.println("Not Palindrome!");
	}
	public static void main(String[] args) {
		String s1 = "mom";
		StringBuffer s2 = new StringBuffer("dad");
		StringBuilder s3 = new StringBuilder("wow");
		System.out.print("Reverse using String Literal: ");
		returnAns(isPalindrome(s1));
		System.out.print("Reverse using String Buffer: ");
		returnAns(s2.toString().equalsIgnoreCase(s2.reverse().toString()));
		System.out.print("Reverse using String Builder: ");
		returnAns(s3.toString().equalsIgnoreCase(s3.reverse().toString()));
	}
}
