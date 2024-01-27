
class BankAccount{
	private int accNum;
	private String name;
	private float bal;
	
	public static int totalAcc;
	
	public BankAccount() {
		totalAcc++;
	}
	
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	public static int getTotalAcc() {
		return totalAcc;
	}
	public static void setTotalAcc(int totalAcc) {
		BankAccount.totalAcc = totalAcc;
	}
	
	public void depositMoney(float amt) {
		this.bal += amt;
		System.out.println("\nMoney Deposited!\nCheck amt: "+amt);
	}
	
	public void withdrawMoney(float amt) {
		if(amt<=this.bal) {
			this.bal -= amt;
			System.out.println("\nMoney Withdrawn!\nCheck amt: "+amt);
		}
		else {
			System.out.println("\nInsufficient Balance!");
		}
	}
	public void getAccDetails() {
		System.out.println("\nCustomer Account Details");
		System.out.println("Account number: "+this.accNum);
		System.out.println("Account Holder: "+this.name);
		System.out.println("Balance: "+this.bal);
	}
}


public class java_11 {
	public static void main(String[] args) {
		BankAccount onkar = new BankAccount();
		BankAccount prem = new BankAccount();
		onkar.setAccNum(12345);
		onkar.setBal(2000);
		onkar.setName("Onkar Mendhapurkar");
		
		prem.setAccNum(54321);
		prem.setBal(6000);
		prem.setName("Prem Mendhapurkar");
		
		onkar.depositMoney(500);
		System.out.println("New Balance: "+onkar.getBal());
		
		onkar.withdrawMoney(250);
		System.out.println("New Balance: "+onkar.getBal());
		
		onkar.getAccDetails();
		
		prem.depositMoney(900);
		System.out.println("New Balance: "+prem.getBal());
		
		prem.withdrawMoney(500);
		System.out.println("New Balance: "+prem.getBal());
		
		prem.getAccDetails();
		
		System.out.println("\nTotal Number of Accounts: "+onkar.getTotalAcc());
	}
}
