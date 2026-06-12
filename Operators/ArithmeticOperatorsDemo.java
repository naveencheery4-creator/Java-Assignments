public class ArithmeticOperatorsDemo {

    public void arithmeticOperations(int a, int b) {

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }

    public static void main(String[] args) {

        ArithmeticOperatorsDemo obj = new ArithmeticOperatorsDemo();
        obj.arithmeticOperations(20, 10);
    }
}
