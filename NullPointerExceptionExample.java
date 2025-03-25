public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            
            String str = null;

                System.out.println(str.length()); 
        } catch (NullPointerException e) {
            System.out.println("Exception caught: Null reference encountered.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
