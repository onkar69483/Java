/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sonali.kothari
 */
public class TablePrintThread extends Thread{
    private int num;
    PrintTable pt;
    TablePrintThread(int num, PrintTable pt)
    {
        this.num=num;
        this.pt=pt;
        
    }
    public void run()
    {
        synchronized(pt)
        {
            pt.calculate(num);
        }
    }
    
}