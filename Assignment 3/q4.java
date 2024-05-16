import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class FileNotFoundException extends Exception {
public FileNotFoundException(String message) {
super(message);
}
}
class FileReadPermissionException extends Exception {
public FileReadPermissionException(String message) {
super(message);
}
}
public class Main {
public static void main(String[] args) {
if (args.length != 1) {
System.err.println("Usage: java Main <file_path>");
return;
}
String filePath = args[0];
try {
readAndPrintFileContents(filePath);
} catch (FileNotFoundException e) {
System.err.println("File not found: " + e.getMessage());
} catch (FileReadPermissionException e) {
System.err.println("File read permission issue: " + e.getMessage());
} catch (IOException e) {
System.err.println("Error reading file: " + e.getMessage());
}
}
public static void readAndPrintFileContents(String filePath) throws IOException, FileNotFoundException, FileReadPermissionException {
if (filePath == null) {
throw new FileNotFoundException("File path is null");
}
File file = new File(filePath);
if (!file.exists()) {
throw new FileNotFoundException("File does not exist: " + filePath);
}
if (!file.canRead()) {
throw new FileReadPermissionException("Cannot read the file: " + filePath);
}
try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
String line;
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
}
}
}
