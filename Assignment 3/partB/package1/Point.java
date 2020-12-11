package package1;

public class Point
{
	private double x;
	private double y;

	public Point(double x, double y)		//Constructor
	{
		this.x = x;
		this.y = y;
	}

	public void update(double x1, double y1)		//Method to update point
	{
		x = x1;
		y = y1;
	}

	double getx() {return x;}	//Methods to get x and y coordinates
	double gety() {return y;}

	double distance(double x1, double y1)		//Method to return distance between 2 points
	{
		return Math.sqrt((x - x1)*(x - x1) + (y - y1)*(y - y1));
	}
}