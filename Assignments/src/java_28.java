public class java_28 {
    public static void main(String[] args) {
        IntWrapper a = new IntWrapper(5);
        IntWrapper b = new IntWrapper(10);
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a.value);
        System.out.println("b = " + b.value);
        
        swap(a, b);
        
        System.out.println("After swapping:");
        System.out.println("a = " + a.value);
        System.out.println("b = " + b.value);
    }
    
    public static void swap(IntWrapper x, IntWrapper y) {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
    }
}

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}
