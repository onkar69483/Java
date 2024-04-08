/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonali.kothari
 */
public class PrintTable {
    public void calculate(int num)
    {
        for(int j=1;j<=10;j++)
            System.out.println(num*j);
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
    }
    
}