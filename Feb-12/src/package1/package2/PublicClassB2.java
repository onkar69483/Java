package package1.package2;

import package1.PublicClass1;
// import package1.*; Used to import all files of package1;

public class PublicClassB2 {
	public static void main(String[] args) {
		package1.PublicClass1 p = new PublicClass1();
		PublicClass1 publicClassB1 = new PublicClass1();
		PublicClassB3 publicClassB3 = new PublicClassB3();
	}
}
