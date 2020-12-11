import java.util.ArrayList;

class Sales
{
	private ArrayList<Book> books_sold = new ArrayList<Book>();
	private ArrayList<Integer> year = new ArrayList<Integer>();
	private ArrayList<Integer> revenue1 = new ArrayList<Integer>();
	private ArrayList<Integer> revenue2 = new ArrayList<Integer>();
	private ArrayList<Integer> revenue3 = new ArrayList<Integer>();

	void addbook(Book book)			//Method to add book in the list of sold books
	{
		books_sold.add(book);
	}
	
	void findrevenue(int years, String bookID)		//Method to find revenue
	{
		int indexofyear = year.indexOf(years);
		int y = Integer.valueOf(bookID.substring(0,4));

		Book book = books_sold.get(books_sold.size() - 1);
		int price = book.getSellPrice();

		if(indexofyear == -1)		//For any new year
		{
			year.add(years);
			if(years - y == 0)
			{
				revenue1.add(price);
				revenue2.add(0);
				revenue3.add(0);
			}
			else if(years - y == 1)
			{
				revenue1.add(0);
				revenue2.add(price);
				revenue3.add(0);
			}
			else if(years - y == 2)
			{
				revenue1.add(0);
				revenue2.add(0);
				revenue3.add(price);
			}
		}
		else 					//For existing year.
		{
			if(years - y == 0)
			{
				int old = revenue1.get(indexofyear);
				revenue1.set(indexofyear, old + price);
			}
			else if(years - y == 1)
			{
				int old = revenue2.get(indexofyear);
				revenue2.set(indexofyear, old + price);
			}
			else if(years - y == 2)
			{
				int old = revenue3.get(indexofyear);
				revenue3.set(indexofyear, old + price);
			}
		}
	}	

	void printSales()		//Method to print sales
	{	
		for(int i = 0; i < year.size(); i++)
		{
			System.out.println(year.get(i) + " " + revenue1.get(i) + " " + revenue2.get(i) + " " + revenue3.get(i));
		}
	}
}
