import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;




public class Obraz extends JPanel {
	private BufferedImage image;
	
	public Obraz() {
		super();
		
		File imageFile = new File("pies.jpg");
		try {
			image = ImageIO.read(imageFile);
		}catch (IOException e) {
			System.err.print("Blad odczytu obrazka");
			e.printStackTrace();
		}
		Dimension dimension = new Dimension(image.getWidth(), image.getHeight());
		setPreferredSize(dimension);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(image, 0, 0, this);
	}
	

}
