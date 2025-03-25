import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {
        String sourceFile = "source.txt"; 
        String destinationFile = "destination.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {
            
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error copying the file: " + e.getMessage());
        }
    }
}
