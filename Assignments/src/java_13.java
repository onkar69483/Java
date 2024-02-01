//this always refers to the current object instance.
//It's frequently used to distinguish between instance variables and method/constructor parameters with the same name.
//It can be used to call other constructors within the same class, simplifying code and reducing redundancy.
//It can be passed as an argument to methods or returned from methods, allowing for versatile object interactions.

class Insect{
    private String name;
    private int age;

    public Insect(String name, int age) {
        this.name = name;  // Using 'this' to differentiate between parameter and field
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + this.name + " and I'm " + this.age + " years old.");
    }
}

public class java_13 {
	public static void main(String[] args) {
		Insect insect = new Insect("Cockroach", 5);
		insect.introduce();
	}
}
