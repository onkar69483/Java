/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonali.kothari
 */
public class Thread1 extends Thread {
    @Override
    public void run()
    {
        for(int i=10;i>0;i--)
        {
            System.out.println("Thread 1 -"+i);
            try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
          System.out.println(e);  
        }
        }
    }
    
}