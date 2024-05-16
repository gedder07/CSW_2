
public class PerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ITERATIONS = 100000;
		
		String baseString = "Hello";
		
		
		// StringBuilder performance test
		
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < ITERATIONS; i++) {
			sb.append(baseString);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("StringBuilder time: " + (endTime - startTime) + " ms");
		
		
		// StringBuffer performance test
		
		startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < ITERATIONS; i++) {
			buffer.append(baseString);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer time: " + (endTime - startTime) + " ms");
		
	}

}
