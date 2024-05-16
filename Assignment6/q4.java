import java.util.Scanner;
public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		System.out.print("Enter initial string: ");
		sb.append(sc.nextLine());
		
		while (true) {
			System.out.println("\n1. Add substring \n2. Remove characters \n3. Modify character\n4. Concatenate string \n5. Show string \n6. Exit");
			System.out.print("Choose operation: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
				case 1:
					System.out.print("Enter substring and position: ");
					String substr = sc.nextLine();
					int pos = sc.nextInt();
					sb.insert(pos, substr);
					break;
				
				case 2:
					System.out.print("Enter the starting index: ");
					int startIdx=sc.nextInt();
					System.out.print("Enter the ending index: ");
					int endIdx=sc.nextInt();
					sb.delete(startIdx, endIdx);
					break;
				
				case 3:
					System.out.print("Enter the starting index: ");
					int startIdx1=sc.nextInt();
					System.out.print("Enter the ending index: ");
					int endIdx1=sc.nextInt();
					
					System.out.print("Enter the new string to replace:");
					String substr1=sc.nextLine();
					sb.replace(startIdx1, endIdx1, substr1);
					break;
				
				case 4:
					System.out.print("Enter the new string: ");
					String constr=sc.nextLine();
					
					sb.append(constr);
					break;
				
				case 5:
					System.out.println("Current Buffer: " + sb);
					System.out.println("Length: " + sb.length() + ", Capacity: " + sb.capacity());
					break;
				
				case 6:
					System.out.println("Thanks for using.");
					sc.close();
					System.exit(0);
			}
			
		}
		
	}
}
