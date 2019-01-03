import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		super("Hello Word");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setLocation(600,400);
		setSize(606,300);
		setVisible(true);
	}

}
