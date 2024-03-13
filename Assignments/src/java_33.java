//class Parent {
//    // Method to demonstrate method overriding
//    void display() {
//        System.out.println("Parent's display method");
//    }
//
//    // Method to demonstrate method overloading
//    void print(int num) {
//        System.out.println("Printing integer: " + num);
//    }
//
//    // Overloaded method
//    void print(double num) {
//        System.out.println("Printing double: " + num);
//    }
//}
//
//class Child extends Parent {
//    @Override
//    void display() {
//        System.out.println("Child's display method");
//    }
//}
//
//public class java_33 {
//    public static void main(String[] args) {
//        Parent parent = new Parent();
//        Child child = new Child();
//
//        // Method overloading
//        parent.print(8.6);
//        parent.print(2.2);
//
//        // Method overriding
//        parent.display(); 
//        child.display();
//        
//    }
//}
