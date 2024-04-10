package lab6ex4;
public class Circle implements Shape
{
private double radius;
public Circle(double radius) {
super();
this.radius = radius;
}
@Override
public double getArea() {
return (Math.PI*this.radius*this.radius);
}
}