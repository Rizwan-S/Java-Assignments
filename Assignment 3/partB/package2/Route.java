package package2;

import package1.*;
import java.util.*;

public class Route
{
	private ArrayList<Road> roads = new ArrayList<Road>();

	public ArrayList<Road> getroads() {return roads;}	//Method to get list of roads

	public void addroad(Road road)		//Method to add road to the list
	{
		roads.add(road);
	}

	static public boolean isConnected(ArrayList<Road> roads)	//Method to check if the road is connected or not
	{
		for(int i = 0; i < roads.size() - 1; i++)
		{
			if(roads.get(i).getlocation2() != roads.get(i+1).getlocation1())
			{
				return false;
			}
		}
		return true;
	}

	public double getlength()	//Method to get length of route
	{
		ArrayList<Line> roadlines = new ArrayList<Line>();
		for(Road road: roads)
		{
			roadlines.add(road.getline());
		}
		return Line.totalLength(roadlines);
	}

	public double getwidth()	//Method to get width of vehicle
	{
		double width = roads.get(0).getwidth();
		for(Road road: roads)
		{
			if(road.getwidth() < width)
			{
				width = road.getwidth();
			}
		}
		return width;
	}
}

