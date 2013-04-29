package simulator;

import java.awt.Image;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;

public class ImageButton extends AbstractButton {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int width = 50;
	private int height = 50;
	private String path = "./resources/";

	/*
	 * Customized Icon with new functions
	 */
	public ImageButton(String imagePath, String imageMOPath, String tooltip) {
		Image ImageNormal = getToolkit().getImage(path + imagePath).getScaledInstance(width, height, Image.SCALE_SMOOTH);
		Image ImageMouseOver = getToolkit().getImage(path + imageMOPath).getScaledInstance(width, height, Image.SCALE_SMOOTH);
		
		ImageIcon iconNormal = new ImageIcon(ImageNormal);
		ImageIcon IconMouseOver = new ImageIcon(ImageMouseOver);
		setIcon(iconNormal);
		setRolloverIcon(IconMouseOver);
		setText(tooltip);
		
		/*		try {
			img = ImageIO.read(ClassLoader.getSystemResource(imagePath));
			imgMO = ImageIO.read(ClassLoader.getSystemResource(imageMOPath));
		} catch (Exception e) {
			e.getMessage();
		}
				if ((img != null) && (imgMO != null)) {
			this.setPreferredSize(new Dimension(width, height));
			scaledImg = img
					.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			scaledImgMO = imgMO.getScaledInstance(width, height,
					Image.SCALE_SMOOTH);
			Graphics g = img.getGraphics();
			g.drawImage(scaledImg, 0, 0, width, height, null);
		}
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (true) {
			g.drawImage(scaledImg, 0, 0, width, height, null);
		}
*/	} 

}
