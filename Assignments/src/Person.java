
public class Person {
	private String name;
	private int age;
	private String country;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Country: "+country);
	}
	public static void main(String[] args) {
		Person person[] = new Person[3];
		person[0] = new Person();
		person[1] = new Person();
		person[2] = new Person();
		
		person[0].setName("Onkar");
		person[0].setAge(18);
		person[0].setCountry("India");
		
		person[1].setName("Sachin");
		person[1].setAge(25);
		person[1].setCountry("US");
		
		person[2].setName("Mihir");
		person[2].setAge(26);
		person[2].setCountry("Africa");
		
		System.out.println("Displaying Person Details");
		for(int i=0; i<3;i++) {
			person[i].display();
			System.out.println();
		}
		
	}
}
