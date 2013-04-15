import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;


public class ImageButton extends AbstractButton {
	  private int width;
	  private int height;
	  private Image img;
	  private Image imgMO;
	  private Image scaledImg; 
	  private Image scaledImgMO;
	  
	  /*
	   *  Customized Icon
	   *///jb
	  public ImageButton(String imagePath, String imageMOPath, int widthImg, int heightImg) {
		  this.width = widthImg;
		  this.height = heightImg;
		 	
		  try {  
			  img = ImageIO.read(ClassLoader.getSystemResource(imagePath));
			  imgMO = ImageIO.read(ClassLoader.getSystemResource(imageMOPath));
		  } catch(Exception e) {
			  e.getMessage();
		  }
		  setPreferredSize(new Dimension(width, height));  
		  setIcon(new ImageIcon(img.getScaledInstance(width, height, Image.SCALE_SMOOTH)));
		  setRolloverEnabled(true);
		  setRolloverIcon(new ImageIcon(imgMO.getScaledInstance(width, height, Image.SCALE_SMOOTH)));
		  
		  
			  
			  
			  /*		   if((img != null) && (imgMO != null)) {
			  setPreferredSize(new Dimension(width, height));  
			  scaledImg = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			  scaledImgMO = imgMO.getScaledInstance(width, height, Image.SCALE_SMOOTH);
			  Graphics g = imgMO.getGraphics();
			  g.drawImage(scaledImgMO, 0, 0, width, height, null);
		  }
		  
		  
	  }  
	  
	  protected void paintComponent(Graphics g) {  
		  super.paintComponent(g); 
		  if(true) {
			  g.drawImage(scaledImgMO, 0, 0, width, height, null);
		  }
*/	  }

}
