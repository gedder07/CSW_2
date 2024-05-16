package GarbageCollection;
import java.util.concurrent.ThreadLocalRandom;

class NumberData {
	private int intVal;
	private double doubleVal;
	
	public void initialize(int intVal, double doubleVal) {
		this.intVal=intVal;
		this.doubleVal=doubleVal;
		}

	int getIntVal() {
		return intVal;
	}
	
	void setIntVal(int intVal) {
		this.intVal=intVal;
	}
	
	double getDoubleVal() {
		return doubleVal;
	}
	
	void setDoubleVal(double doubleVal) {
		this.doubleVal=doubleVal;
	}
	
	
}
public class Q5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runtime runtime = Runtime.getRuntime();
		long totalMemory = runtime.totalMemory();
		
		NumberData obj1 = new NumberData();
		NumberData obj2 = new NumberData();
		
		obj1.initialize(ThreadLocalRandom.current().nextInt(100), ThreadLocalRandom.current().nextDouble());
		obj2.initialize(ThreadLocalRandom.current().nextInt(100), ThreadLocalRandom.current().nextDouble());
		
		obj1 = null;
		obj2 = null;
		
		runtime.gc();
		
		long usedMemory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Total memory allocated: " + totalMemory + " bytes");
		System.out.println("Memory occupied by objects: " + usedMemory + " bytes");
		
	}

}
