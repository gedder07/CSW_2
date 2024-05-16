public class Student {
private String name;
private int age;
private int mark;
public Student(String name, int age, int mark) {
this.name = name;
this.age = age;
this.mark = mark;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public int getMark() {
return mark;
}
public void setMark(int mark) {
this.mark = mark;
}
public boolean equals(Object obj) {
if (obj == null) {
return false;
}
if (getClass() != obj.getClass()) {
return false;
}
Student other = (Student) obj;
if (age != other.age) {
return false;
}
if (mark != other.mark) {
return false;
}
if (!name.equals(other.name)) {
return false;
}
return true;
}
public String toString() {
return String.format("Student [name=%s, age=%d, mark=%d]", name, , age, mark);
}
}
