package lab6ex4;

public class Rectangle implements Shape {
private double width, height;
public Rectangle(double width, double height) {
this.width = width;
this.height = height;
}
@Override
public double getArea() {

return this.width * this.height;
}
}