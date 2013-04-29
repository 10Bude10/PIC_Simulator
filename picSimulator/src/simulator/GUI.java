package simulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class GUI extends JFrame {
	// Angabe für LEDs
	public boolean arrayLED[] = new boolean[8];
	private JTable table;
	
	public GUI() {
		super("pic Simulator");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Menu = new JPanel();
		Menu.setBackground(SystemColor.textHighlight);
	//	ImageButton insert = new ImageButton("insertCode.png","insertCodeMO.png", "Insert the Code");
	//	Menu.add(insert);
		
		JTextPane textPane = new JTextPane();
		
		table = new JTable();
		
		JPanel BoxSchalter = new JPanel();
		BoxSchalter.setBorder(new TitledBorder(null, "Schalter", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.textHighlight));
		
		JPanel BoxLED = new JPanel();
		BoxLED.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "LEDs", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 153, 255)));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(BoxSchalter, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(BoxLED, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE))
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 573, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addComponent(Menu, GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(Menu, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(table, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(BoxSchalter, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
								.addComponent(BoxLED, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
					.addGap(101))
		);
		
		
	//	BoxLED.add(new LEDArray(9, 16, 16));

		String off = "./resources/LEDoff.png";
		String on = "./resources/LEDon.png";
	
		JLabel L1;
		JLabel L2;
		JLabel L3;
		JLabel L4;
		JLabel L5;
		JLabel L6;
		JLabel L7;
		JLabel L8;
		JLabel L9;
		
		if(arrayLED[0]){
			L1 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L1 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		}
		BoxLED.add(L1);
		L1.setPreferredSize(new Dimension(16, 16));
		L1.setMinimumSize(new Dimension(16, 16));
		L1.setMaximumSize(new Dimension(16, 16));
		
		if(arrayLED[0]){
			L2 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L2 = new JLabel(new ImageIcon(getToolkit().getImage(off)));
		}
		BoxLED.add(L2);
		L2.setMaximumSize(new Dimension(16, 16));
		L2.setMinimumSize(new Dimension(16, 16));
		L2.setPreferredSize(new Dimension(16, 16));
		
		if(arrayLED[0]){
			L3 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L3 = new JLabel(new ImageIcon(getToolkit().getImage(off)));
		}
		BoxLED.add(L3);
		L3.setPreferredSize(new Dimension(16, 16));
		L3.setMinimumSize(new Dimension(16, 16));
		L3.setMaximumSize(new Dimension(16, 16));
		
		if(arrayLED[0]){
			L4 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L4 = new JLabel(new ImageIcon(getToolkit().getImage(off)));
		}
		BoxLED.add(L4);
		L4.setPreferredSize(new Dimension(16, 16));
		L4.setMinimumSize(new Dimension(16, 16));
		L4.setMaximumSize(new Dimension(16, 16));
		
		if(arrayLED[0]){
			L5 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L5 = new JLabel(new ImageIcon(getToolkit().getImage(off)));
		}
		BoxLED.add(L5);
		L5.setPreferredSize(new Dimension(16, 16));
		L5.setMinimumSize(new Dimension(16, 16));
		L5.setMaximumSize(new Dimension(16, 16));
		
		if(arrayLED[0]){
			L6 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L6 = new JLabel(new ImageIcon(getToolkit().getImage(off)));
		}
		BoxLED.add(L6);
		L6.setPreferredSize(new Dimension(16, 16));
		L6.setMinimumSize(new Dimension(16, 16));
		L6.setMaximumSize(new Dimension(16, 16));
		
		if(arrayLED[0]){
			L7 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L7 = new JLabel(new ImageIcon(getToolkit().getImage(off)));
		}
		BoxLED.add(L7);
		L7.setPreferredSize(new Dimension(16, 16));
		L7.setMinimumSize(new Dimension(16, 16));
		L7.setMaximumSize(new Dimension(16, 16));
		
		if(arrayLED[0]){
			L8 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L8 = new JLabel(new ImageIcon(getToolkit().getImage(off)));
		}
		BoxLED.add(L8);
		L8.setPreferredSize(new Dimension(16, 16));
		L8.setMinimumSize(new Dimension(16, 16));
		L8.setMaximumSize(new Dimension(16, 16));
		
		if(arrayLED[0]){
			L9 = new JLabel(new ImageIcon(getToolkit().getImage(on)));
		} else {
			L9 = new JLabel(new ImageIcon(getToolkit().getImage(off)));
		}
		BoxLED.add(L9);
		BoxLED.setLayout(new GridLayout(1, 0, 0, 0));
		L9.setPreferredSize(new Dimension(16, 16));
		L9.setMinimumSize(new Dimension(16, 16));
		L9.setMaximumSize(new Dimension(16, 16));
		
		GridBagLayout gbl_BoxSchalter = new GridBagLayout();
		gbl_BoxSchalter.columnWidths = new int[]{89, 0};
		gbl_BoxSchalter.rowHeights = new int[] {0, 0, 0, 0, 0, 0};
		gbl_BoxSchalter.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_BoxSchalter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		BoxSchalter.setLayout(gbl_BoxSchalter);
		
		JCheckBox S1 = new JCheckBox("Schalter 1");
		GridBagConstraints gbc_S1 = new GridBagConstraints();
		gbc_S1.anchor = GridBagConstraints.NORTHWEST;
		gbc_S1.insets = new Insets(0, 0, 5, 0);
		gbc_S1.gridx = 0;
		gbc_S1.gridy = 0;
		BoxSchalter.add(S1, gbc_S1);
		
		JCheckBox S2 = new JCheckBox("Schalter 2");
		GridBagConstraints gbc_S2 = new GridBagConstraints();
		gbc_S2.anchor = GridBagConstraints.NORTHWEST;
		gbc_S2.insets = new Insets(0, 0, 5, 0);
		gbc_S2.gridx = 0;
		gbc_S2.gridy = 1;
		BoxSchalter.add(S2, gbc_S2);
		
		JCheckBox S3 = new JCheckBox("Schalter 3");
		GridBagConstraints gbc_S3 = new GridBagConstraints();
		gbc_S3.anchor = GridBagConstraints.NORTHWEST;
		gbc_S3.insets = new Insets(0, 0, 5, 0);
		gbc_S3.gridx = 0;
		gbc_S3.gridy = 2;
		BoxSchalter.add(S3, gbc_S3);
		
		JCheckBox S4 = new JCheckBox("Schalter 4");
		GridBagConstraints gbc_S4 = new GridBagConstraints();
		gbc_S4.insets = new Insets(0, 0, 5, 0);
		gbc_S4.anchor = GridBagConstraints.NORTHWEST;
		gbc_S4.gridx = 0;
		gbc_S4.gridy = 3;
		BoxSchalter.add(S4, gbc_S4);
		
		JCheckBox S5 = new JCheckBox("Schalter 5");
		GridBagConstraints gbc_S5 = new GridBagConstraints();
		gbc_S5.insets = new Insets(0, 0, 5, 0);
		gbc_S5.anchor = GridBagConstraints.NORTHWEST;
		gbc_S5.gridx = 0;
		gbc_S5.gridy = 4;
		BoxSchalter.add(S5, gbc_S5);
		getContentPane().setLayout(groupLayout);
		
	}
}
