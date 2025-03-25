import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        // Specify the file name (ensure the file exists in the same directory or provide full path)
        String fileName = "example.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
