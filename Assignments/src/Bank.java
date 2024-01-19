import java.util.Random;

class Account {
	private int acc_no;
	public Account() {
		Random random = new Random();
		this.acc_no = random.nextInt(99999)+10000;
	}
	public int getAcc_no() {
		return acc_no;
	}
	
}

class Customers {
	private String c_name;
	private Account acc;
	private int balance;
	private Transaction transactions[];
	private int transaction_count;
	private Bank bank;
	public Customers(String c_name, int balance, Bank bank) {
		this.c_name = c_name;
		this.balance=balance;
		this.acc = new Account();
		this.transactions = new Transaction[10];
		this.bank = bank;
	}
	public void sendMoney(Customers c2, int amount) {
		if(transaction_count<10) {
			this.transactions[this.transaction_count] = new Transaction(this.acc, c2.acc, amount);
			this.transactions[this.transaction_count].setFlag("s");
			this.transaction_count++;
			c2.recieve(amount, this.transactions[this.transaction_count-1]);
			balance-=amount;
		}
		else {
			System.out.println("Transaction Limit Exceeded!");
		}
	}
	public void recieve(int amount, Transaction transaction) {
		this.balance += amount;
		this.transactions[this.transaction_count] = new Transaction(transaction);
		this.transactions[this.transaction_count].setFlag("r");
		bank.addTransaction(transaction);
		this.transaction_count++;
	}
	public void getTransactions() {
		System.out.println("Transaction Details: ");
		System.out.println("Customer Name: "+this.c_name);
		System.out.println("Account Number: "+this.acc.getAcc_no());
		for(int i=0; i<this.transaction_count; i++) {
			this.transactions[i].getDetail();
			System.out.println();
		}
		System.out.println("Balance: "+this.balance);
	}
}

class Transaction {
	private int t_id;
	private Account src,target;
	private int amt;
	private String flag;
	
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Transaction(Transaction transaction) {
		this.t_id = transaction.t_id;
		this.src = transaction.src;
		this.target = transaction.target;
		this.amt = transaction.amt;
	}
	public Transaction(Account src, Account target, int amt) {
		Random random = new Random();
		this.t_id = random.nextInt(999999)+100000;
		this.src = src;
		this.target = target;
		this.amt = amt;
	}

	public void getDetail() {
		System.out.print("Transaction Id: "+this.t_id);
		if(flag=="r") {
			System.out.print("	Money Recieved from Source Account: "+this.src.getAcc_no());
			System.out.print("	Recieved Amount: "+this.amt);
		}
		else if(flag=="s") {
			System.out.print("	Money Sent to Target Account: "+this.target.getAcc_no());
			System.out.print("	Sent Amount: "+this.amt);
		}
		else {
			System.out.print(" Source Account: "+this.src.getAcc_no());
			System.out.print(" Target Account: "+this.target.getAcc_no());
			System.out.print(" Amount: "+this.amt);
		}
		
	}
}

public class Bank {
	private String name;
	private Transaction transactions[];
	private int transaction_count;
	public Bank(String name){
		this.name = name;
		this.transactions = new Transaction[100];
	}
	public void addTransaction(Transaction transaction) {
		this.transactions[this.transaction_count] = new Transaction(transaction);
		this.transaction_count++;
	}
	public void getTransactions() {
		System.out.println("Bank Name: "+this.name);
		for(int i=0; i<this.transaction_count; i++) {
			this.transactions[i].getDetail();
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Bank bank = new Bank("HDFC");
		Customers c1 = new Customers("Onkar", 2000, bank);
		Customers c2 = new Customers("Mihir", 1500, bank);
		Customers c3 = new Customers("Sachin", 3000, bank);
		c1.sendMoney(c2, 450);
		c2.sendMoney(c1, 300);
		
		c1.getTransactions();
		System.out.println();
		c2.getTransactions();
		System.out.println();
		c3.getTransactions();
		
		System.out.println();
		bank.getTransactions();
	}
}

