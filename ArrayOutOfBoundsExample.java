public class ArrayOutOfBoundsExample {
    public static void main(String[] args) {
        try {
        
            int[] numbers = {1, 2, 3, 4, 5};

            
            System.out.println("Value: " + numbers[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
