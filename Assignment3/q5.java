import java.util.LinkedList;
import java.util.Scanner;
public class StudentApp {
public static void main(String[] args) {
LinkedList<Student> studentList = new LinkedList<>();
studentList.add(new Student("John", 20, 80));
studentList.add(new Student("Jane", 22, 90));
studentList.add(newStudent("Doe", 23, 70));
System.out.println("Initial Student List:");
for (Student student : studentList) {
System.out.println(student);
}
Scanner scanner = new Scanner(System.in);
System.out.println("\nEnter a Student object (name age mark): ");
String input = scanner.nextLine();
String[] parts = input.split(" ");
Student inputStudent = new Student(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
System.out.println("Search by reference: " + studentList.contains(inputStudent));
studentList.remove(inputStudent);
System.out.println("\nNumber of Students in the list: " + studentList.size());
System.out.println("\nUpdated Student List:");
for (Student student : studentList) {
System.out.println(student);
}
}
}
