public class Sync {
    public static void main(String args[])
    {
        Calculator c = new Calculator();
        Thread1 t1 = new Thread1(2, 4, c); // 6
        Thread2 t2 = new Thread2(5, 4, c); // 9
        Thread3 t3 = new Thread3(5, 2, c); // 3
        Thread4 t4 = new Thread4(8, 8, c); // 0
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try
        {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    
}