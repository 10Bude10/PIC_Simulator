package simulator;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LEDArray extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel LEDoff;
	private JLabel LEDon;
	private JLabel[] LEDBox;
	private int[] control;
	private int n;

	
	public LEDArray(int n, int width, int height) {
		// Size of the array
		this.n = n;
		
		// Scaling the Image (width & height)
		LEDoff = new JLabel(new ImageIcon(getToolkit().getImage("./resources/LEDoff.png").getScaledInstance(width, height, Image.SCALE_SMOOTH)));
		LEDon = new JLabel(new ImageIcon(getToolkit().getImage("./resources/LEDon.png").getScaledInstance(width, height, Image.SCALE_SMOOTH)));
		
		// Set Layout
		GridLayout layout = new GridLayout();
		this.setLayout(layout);
		
		// Set Default Array -> LEDs off
		for(int i=0; i<n; i++) {
			control[i] = 0;
			LEDBox[i] = LEDoff;
			this.add(LEDBox[i]);
		}
	}
	
	
	// Just a '1' in the array will turn on the LED
	public void setLEDstate(int[] control) {
		this.control = control;
		for(int i=0; i<n; i++) {
			if(control[i] == 1) {
				LEDBox[i] = LEDon;
			} else {
				LEDBox[i] = LEDoff;
			}
		}
	}

	
	// To-Do: write G-Unit Test!!!
	public int[] getLEDstate() {
		return control;
	}	
		
}		