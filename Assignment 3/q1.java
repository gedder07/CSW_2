public class HandleNullPointerException {
public static void main(String[] args) {
String str = null;
try {
int length = str.length();
System.out.println("Length of string: " + length);
} catch (NullPointerException e) {
System.out.println("Caught NullPointerException: " + e.getMessage());
}
}
