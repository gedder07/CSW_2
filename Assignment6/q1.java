
public class MemoryUsage {
	public static void main(String[] args) {
		
			// Using String literals
			String str1 = "Java";
			String str2 = "Java";
			
			String str3 = new String("Java");
			String str4 = new String("Java");
			
			System.out.println("str1 == str2 : " + (str1 == str2));
			System.out.println("str3 == str4 : " + (str3 == str4));
			
			System.out.println("str1.equals(str3) : " + str1.equals(str3)); 
			
	}

}
