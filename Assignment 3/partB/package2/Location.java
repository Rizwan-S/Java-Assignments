package package2;

import package1.*;

public class Location
{
	private String name;
	private Point coordinates;

	public Location(String name, Point coordinates)	//Constructor
	{
		this.name = name;
		this.coordinates = coordinates;
	}

	public String getname(){return name;}		//Method to get name of location
	Point getcoordinates(){return coordinates;}		//Method to get coordinates of location
}