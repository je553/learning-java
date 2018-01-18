
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightAnimation extends JFrame implements ActionListener {
	
	public static final long serialVersionUID = 1L;
	
	// GUI parts
	private JFrame jframe;
	private JPanel jpanel;
	private JButton jbutCycle;
	private TrafficPanel trafficPanel;
	
	//initial state
	public TrafficLightAnimation() {
		jframe = new JFrame("GraphicAnimation_Huffman"); // make sure you don't have spaces between your functions and the parentheses
		jpanel = new JPanel();
		jbutCycle = new JButton("Cycle");
	}
	
	// adds GUI parts to frame, arranges them, shows to user
	public void launchApp() {
		jframe.setSize(300,500);
		
		jpanel.add(jbutCycle);
		
		jbutCycle.addActionListener(this);
		
		trafficPanel = new TrafficPanel(); // this is calling that traffic panel class we made!
		jframe.getContentPane().add(trafficPanel);
		
		jframe.getContentPane().add(jpanel, BorderLayout.SOUTH);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	
	}
	
	// driver program
	public static void main (String args[]) {
		TrafficLightAnimation TrafficLightAnimation = new TrafficLightAnimation();
		TrafficLightAnimation.launchApp();
	} // brackets, yo.
	
	// traps event upon click
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbutCycle) {
			trafficPanel.changeColor();
		}
	}
	
}
