
public class ThreadDemo3 {
	public static void main(String[] args) {
		PrintTable table = new PrintTable();
		TablePrintThread t1 = new TablePrintThread(5, table);
		TablePrintThread t2 = new TablePrintThread(6, table);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}


class PrintTable{
	public void calculate(int num) {
		try {
			for(int i=1; i<=10; i++) {
				System.out.println(num*i);
			}
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

class TablePrintThread extends Thread{
	private int num;
	PrintTable pt;
	public TablePrintThread(int num, PrintTable pt) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.pt = pt;
	}
	public void run() {
		synchronized (pt) {
			pt.calculate(num);
		}
	}
}