
public class Threads extends Thread {
	private int num1,num2;

	Calculator c;
	Threads(int num1,int num2, Calculator c)
	{
	    this.num1=num1;
	    this.num2=num2;
	    this.c=c; 
	}
	public void run()
	{
	   
	    	c.add(num1, num2);
            c.subtract(num1, num2);
            c.multiply(num1, num2);
            c.divide(num1, num2);
	    
	}
}
