import java.util.Scanner;
public class StringExplorer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		while (true) {
			System.out.println("1. To lowercase\n2. To uppercase\n3. Search character\n4. Concatenate\n5. Exit");
			System.out.print("Choose an operation: ");
			int choice = sc.nextInt();
			sc.nextLine(); 
			
			switch (choice) {
				case 1:
					System.out.println(str.toLowerCase());
					break;
					
				case 2:
					System.out.println(str.toUpperCase());
					break;
					
				case 3:
					System.out.print("Enter character to search for: ");
					char c = sc.nextLine().charAt(0);
					System.out.println("First occurrence: " + str.indexOf(c));
					break;
					
				case 4:
					System.out.print("Enter string to concatenate: ");
					String toConcat = sc.nextLine();
					str += toConcat;
					System.out.println("New string: " + str);
					break;
					
				case 5:
					System.out.println("Thanks for using.");
					sc.close();
					System.exit(0);
					
				default:
					System.out.println("Invalid choice");
					break;
			}
		}

	}

}
