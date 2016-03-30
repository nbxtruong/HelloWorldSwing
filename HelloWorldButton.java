import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloWorldButton implements ActionListener {
	private static final String HELLO_WORLD = "Hello World !";

	public void actionPerformed(ActionEvent arg0) {
		System.out.println(HELLO_WORLD);
	}

	public void createGUI() throws Exception {
		JFrame myFrame = new JFrame(HELLO_WORLD);
		JButton myButton = new JButton(HELLO_WORLD);

		myButton.addActionListener(this);
		myFrame.getContentPane().add(myButton);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new HelloWorldButton().createGUI();
	}
}
