class Persona {
    private String name;
    private int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class java_35 {
    public static void main(String[] args) {
        Persona person = new Persona("Onkar M", 19);
        System.out.println(person);
    }
}
