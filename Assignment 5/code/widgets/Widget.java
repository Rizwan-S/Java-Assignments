package widgets;

public abstract class Widget {
	private int width;
	private int height;
	private Location position;
	private boolean isclicked = true;
	private boolean isclickable = true;

	public Widget(int width, int height) {
		this.width = width;
		this.height = height;	
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}
	
	public void setPos(Location p) {    // what is appropriate access specifier here?
		// position of lower left corner of widget in global coordinates of Display
		position = p;
	}
	
	public Location getPos() {   // what is the appropriate access specifier here?
		return position;
	}

	//Methods to click and unclick the button and check its status
	void click(){	
		isclicked = true;
	}

	public void unclick(){
		isclicked = false;
	}

	public boolean checkClick(){
		return isclicked;
	}
	
	//Methods to set button as clickable or not and also return its status
	void setClickable(){
		isclickable = true;
	}

	void setUnClickable(){
		isclickable = false;
	}

	public boolean checkClickable(){
		return isclickable;
	}

	abstract void draw(); // widget uses methods of Display to draw an outline
					      // and any text within the outline
	// widgets should redraw themselves only if they have changed since last 
	// draw 
	
	
}
