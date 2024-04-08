public class Thread3 extends Thread {
	private int num1,num2;

	Calculator c;
	Thread3(int num1,int num2, Calculator c)
	{
	    this.num1=num1;
	    this.num2=num2;
	    this.c=c; 
	}
	public void run()
	{  
		synchronized (c) {
	    	c.subtract(num1, num2);
		}
	}
}