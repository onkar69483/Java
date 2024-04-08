
public class Calculator {
	 public void add(int num1, int num2)
	    {
	        System.out.println("Add "+(num1+num2));
	        try {
	            Thread.sleep(1000);
	        }
	        catch (Exception e) {
	            System.out.println("Thread  interrupted.");
	        }
	    }
	 public void subtract(int num1, int num2)
	    {
	        System.out.println("Sub "+(num1-num2));
	        try {
	            Thread.sleep(1000);
	        }
	        catch (Exception e) {
	            System.out.println("Thread  interrupted.");
	        }
	    }
	 public void multiply(int num1, int num2)
	    {
	        System.out.println("Mul "+(num1*num2));
	        try {
	            Thread.sleep(1000);
	        }
	        catch (Exception e) {
	            System.out.println("Thread  interrupted.");
	        }
	    }
	 public void divide(int num1, int num2)
	    {
	        System.out.println("Divide "+(num1/num2));
	        try {
	            Thread.sleep(1000);
	        }
	        catch (Exception e) {
	            System.out.println("Thread  interrupted.");
	        }
	    }
}
