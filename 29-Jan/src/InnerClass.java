
public class InnerClass {
	private int oclassv = 10;
	
	public int getOclassv() {
		return oclassv;
	}

	class Iclass{
		int iclassv;
		public void dispOvar() {
			System.out.println("Val of Outer Class var: "+oclassv);
		}
	}
	
	public static void main(String[] args) {
		InnerClass c1 = new InnerClass();
		System.out.println(c1.getOclassv());
		
		InnerClass.Iclass i1 = c1.new Iclass();
		i1.dispOvar();
	}
	
}














