import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadResourceFileExample {
    public static void main(String[] args) {
        // Attempt to read a text file from the classpath resources
        try {
            // Get the InputStream for the resource file
            InputStream inputStream = ReadResourceFileExample.class.getResourceAsStream("/example.txt");
            
            // Check if the resource was found
            if (inputStream == null) {
                System.err.println("Resource not found.");
                return;
            }
            
            // Read and print the content of the resource file
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            // Close the resources
            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}