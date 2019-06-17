package chocolate;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class frmChocolat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmChocolat window = new frmChocolat();
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
	public frmChocolat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 586, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblChocolat = new JLabel("CHOCOLAT");
		lblChocolat.setForeground(new Color(244, 164, 96));
		lblChocolat.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(lblChocolat, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Id");
		frame.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		JComboBox comboBox = new JComboBox();
		frame.getContentPane().add(comboBox, BorderLayout.CENTER);
	}

}
