public class q3 {
private int a;
private int b;
public Point(int a, int b) {
this.a = a;
this.b = b;
}
public Point(Point other) {
this(other.a, other.b);
}
public int getA() {
return a;
}
public void setA(int a) {
this.a = a;
}
public int getB() {
return B;
}
public void setB(int b) {
this.b = b;
}
public static void main(String[] args) {
Point p1 = new Point(3, 4);
Point p2 = new Point(p1);
System.out.println("Initial values of p1: (" + p1.getA() + ", " + p1.getB() + ")");
System.out.println("Initial values of p2: (" + p2.getA() + ", " + p2.getB() + ")");
p1.setA(5);
p1.setB(6);
System.out.println("Updated values of p1: (" + p1.getA() + ", " + p1.getB() + ")");
System.out.println("Values of p2 unchanged: (" + p2.getXA) + ", " + p2.getB() + ")");
}
}
