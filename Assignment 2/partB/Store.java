import java.util.ArrayList;

class Store
{
	private Purchasing departmentP;
	private Sales departmentS;

	Store(Purchasing departmentP, Sales departmentS)	//Constructor for store
	{
		this.departmentP = departmentP;
		this.departmentS = departmentS;
	}

	private ArrayList<Book> books_purchased = new ArrayList<Book>();	//List of books ever purchased

	void addbook(int year, int purchase_price)
	{
		Book newbook = departmentP.addbook(year, purchase_price);	//Method to add new book via purchasing dept.
		books_purchased.add(newbook);		//Insert book in list
	}

	void findrevenue(int year, String bookID)		//Method to find revenue via sales dept.
	{
		for(int i = 0; i < books_purchased.size(); i++)
		{
			if(bookID.equals(books_purchased.get(i).getID()))
			{
				departmentS.addbook(books_purchased.get(i));		//Add book in sold books
			}
		}
		departmentS.findrevenue(year, bookID);		//Calculate revenue
	}
}