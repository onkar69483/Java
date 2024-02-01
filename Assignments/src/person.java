// question 15

public class person {
    private int age;

    // Constructor
    public person(int age) {
        if (age >= 0) {
            this.age = age;
        } 
        else {
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
    }

    public void yearPasses() {
        this.age++;
    }

    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }

    public static void main(String[] args) {
        
        person person1 = new person(17);
        person1.amIOld();
        person1.yearPasses();
        person1.amIOld();

        System.out.println();

        person person2 = new person(-5);
        person2.amIOld();
        person2.yearPasses();
        person2.amIOld();
    }
}

