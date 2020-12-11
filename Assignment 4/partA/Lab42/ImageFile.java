

class ImageFile extends File {
	// add constructor - takes name, image width, image (char array) - compute size from this array
	
	private int width;
	private char[] image;

	ImageFile(String n, int w, char[] imag)
	{
		super(n);
		width = w;
		image = new char[]{};
	}

	char[] getImage() {
		return image;	
	}
	// redefine getSize. Size can be computed as size of the image array plus overhead

	@Override
	int getSize()
	{
		return super.getSize() + image.length();
	}
	
}