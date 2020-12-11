import java.util.*;
import package1.*;
import package2.*;

public class Test
{
	public static void main(String[] args) {

		ArrayList<Road> allroads = new ArrayList<Road>();
		ArrayList<Location> locations = new ArrayList<Location>();
		ArrayList<Route> routes = new ArrayList<Route>();
		Scanner scan = new Scanner(System.in);

		int n1 = scan.nextInt();
		for(int i = 0; i < n1; i++)		//Insert locations in the list of locations
		{
			int x = scan.nextInt();
			int y = scan.nextInt();
			String locationname = scan.next();

			Point p = new Point(x* 1.0, y * 1.0);
			Location l = new Location(locationname, p);

			locations.add(l);
		}

		int n2 = scan.nextInt();
		for(int i = 0; i < n2; i++)		//Insert roads in the list of roads
		{
			int p1 = scan.nextInt();
			int p2 = scan.nextInt();
			String roadname = scan.next();
			Float width = scan.nextFloat();
			Double tempwidth = width.doubleValue();

			Road newroad = new Road(locations.get(p1), locations.get(p2), roadname, tempwidth);
			allroads.add(newroad);
		}

		int n3 = scan.nextInt();
		for(int i = 0; i < n3; i++)		//Insert routes in the list of routes
		{
			int n4 = scan.nextInt();
			Route newroute = new Route();
			for(int j = 0; j < n4; j++)
			{
				int n5 = scan.nextInt();
				newroute.addroad(allroads.get(n5));
			}
			routes.add(newroute);
		}

		int routenumber = 1;
		for(Route route: routes)		//Get the valid output according to the route
		{
			if(Route.isConnected(route.getroads()) == false)		//If the roads in route is not connected
			{
				System.out.println("Route " + routenumber + ": Invalid route");
			}
			else 		//If the roads in the route are connected.
			{
				System.out.format("Route %d: Length %.2f, max width %.2f: ", routenumber, route.getlength(), route.getwidth());
				System.out.printf("Start at %s. ", route.getroads().get(0).getlocation1().getname());
				ArrayList<Road> currentroute = route.getroads();
				for(Road road: currentroute)
				{
					System.out.printf("Follow %s to %s. ", road.getname(), road.getlocation2().getname());
				}
				System.out.println();
			}
			routenumber = routenumber + 1;
		}
	}
}

