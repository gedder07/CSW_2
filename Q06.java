package ErrorHandling;
import java.util.Scanner;
public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter a number: ");
			String str=sc.next();
			Integer num=Integer.parseInt(str);
			System.out.println("You entered: "+num);
		}catch(NumberFormatException e) {
			System.err.println("Please enter a numeric value. ");
		}finally {
			sc.close();
		}
	}

}
