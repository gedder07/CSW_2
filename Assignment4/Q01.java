package ErrorHandling;
public class Q01 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=null;
		try {
			int size=str.length();
			System.out.println("Size of string is :"+size);
		}catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}
	}

}
