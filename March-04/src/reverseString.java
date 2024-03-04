
public class reverseString {
	
	public static String reverse(String s) {
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev += s.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
		String s1 = "Literal";
		StringBuffer s2 = new StringBuffer("Buffer");
		StringBuilder s3 = new StringBuilder("Builder");
		System.out.println("Reverse using String Literal: "+reverse(s1));
		System.out.println("Reverse using String Buffer: "+s2.reverse());
		System.out.println("Reverse using String Builder: "+s3.reverse());
	}
}
