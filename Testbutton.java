import java.awt.EventQueue; 

public class Testbutton {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable () {
			@Override
			public void run() {
				new ActionFrame();
			}
		});
				
		
	}

}
