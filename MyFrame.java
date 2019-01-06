import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;


public class MyFrame extends JFrame {

	public MyFrame() {
		super("Hello Word");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	
		setLocation(600,400); //lokalizacjia
		setSize(606,300); //rozmiar
		//setResizable(false); //nie mozna zmienic rozmiaru
		
		setLayout(new FlowLayout());
		
		add(new JButton("Przycisk1"));
		add(new JButton("Przycisk2"));
	
		setVisible(true); 
	}

}
