class Purchasing
{
	static double factor = 1.5;

	void changefactor(double newfactor)	//Method to change the factor 
	{
		factor = newfactor;
	}

	Book addbook(int year, int purchase_price)		//Method to add book in purchasing class
	{
		Double sp = factor * purchase_price;
		int selling_price = sp.intValue();
		Book newbook = new Book(Integer.toString(year), selling_price);
		return newbook;
	}
}
