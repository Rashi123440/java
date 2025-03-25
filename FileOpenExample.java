import java.io.File;
   import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileOpenExample {
    public static void main(String[] args) {
        try {
            // Specify the file path
            File file = new File("example.txt");

            // Create a Scanner to read the file
            Scanner scanner = new Scanner(file);

            // Read and print file contents
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: File not found.");
        } finally {
            System.out.println("File operation completed.");
        }
    }
}
