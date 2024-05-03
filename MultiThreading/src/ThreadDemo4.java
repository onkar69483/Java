class A2 implements Runnable{
	public void run(){
	int i;
	for (i=0; i<=10; i++)
	System.out.println("Thread A Iteration:" +i);

	}
	}

class B2 implements Runnable{
	public void run(){
	int i;
	for(i=0; i<=10; i++)
	System.out.println("Thread B Iteration:" +i);
	}
	}

public class ThreadDemo4{
	public static void main(String[] args){
		A2 tA = new A2();
		B2 tB = new B2();
	Thread t1=new Thread(tA);
	Thread t2=new Thread(tB);
	t1.start();
	t2.start();
	}

}