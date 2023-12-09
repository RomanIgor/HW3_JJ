import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SerializableTextFileManager {

    // Method to save the object to a text file
    public static void saveObject(Serializable obj) {
        String fileName = "file.txt";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(obj);
            System.out.println("Object saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error saving object to file: " + e.getMessage());
        }
    }

    // Method to load the object from the file
    public static Object loadObject() {
        String fileName = "file.txt";
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            Object obj = inputStream.readObject();
            System.out.println("Object loaded from file: " + fileName);
            return obj;
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Error loading object from file: " + e.getMessage());
        }
        return null;
    }

    //  method to delete the file
    static void deleteFile(String fileName) {
        try {
            Files.deleteIfExists(Paths.get(fileName));
            System.out.println("File deleted: " + fileName);
        } catch (IOException e) {
            System.err.println("Failed to delete the file: " + fileName);
        }
    }
}
