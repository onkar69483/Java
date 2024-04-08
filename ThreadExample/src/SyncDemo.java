/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonali.kothari
 */
public class SyncDemo {
    public static void main(String args[])
    {
        PrintTable pt=new PrintTable();
        TablePrintThread t1=new TablePrintThread(5,pt);
        TablePrintThread t2=new TablePrintThread(15,pt);
        t1.start();
        t2.start();
        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
    
}