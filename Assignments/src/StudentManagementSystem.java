class Student {
    private String Name;
    private String course;

    public Student(String Name, String course) {
        this.Name = Name;
        this.course = course;
    }

	public String getName() {
		return Name;
	}

	public String getCourse() {
		return course;
	}
    
}

class Course {
    private String Name;
    private Teacher teacher;

    public Course(String Name, Teacher teacher) {
        this.Name = Name;
        this.teacher = teacher;
    }

	public String getName() {
		return Name;
	}

	public Teacher getTeacher() {
		return teacher;
	}
 
}

class Teacher {
    private String teacherName;
    public Teacher(int teacherId, String teacherName) {
        this.teacherName = teacherName;
    }
    public String getTeacherName() {
        return teacherName;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create instances of Student, Teacher, and Course
        Teacher teacher = new Teacher(1, "Mihir Hebalkar");
        Course course = new Course("DBMS", teacher);

        Student student = new Student("Onkar", "ComputerScience");
        // Display information
        System.out.println("Student Name: " + student.getName());

        System.out.println("Course Name: " + course.getName());
        System.out.println("Teacher Name: " + course.getTeacher().getTeacherName());
    }
}