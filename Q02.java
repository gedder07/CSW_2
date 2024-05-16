package ErrorHandling;
import java.util.Scanner;
public class Q02 {

	public static void displayNumeric(String str) {
		if(str.isEmpty()) throw new NullPointerException("Input string is empty.");
		boolean found=false;
		
		System.out.print("Numeric characters:");
		
		for(int i=2;i<str.length();i++) {
			if(isVowel(str.charAt(i-2)) && isConsonant(str.charAt(i-1)) && Character.isDigit(str.charAt(i))) {
				System.out.print(str.charAt(i)+" ");
				found=true;
			}
		}
		if(!found) System.out.println("No such numeric character is present.");
	}
	
	public static boolean isVowel(char character) {
		return "aeiouAEIOU".indexOf(character)!=-1;
	}
	
	public static boolean isConsonant(char character) {
		return !isVowel(character) && Character.isLetter(character);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a string:");
		String input=sc.nextLine();
		
		try {
			displayNumeric(input);
		}catch(NullPointerException e) {
			System.err.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}

}
