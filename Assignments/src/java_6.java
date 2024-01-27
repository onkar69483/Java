
public class java_6 {
	public static void main(String[] args) {
        // Checking if there are exactly 2 command line arguments
        if (args.length == 2) {
            // Parsing the command line arguments to integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Performing addition and subtraction
            int sum = num1 + num2;
            int difference = num1 - num2;

            // Displaying the results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
        } else {
            System.out.println("Kindly provide exactly 2 nums!");
        }
    }
}
