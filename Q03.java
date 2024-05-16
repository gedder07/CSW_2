package ErrorHandling;

@SuppressWarnings({"serial"})
class CustomNullPointerException extends RuntimeException {
	public CustomNullPointerException(String message) {
		super(message);
	}
}
public class Q03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input=null;
		
		try {
			if(input==null) throw new CustomNullPointerException("Input string is null.");
		}catch(CustomNullPointerException e) {
			System.err.println(e.getMessage());
		}
	}

}
