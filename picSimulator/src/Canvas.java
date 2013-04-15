import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.IconUIResource;


public class Canvas extends JFrame {
	
	private Color color = new Color(30,115,237);
	private Dimension dimFrame = new Dimension();
	
	/*
	gridx - The initial gridx value.
	gridy - The initial gridy value.
	gridwidth - The initial gridwidth value.
	gridheight - The initial gridheight value.
	weightx - The initial weightx value.
	weighty - The initial weighty value.
	anchor - The initial anchor value.
	fill - The initial fill value.
	insets - The initial insets value.
	ipadx - The initial ipadx value.
	ipady - The initial ipady value.
	 */
	
	public Canvas() {
		
		super("PIC Simulator");
	//	JFrame fenster = new JFrame("PIC Simulator");
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.rowHeights = new int[] {15, 0, 0, 0, 0};
		gridBagLayout.columnWidths = new int[] {0, 0, 0, 0, 65, 30};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, 1.0};
		getContentPane().setLayout(gridBagLayout);
		

		ImageButton insert = new ImageButton("insertCode.png", "insertCodeMO.png", 50, 50);
		add(insert);
		GridBagConstraints gbc_insertBtn = new GridBagConstraints();
		gbc_insertBtn.gridwidth = 1;
		gbc_insertBtn.gridheight = 1;
		gbc_insertBtn.insets = new Insets(0, 0, 0, 0);
		gbc_insertBtn.fill = GridBagConstraints.BOTH;
		gbc_insertBtn.gridx = 0;
		gbc_insertBtn.gridy = 0;
		getContentPane().add(insert, gbc_insertBtn);
	
//		JLayeredPane layerPane = new JLayeredPane();
			JPanel backgroundMenu = new JPanel();
			backgroundMenu.setBackground(color);
			add(backgroundMenu);
			GridBagConstraints gbc_backgr = new GridBagConstraints();
			gbc_backgr.gridwidth = 25;
			gbc_backgr.gridheight = 1;
			gbc_backgr.insets = new Insets(0, 0, 0, 0);
			gbc_backgr.fill = GridBagConstraints.BOTH;
			gbc_backgr.gridx = 0;
			gbc_backgr.gridy = 0;
			getContentPane().add(backgroundMenu, gbc_backgr);
		
		JTextPane textPane = new JTextPane();
		textPane.setSelectionColor(SystemColor.textHighlight);
		textPane.setBorder(new BevelBorder(BevelBorder.RAISED, SystemColor.textHighlight, null, null, null));
		textPane.setToolTipText("Insert your code");
		textPane.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.gridwidth = 12;
		gbc_textPane.gridheight = 15;
		gbc_textPane.insets = new Insets(0, 5, 0, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 1;
		getContentPane().add(textPane, gbc_textPane);

		
		addComponentListener(new ComponentListener() {
			@Override
			public void componentShown(ComponentEvent e) {}
			@Override
			public void componentResized(ComponentEvent e) {
				dimFrame = e.getComponent().getSize();
			}
			@Override
			public void componentMoved(ComponentEvent e) {}
			@Override
			public void componentHidden(ComponentEvent e) {}
		});
		
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
/* commment out because of layer problems
	public void paint(Graphics g) {  
		super.paint(g);  
		g.setColor(color);  
		g.fillRect(0,0,dimFrame.width,120);
		
	} 
*/
	
		
}
