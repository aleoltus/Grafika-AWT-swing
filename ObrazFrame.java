import javax.swing.JFrame;
import javax.swing.JPanel;

public class ObrazFrame extends JFrame {
	public ObrazFrame() {
		super("Program obrazkowy");
	
	JPanel obrazPanel = new Obraz();
	add(obrazPanel);
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	pack();
	setVisible(true);
	
}
}
