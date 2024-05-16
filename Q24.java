package ErrorHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

@SuppressWarnings({"unused","resource"})
public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			FileReader reader=new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("File read successfully.");
	}

}
