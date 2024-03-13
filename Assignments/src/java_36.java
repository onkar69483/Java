final class FinalClass {
    final void finalMethod() {
        System.out.println("This method is final and cannot be overridden.");
    }
}

public class java_36 {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
		finalClass.finalMethod();
    }
}
