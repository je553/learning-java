
import javax.swing.JPanel;
import java.awt.*;

class TrafficPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private int lightState = 1;
	// 1 is green
	// 2 is yellow
	// 3 is red
	
	public void changeColor() {
		lightState++;
		
		if (lightState > 3) {
			lightState = 1;
		}
		repaint();
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		// black rectangle
		g.setColor(new Color(0, 0, 0));
		g.fillRect(50, 30, 190, 395); // rectangle!
		
		// dim green light
		g.setColor(new Color(0, 100, 0)); // see how the green value is 100 instead of 255? dim!
		g.fillOval(90, 295, 100, 100); // the rest are ovals!
		
		// dim yellow light
		g.setColor(new Color(100, 100, 0)); // red + green = yellow in rgb
		g.fillOval(90, 178, 100, 100);
		
		// dim red light
		g.setColor(new Color(100, 0, 0));
		g.fillOval(90, 60, 100, 100);
	
	switch (lightState) {
		case 1: // green light on
			
			g.setColor(new Color(0 , 255 , 0));
			g.fillOval(90, 295, 100, 100);
			break;
			
		case 2: // yellow light on
			
			g.setColor(new Color(255 , 255 , 0));
			g.fillOval(90, 178, 100, 100);
			break;
			
		case 3: // red light on
			
			g.setColor(new Color(255 , 0 , 0));
			g.fillOval(90, 60, 100, 100);
			break;
		}
	
	}
}
