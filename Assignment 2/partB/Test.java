import java.util.Scanner;
import java.util.ArrayList;

public class Test
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		boolean in = false;

		Purchasing pdep = new Purchasing();
		Sales sdep = new Sales();
		Store s1 = new Store(pdep, sdep);

		while(in == false)
		{
			int year = scan.nextInt();		//input year and price
			int price = scan.nextInt();
			if(year == 0 && price == 0)		//Marker for change in input type
			{
				in = true;
			}
			else if(year == -1 && price == -1)		//A way to change the factor(used to calculate selling price of book). Assumption was made that the store will not change the factor while calculating revenue.
			{
				double factor = scan.nextDouble();
				pdep.changefactor(factor);
			}
			else
			{
				s1.addbook(year, price);	//Add book
			}
		}

		while(in == true)
		{
			int year = scan.nextInt();		//input year and bookID
			String bookid = scan.next();
			if(year == 0)
			{
				in = false;				//Marker for input end
			}
			else
			{
				s1.findrevenue(year, bookid);	//Find revenue
			}
		}
		sdep.printSales();		//Calculate sales
	}
}

