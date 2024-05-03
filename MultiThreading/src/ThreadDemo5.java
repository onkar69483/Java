public class ThreadDemo5 extends Thread {
public static void main(String[] args)
 {
     // Getting reference to Main thread
     Thread t = Thread.currentThread();
     // Getting name of Main thread
     System.out.println("Current thread Name: "+ t.getName());
     // Changing the name of Main thread
     t.setName("NewThreadName");
     System.out.println("After name change: "+ t.getName());
     // Getting priority of Main thread
     System.out.println("Main thread priority: "+ t.getPriority());
     // Setting priority of Main thread to MAX(10)
     t.setPriority(MAX_PRIORITY);
     // Print and display the main thread priority
     System.out.println("Main thread new priority: "+ t.getPriority());
     for (int i = 0; i < 5; i++) {
         System.out.println("Main thread");
     }
 }
}