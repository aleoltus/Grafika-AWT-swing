import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel{
	private JTextField nameField;
	private JPasswordField passField;
	private JButton loginButton;
	private LoginListener listener;
	
	public String getName() {
		return nameField.getName();
	}
	public String getPassword() {
		String password = "";
		char[] pass = passField.getPassword();
		for(int i=0;i < pass.length; i++)
			password +=pass[i];
	}
	
	//Metoda, ktora tworzy etykiety i pola do wprowadzania danych
	private void createComponents() {
		
	}
}
