public class Rectangle{
private double len;
private double wid;
public Rectangle(double len, double wid) {
if (length <= 0 || width <= 0) {
throw new IllegalArgumentException("Length and width must be positive numbers.");
}
this.len = len;
this.wid = wid;
}
public double getLength() {
return len;
}
public void setLength(double length) {
if (len <= 0) {
throw new IllegalArgumentException("Length must be a positive number.");
}
this.len = len;
}
public double getWidth() {
return wid;
}
public void setWidth(double width) {
if (wid <= 0) {
throw new IllegalArgumentException("Width must be a positive number.");
}
this.wid = wid;
}
public double calculateArea() {
return len * wid;
}
public double calculatePerimeter() {
return 2 * (len + wid);
}
public static void main(String[] args) {
Rectangle rectangle = new Rectangle(5, 4);
System.out.println("Area: " + rectangle.calculateArea());
System.out.println("Perimeter: " + rectangle.calculatePerimeter());
rectangle.setLength(98);
rectangle.setWidth(43);
System.out.println("Updated area: " + rectangle.calculateArea());
System.out.println("Updated perimeter: " + rectangle.calculatePerimeter());
}
