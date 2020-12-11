// move these into separate files

public class Circle {
	private double radius;
	public Circle(double rad) {
		radius = rad;
	}
	public double getArea() { 
		double area = 22 * radius * radius / 7;
		return area;
	}
	public double getCircumference() {
		double circum = 44 * radius / 7;
		return circum;
	}
}