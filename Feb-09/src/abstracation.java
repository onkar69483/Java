abstract class shape{
	static int noOfShapes = 0;
	shape(){
		noOfShapes++;
	}
	
	void displayInfo() {
		System.out.println("This is a shape!");
	}
	
	abstract void draw();
}

class Circle extends shape{
	@Override
//	Annotation to access java docs, i.e information how to use
	void draw() {
		System.out.println("Drawing Circle");
	}
}

class Square extends shape{
	@Override
//	Annotation to access java docs, i.e information how to use
	void draw() {
		System.out.println("Drawing Square");
	}
}

class Triangle extends shape{
	@Override
//	Annotation to access java docs, i.e information how to use
	void draw() {
		System.out.println("Drawing Triangle");
	}
}

public class abstracation {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.draw();
		circle.displayInfo();
		
		Square square = new Square();
		square.draw();
		square.displayInfo();
		
		Triangle triangle = new Triangle();
		triangle.draw();
		triangle.displayInfo();
		
		shape newcircle = new Circle();
		newcircle.draw();
		
		System.out.println(shape.noOfShapes);
	}
}
