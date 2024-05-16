package ErrorHandling;
import java.util.Scanner;
public class Q05 {
	static double mathCalculation(double input) {
		return Math.log(input)*Math.tan(input);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter a number:");
			double num=sc.nextDouble();
			System.out.println("Result: "+mathCalculation(num));
		}catch(NullPointerException e) {
			System.err.println("Null value can't be calculated: "+e.getMessage());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}finally {
			sc.close();
		}
	}

}
