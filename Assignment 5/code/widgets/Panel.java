package widgets;
import java.util.*;
import display.Display;

public class Panel extends Widget {
	private ArrayList<Widget>widgets = new ArrayList<Widget>();
	private boolean init = true;

	public Panel(int width, int height) {
		super(width, height);
	}

	public void addWidget(Widget w, Location pos) {
		// add a child widget
		// position of lower left of child is at pos in Panel coordinates
		w.setPos(pos);
		widgets.add(w);
	}
	
	// implements/overrides draw. Draws a box corresponding to its size and
	// calls draw on each child widget
	@Override
	public void draw(){
		if(init == true){	//If it is opened for first time
			Display.drawBox(this.getPos().getX(), this.getPos().getY(), this.getPos().getX() + super.getWidth(), this.getPos().getX() + super.getHeight());
			init = false;
		}
		for(Widget widget: widgets){
			widget.draw();
		}
	}
}
