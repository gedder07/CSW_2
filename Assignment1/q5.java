public class q5 {
private String clgname;
private String clgloc;
public College(String  clgname , String clgloc ) {
this. clgname = clgname;
this.clgloc =clgloc;
}
public String getCollegeName() {
return clgname ;
}
public void setCollegeName(String collegeName) {
this.clgname =clgname;
}
public String getCollegeLoc() {
return  clgloc;
}
public void setCollegeLoc(String collegeLoc) {
this. clgloc =  clgloc;
}
public String toString() {
return "College [collegeName=" + collegeName + ", collegeLoc=" + collegeLoc + "]";
}
}
public class Student {
private int studentId;
private String studentName;
private College college;
public Student(int studentId, String studentName, College college) {
this.studentId = studentId;
this.studentName = studentName;
this.college = college;
}
public int getStudentId() {
return studentId;
}
public void setStudentId(int studentId) {
this.studentId = studentId;
}
public String getStudentName() {
return studentName;
}
public void setStudentName(String studentName) {
this.studentName = studentName;
}
public College getCollege() {
return college;
}
public void setCollege(College college) {
this.college = college;
}
public void displayStudentInfo() {
System.out.println("Student ID: " + studentId);
System.out.println("Student Name: " + studentName);
System.out.println("College Name: " + college.getclgname());
System.out.println("College Location: " + college.getclgloc());
}
}
public class Main {
public static void main(String[] args) {
College college1 = new College("qeqw", "khuran", qwef");
College college2 = new College("ggreg", "gdikfghu, hjh");
Student student1 = new Student(1, "juuuty", college1);
Student student2 = new Student(2, "ponyyy", college2);
System.out.println("College 1: " + college1);
System.out.println("College 2: " + college2);
System.out.println("\nStudent 1 Info:");
student1.displayStudentInfo();
System.out.println("\nStudent 2 Info:");
student2.displayStudentInfo();
}
}
