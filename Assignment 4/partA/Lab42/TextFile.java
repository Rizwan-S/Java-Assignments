
class TextFile extends File {
	// add constructor - takes name and String text. 
	
	private String text;

	TextFile(String n, String t)
	{
		super(n);
		text = t;
	}


	String getText() { return text; }
	
	// redefine getSize. 
	// Size can be computed as length of the string, converted to bytes plus the overhead

	@Override
	int getSize() 
	{
		int size = super.getSize() + text.length();
		return size;
	}
	
}
