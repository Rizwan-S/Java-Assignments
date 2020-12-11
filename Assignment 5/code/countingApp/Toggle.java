package countingApp;

import widgets.Button;
import display.Display;

public class Toggle extends Button {
	// Maintains a state that corresponds to Up or Down
	// Intiial state is Up
	private boolean up;

	public Toggle(int width, int height)
	{
		super("Up" ,width, height);
		up = true;
	}	

	// redefines draw so that it draws a circular outline 
	// (instead of the default rectangular outline of Button)
	// "position" of Toggle is defined as the lower left corner of the
	// box that would enclose the circle
	
	// Toggles its state on each click. 
	// Displays the text "Up" or "Down" accordingly
	@Override
	public void draw(){
		if(super.checkClickable() == true && super.checkClick() == true){	//If button is clickable and is clicked
			int radius = this.getWidth() / 2;
			if(this.getHeight() < this.getWidth()){
				radius = this.getHeight() / 2;
			}
			Display.drawCircle(this.getPos().getX() + (this.getWidth() / 2), this.getPos().getY() + (this.getHeight() / 2), radius);
			Display.drawText(this.getPos().getX(), this.getPos().getY(), super.getText());
			super.unclick();
		}
	}

	@Override
	public void handleClick(){
		if(this.getState() == true){
			super.setText("Down");
			up = false;
		}
		else{
			super.setText("Up");
			up = true;
		}
	}

	
	// has a method to get its current state
	boolean getState(){
		return up;
	}	
}
