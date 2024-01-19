
public class Calculator {
	private int operand1,operand2;

	public int getOperand1() {
		return operand1;
	}

	public void setOperand1(int operand1) {
		this.operand1 = operand1;
	}

	public int getOperand2() {
		return operand2;
	}

	public void setOperand2(int operand2) {
		this.operand2 = operand2;
	}
	public int add(int operand1, int operand2) {
		return operand1+operand2;
	}
	public int subtract(int operand1, int operand2) {
		return operand1-operand2;
	}
	public int multiply(int operand1, int operand2) {
		return operand1*operand2;
	}
	public float divide(int operand1, int operand2) {
		return operand1/operand2;
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int op1=4,op2=2;
		System.out.println("Addition: "+calculator.add(op1, op2));
		System.out.println("Subtraction: " + calculator.subtract(op1, op2));
		System.out.println("Multiply: "+calculator.multiply(op1, op2));
		System.out.println("Divide: "+calculator.divide(op1, op2) );
	}
}
