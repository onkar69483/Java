/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonali.kothari
 */
public class Main {
    public static void main(String args[]) throws Exception
    {
        System.out.println("Starting Main Thread");
        Thread1 t1=new Thread1();
        t1.start();
        
        Thread2 t2=new Thread2();
        t2.start();
         
         t1.join();
         t2.join();
         System.out.println("Status of T1- "+t1.isAlive());
         System.out.println("Status of T2- "+t2.isAlive());
         System.out.println("Exiting Main Thread");
    }
    
}