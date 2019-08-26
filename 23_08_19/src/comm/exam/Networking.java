package comm.exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Networking extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Networking frame = new Networking();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Networking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterNumber = new JLabel("Enter number");
		lblEnterNumber.setBounds(65, 28, 65, 32);
		contentPane.add(lblEnterNumber);
		
		textField = new JTextField();
		textField.setBounds(125, 71, 142, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			NetworkingServer client =new NetworkingServer();
			int result;
			result=client.factorial(Integer.parseInt(textField.getText()));
			textField.setText(Integer.toString(result));
			
				
			}
		});
		btnSubmit.setBounds(123, 165, 89, 23);
		contentPane.add(btnSubmit);
	}

}
