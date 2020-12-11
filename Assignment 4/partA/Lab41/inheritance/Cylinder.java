
//It makes sense to use cyclinder as derived class of circle as one can think cylinder to be a stretched circle wherein, most of the formulas are similar.


public class Cylinder extends Circle{
	private double height;
	public Cylinder(double rad, double h) {
		super(rad);
		height = h;
	}

	@Override
	public double getArea() {
		// should use appropriate methods of Circle to get properties of the base circle
		double area = 2 * super.getArea() + super.getCircumference() * height;
		return area;
	}

	public double getVolume() {
		// should use appropriate methods of Circle to get properties of the base circle
		double vol = super.getArea() * height;
		return vol;
	}
	
}