public class Cylinder {
	private double radius;
	private double height;
	private Circle cir;
	public Cylinder(double rad, double h) {
		cir = setcircle(rad);
		radius = rad;
		height = h;
	}

	private Circle setcircle(double rad)
	{
		Circle newcircle = new Circle(rad);
		return newcircle;
	}

	public double getArea() {
		// should use appropriate methods of Circle to get properties of the base circle
		double area = cir.getCircumference()* height + 2 * cir.getArea();
		return area;
	}
	public double getVolume() {
		// should use appropriate methods of Circle to get properties of the base circle
		double vol = cir.getArea() * height;
		return vol;
	}
	
}