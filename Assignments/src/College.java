public class College {
    private String name;

    // Inner class representing a student
    public class Student {
        private String name;
        private int age;
        private int prn;

        public Student(String name, int age, int prn) {
            this.name = name;
            this.age = age;
            this.prn = prn;
        }

        public void display() {
            System.out.println("Name: "+name+", Age: "+age+", PRN: "+prn);
        }
    }

    public College(String name) {
        this.name = name;
    }

    public Student createStudent(String name, int age, int prn) {
        return new Student(name, age, prn);
    }

    public static void main(String[] args) {
        College college = new College("Symbiosis College");

        College.Student student1 = college.createStudent("Onkar", 19, 135);
        College.Student student2 = college.createStudent("Mihir", 19, 120);
        College.Student student3 = college.createStudent("Sachin", 19, 119);

        System.out.println("Students in " + college.name + ":");
        student1.display();
        student2.display();
        student3.display();
    }
}
