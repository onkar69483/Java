
public class StaticOuter {
	private static int outerStaticVariable = 5;
	private int outerInstaceVariable = 10;
	
	static class StaticNested{
		void disp() {
			System.out.println("StaticNested method, Outer Var: "+outerStaticVariable);
		}
		
	}
	public static void main(String[] args) {
		StaticOuter outerObj = new StaticOuter();
		StaticOuter.StaticNested sninner = new StaticOuter.StaticNested();
		sninner.disp();
	}
}
