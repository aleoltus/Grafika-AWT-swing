import javax.swing.JFrame;
import javax.swing.JButton;


public class MyFrame extends JFrame {

	public MyFrame() {
		super("Hello Word");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	
		setLocation(600,400); //lokalizacjia
		setSize(606,300); //rozmiar
		
		add(new JButton("Przycisk")); //przycisk
		
		setVisible(true); 
	}

}
