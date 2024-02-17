
public class java_23 {
	public static void main(String[] args) {
		System.out.println("Printing Ascii values for A to Z");
		for(char ch = 'A'; ch<= 'Z'; ch++) {
			int ascii = (int)ch;
			System.out.println(ch+": "+ascii);
		}
		System.out.println("Printing Ascii values for a to z");
		for(char ch = 'a'; ch<= 'z'; ch++) {
			int ascii = (int)ch;
			System.out.println(ch+": "+ascii);
		}
	}
}
