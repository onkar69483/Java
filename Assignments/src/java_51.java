class NumberConverter {
    
    //String to Integer
    public static Integer stringToInteger(String str) {
        return Integer.valueOf(str);
    }
    
    //Integer to String
    public static String integerToString(Integer num) {
        return String.valueOf(num);
    }
    
    //String to Double
    public static Double stringToDouble(String str) {
        return Double.valueOf(str);
    }
    
    //Double to String
    public static String doubleToString(Double num) {
        return String.valueOf(num);
    }
    
    //Integer to Double
    public static Double integerToDouble(Integer num) {
        return num.doubleValue();
    }
    
    //Double to Integer
    public static Integer doubleToInteger(Double num) {
        return num.intValue();
    }
    public static void main(String[] args) {
        String strNumber = "123";
        System.out.println("String to Integer: " + stringToInteger(strNumber));

        Integer integerNumber = 456;
        System.out.println("Integer to String: " + integerToString(integerNumber));

        String strDouble = "3.14";
        System.out.println("String to Double: " + stringToDouble(strDouble));

        Double doubleNumber = 2.718;
        System.out.println("Double to String: " + doubleToString(doubleNumber));

        System.out.println("Integer to Double: " + integerToDouble(integerNumber));
        System.out.println("Double to Integer: " + doubleToInteger(doubleNumber));
    }
}

public class java_51 {
    public static void main(String[] args) {
        NumberConverter.main(args);
    }
}