package simulator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FileChooserUI;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUI extends JFrame {
	
	private JTable table;
	private int width;
	
	public GUI() {
		super("pic Simulator");
		setSize(1200, 800);
		setVisible(true);
		addComponentListener(new ComponentListener() {
			@Override
			public void componentShown(ComponentEvent e) {
			}
			@Override
			public void componentResized(ComponentEvent e) {
			}
			@Override
			public void componentMoved(ComponentEvent e) {
			}
			@Override
			public void componentHidden(ComponentEvent e) {
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Menu = new JPanel();
		Menu.setBackground(SystemColor.textHighlight);
		
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
							.addComponent(BoxLED, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE))
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
								.addComponent(BoxLED, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)))
						.addComponent(textPane, GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE))
					.addGap(101))
		);
		Menu.setLayout(null);
		
		ImageButton insert = new ImageButton("insertCode.png","insertCodeMO.png", "insertCodePressed.png", "Insert the Code");
		insert.setLocation(12, 13);
		insert.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFileChooser chooser = new JFileChooser();
				chooser.showOpenDialog(null);
			}
		});
		Menu.add(insert);
		ImageButton settings = new ImageButton("settings.png","settingsMO.png", "settingsPressed.png", "Settings");
		settings.setLocation(100, 13);
		Menu.add(settings);
		
		// LED-Array
		LED led1 = new LED();
		LED led2 = new LED();
		LED led3 = new LED();
		LED led4 = new LED();
		LED led5 = new LED();
		LED led6 = new LED();
		LED led7 = new LED();
		LED led8 = new LED();
		LED led9 = new LED();
		BoxLED.add(led1);
		BoxLED.add(led2);
		BoxLED.add(led3);
		BoxLED.add(led4);
		BoxLED.add(led5);
		BoxLED.add(led6);
		BoxLED.add(led7);
		BoxLED.add(led8);
		BoxLED.add(led9);
		
		// Example for LEDs in state ON
		led2.turnON();
		led8.turnON();
		led9.turnON();
		
		
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

		
		
		this.pack();
	}
}
