package countingApp;

import widgets.Button;

public class Counter extends Button {
	// has a reference to an instance of Toggle button
	private Toggle toggle;
	private int count;

	Counter(int width, int height, Toggle toggle){
		super(Integer.toString(0), width, height);
		this.toggle = toggle;
		count = 0;
	}

	// Everytime it is clicked, it increments or decrements counter by 1
	// depending on state of the Toggle instance
	@Override
	public void handleClick(){
		if(toggle.getState() == true){	//If toggle state is "UP"
			count = count + 1;
		}
		else{
			count = count - 1;
		}
		super.setText(Integer.toString(count));
	}
	
	// Shows the current count as its text	

}
