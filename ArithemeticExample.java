public class ArithemeticExample {
    public static void main(String[] args) {
        try {
            
            int a = 10;
            int b = 0;
            int result = a / b; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
