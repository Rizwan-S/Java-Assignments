package widgets;
import display.Display;

public class Label extends Widget {  // does not react to mouse events
	// has a text string as data - which is provided at create time
	// width and height are determined from this
	// assume each character is 5 units wide and 10 units high
	private String text;

	public Label(String text){
		super(5*text.length() ,10);
		this.text = text;
	}
	
	// provides methods to get text
	String getText(){
		return text;
	}

	@Override
	void draw(){
		if(super.checkClickable() == true && super.checkClick() == true){	//If it is clickable and is clicked
			Display.drawText(this.getPos().getX(), this.getPos().getY(), text);
			super.setUnClickable();
		}
	}
}
