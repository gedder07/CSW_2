package ErrorHandling;

public class Q16 {
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5};
		
		try {
			int number=arr[7]+3;
			System.out.println(number);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You are trying to access an index which is not present.");
		}
	}
}
