package package1;

import java.util.*;

public class Line
{
	private Point p1;
	private Point p2;

	public Line(Point p1, Point p2)	//Constructor
	{
		this.p1 = p1;
		this.p2 = p2;
	}

	public void update(Point a1, Point a2) 	//Method to update Line
	{
		p1 = a1;
		p2 = a2;
	}

	private double length()			//Method to get length of point
	{
		return p1.distance(p2.getx(), p2.gety());
	}

	static public double totalLength(ArrayList<Line> lines)	//Method to get total length of lines passed through arraylist
	{
		double len = 0;
		for(Line line: lines)
		{
			len = len + line.length(); 
		}
		return len;
	}
}