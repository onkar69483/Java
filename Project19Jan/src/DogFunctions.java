class Dog {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void dogBarks() {
		System.out.println(this.name+" is barking");
	}
}


public class DogFunctions {
	public static void main(String[] args) {
		Dog dog = new Dog();
		System.out.println("Before Getter and Setter");
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		
		dog.setName("Oggy");
		dog.setAge(50);
		
		System.out.println("After Getter and Setter");
		
		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		dog.dogBarks();
	}
}
