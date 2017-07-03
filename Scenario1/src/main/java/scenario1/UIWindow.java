package scenario1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UIWindow {

	private JFrame frame;
	int counter = 10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIWindow window = new UIWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UIWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblCounter = new JLabel("Counter = ");
		lblCounter.setBounds(54, 42, 65, 14);
		frame.getContentPane().add(lblCounter);
		
		final JLabel lblCounternumber = new JLabel(""+ counter);
		lblCounternumber.setBounds(120, 42, 121, 14);
		frame.getContentPane().add(lblCounternumber);
		
		JButton button = new JButton("- 1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// minus 1
				counter += 1;
				lblCounternumber.setText("" + counter);
				
			}
		});
		button.setBounds(54, 99, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("+ 1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter += 1;
				lblCounternumber.setText("" + counter);
					
			}
		});
		button_1.setBounds(205, 99, 89, 23);
		frame.getContentPane().add(button_1);
	}
}
