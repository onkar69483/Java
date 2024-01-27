
public class java_5 {
	public static void main(String[] args) {
        // Check if there is at least one command line argument
        if (args.length > 0) {
            // Concatenate all command line arguments to form the message
            StringBuilder message = new StringBuilder();
            for (String arg : args) {
                message.append(arg).append(" ");
            }

            // Display the message
            System.out.println("Entered Arguments are: " + message.toString().trim());
        } else {
            System.out.println("No command line arguments entered!");
        }
    }
}
