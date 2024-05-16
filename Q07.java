package ErrorHandling;
import java.util.Scanner;

public class Q07 {
	
	@SuppressWarnings("resource")
	public static int convertToInteger(String input) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            try {
                number = Integer.parseInt(input);
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter an integer for conversion.");
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
                input = sc.nextLine();
            }
        }

        return number;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.nextLine();

        int number = convertToInteger(input);

        System.out.println("Integer value: " + number);
        
        sc.close();
    }

    
}
