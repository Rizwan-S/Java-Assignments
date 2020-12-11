import java.util.ArrayList;

class Book
{
	static private ArrayList<Integer> yearID = new ArrayList<Integer>();
	static private ArrayList<Integer> id = new ArrayList<Integer>();
	private String bookID;
	private int selling_price;

	Book(String book, int selling_price)	//Constructor
	{
		this.bookID = setID(book);
		this.selling_price = selling_price;
	}

	private String setID(String bookid)			//Method to assign unique ID to each book
	{
		int findyear = yearID.indexOf(Integer.valueOf(bookid));
		String val = "0";
		if(findyear == -1)
		{
			yearID.add(Integer.valueOf(bookid));
			id.add(1);
			val = "1";
		}
		else
		{
			int idincrement = id.get(findyear);
			val = Integer.toString(idincrement + 1);
			idincrement = idincrement + 1;
			id.set(findyear, idincrement);
		}
		bookid = bookid + "-";
		for(int i = 0; i < 6 - val.length(); i++)
		{
			bookid += "0";
		}
		bookid += val;
		return bookid;
	}

	int getSellPrice(){return selling_price;}		//Method to return selling price

	String getID(){return bookID;}	//Method to return book id
}
