package package2;

import package1.*;

public class Road		//Buid on line connecting location l1 and l2
{
	private Line line;
	private Location l1;
	private Location l2;
	private String name;
	private double width;

	public Road(Location l1, Location l2, String name, double width)		//Constructor
	{
		line = setline(l1, l2);
		this.l1 = l1;
		this.l2 = l2;
		this.name = name;
		this.width = width;
	}

	private Line setline(Location l1, Location l2)		//Method to set line member of road
	{
		Line newline = new Line(l1.getcoordinates(), l2.getcoordinates());
		return newline;
	}

	Line getline() {return line;}	//Methods to get various parameters of road
	double getwidth() {return width;}
	public Location getlocation1() {return l1;}
	public Location getlocation2() {return l2;}
	public String getname() {return name;}
}