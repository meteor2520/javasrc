import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/** Just a Frame
 * @version $Id$
 */
public class FlowLayoutSimple extends JFrame {
	JButton quitButton;

	/** Construct the object including its GUI */
	public FlowLayoutSimple() {
		super("JFrameSimple");

		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(quitButton = new JButton("Start"));
		getContentPane().add(quitButton = new JButton("Stop"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));
		getContentPane().add(quitButton = new JButton("Exit"));

		// Set up so that "Close" will exit the program
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pack();
	}

	public static void main(String[] args) {
		new FlowLayoutSimple().setVisible(true);
	}
}