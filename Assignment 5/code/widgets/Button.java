package widgets;
import display.Display;

public class Button extends Widget implements Clickable {
	private String text;

	public Button(String text, int width, int height) { 
		super(width, height);
		this.text = text;
	}
	
	// has methods to get/set text
	protected String getText(){
		return text;
	}

	protected void setText(String text){
		this.text = text;
	}

	// implements/overrides draw to draw a box at the correct position and size
	// and displays the text of the button
	public void draw(){
		if(super.checkClickable() == true && super.checkClick() == true){
			Display.drawBox(this.getPos().getX(), this.getPos().getY(), this.getPos().getX() + this.getWidth(), this.getPos().getY() + this.getHeight());
			Display.drawText(this.getPos().getX(), this.getPos().getY(), text);
			super.unclick();
		}
	}

	
	// implement the onClick method to check if the click is within its bounds
	// and if so, invokes protected method handleClick
	public void onClick(Location clicked){
		if(clicked.getX() > this.getPos().getX() && clicked.getX() < this.getPos().getX() + this.getWidth()){
			if(clicked.getY() > this.getPos().getY() && clicked.getY() < this.getPos().getY() + this.getHeight()){
				super.click();
				handleClick();
			}
		}
	}	
	
	protected void handleClick() {  // should we make this abstract?
		String clicked = "Error";
		System.out.println(clicked);
	}
}
