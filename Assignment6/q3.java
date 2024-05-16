import java.util.Scanner;
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		StringBuffer buffer = new StringBuffer();
		
		while (true) {
			System.out.println("\n1. Append \n2. Insert \n3. Delete \n4. Reverse \n5. Replace \n6. Exit");
			System.out.print("Choose an operation: ");
			
			int choice = sc.nextInt();
			sc.nextLine(); 
			switch (choice) {
				case 1:
					System.out.print("Enter string to append: ");
					buffer.append(sc.nextLine());
					break;
				case 2:
					System.out.print("Enter index and string to insert: ");
					int insertIndex = sc.nextInt();
					sc.nextLine();
					buffer.insert(insertIndex, sc.nextLine());
					break;
				case 3:
					System.out.print("Enter start and end indices to delete: ");
					int start = sc.nextInt();
					int end = sc.nextInt();
					buffer.delete(start, end);
					break;
				case 4:
					buffer.reverse();
					break;
				case 5:
					System.out.print("Enter start, end index, and replacement string: ");
					start = sc.nextInt();
					end = sc.nextInt();
					sc.nextLine();
					buffer.replace(start, end, sc.nextLine());
					break;
				case 6:
					System.out.println("Thanks for using.");
					sc.close();
					System.exit(0);
				default:
					System.out.println("Invalid choice!");
			}
			
			System.out.println("Current Buffer: " + buffer);
			System.out.println("Length: " + buffer.length() + ", Capacity: " + buffer.capacity());
		}
		
	}
}
