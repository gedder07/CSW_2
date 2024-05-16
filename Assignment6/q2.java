
public class StringImmutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hello";
		System.out.println("Original String: " + str);
		
		str.concat(" World");
		System.out.println("After concat: " + str);
		
		str = str.concat(" World");
		System.out.println("After correct concat: " + str);
		
		CharSequence cs = "Immutable";
		System.out.println("Char at 3 in CharSequence: " + cs.charAt(3));
	}

}
