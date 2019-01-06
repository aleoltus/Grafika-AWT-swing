import javax.swing.JPanel;
import java.awt.*;

public class MyPanel extends JPanel {
	public MyPanel() {
		setPreferredSize(new Dimension(400,400));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawRect(10, 10, 380, 380);
		g2d.drawOval(10, 10, 380, 380);
	}

}
