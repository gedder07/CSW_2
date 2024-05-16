package ErrorHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@SuppressWarnings("serial")
class FileNotFoundException extends Exception {
	public FileNotFoundException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class FileReadPermissionException extends Exception {
	public FileReadPermissionException(String message) {
		super(message);
	}
}

public class Q04 {

	public static void readFile(String filePath) throws FileNotFoundException,FileReadPermissionException, IOException {
		if(filePath==null) throw new NullPointerException("File path is null");
		File file=new File(filePath);
		
		if(!file.exists()) throw new FileNotFoundException("File does not exist: "+filePath);
		if(!file.canRead()) throw new FileReadPermissionException("Permission denied to access file: "+filePath);
		
		try(BufferedReader reader=new BufferedReader(new FileReader(file))){
			String line;
			while((line=reader.readLine()) != null) System.out.println(line);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath=args[0];
		
		try {
			readFile(filePath);
		}catch(FileNotFoundException e) {
			System.err.println("File not found: "+e.getMessage());
		}catch(FileReadPermissionException e) {
			System.err.println("Can't read file because permission denied: "+e.getMessage());
		}catch(IOException e) {
			System.err.println("IOException occurred: "+e.getMessage());
		}
	}

}
