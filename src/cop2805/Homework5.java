package cop2805;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class Homework5 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homework5 window = new Homework5();
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
	public Homework5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Change Selection Mode");
		lblNewLabel.setBounds(10, 11, 201, 26);
		lblNewLabel.setFont(new Font("Source Sans Pro", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(202, 14, 73, 26);
		frame.getContentPane().add(comboBox);
		
		JList list = new JList();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.add("Bahamas", list);
		
		//list.setToolTipText("Bahamas\r\nCosta Rica\r\nCanada\r\nCuba\r\nHaiti\r\nJamaica\r\nMexico\r\nUnited States of America");
		list.setBounds(10, 48, 265, 180);
		frame.getContentPane().add(list);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(10, 239, 265, 21);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
