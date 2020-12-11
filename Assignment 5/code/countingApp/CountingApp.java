package countingApp;
import widgets.*;
import display.Display;

public class CountingApp {

	private final Display display;

	public CountingApp(Display d) {
		// Display object made available at construction. Cannot be changed
		display = d;
	}
	
	public void init() {
		// sets up widgets
		// create a Panel with location 50,50 and width 400, height 200
		Panel panel = new Panel(400, 200);
		
		// creates the following widgets, which are added as children of this panel
		// Note locations are relative to Panel
		// - Toggle button:   location 100, 60, size 50, 30
		// - Counter button:  location 200, 60, size 100, 40
		// - Label: location  150, 150, text: "Vote up or down"

		Toggle toggle = new Toggle(50, 50);
		Counter counter = new Counter(100, 40, toggle);
		Label label = new Label("Vote up or down");

		panel.addWidget(toggle, new Location(150, 110));
		panel.addWidget(counter, new Location(250, 110));
		panel.addWidget(label, new Location(200, 200));		

		display.set(panel, 50, 50);

		// registers those widgets that are Clickable with Display
		display.registerClickable(toggle);
		display.registerClickable(counter);	
		
		display.redisplay();
	}
	
}
