package comm.exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Employee extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
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
	public Employee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("id");
		lblId.setBounds(34, 26, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(10, 170, 46, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(72, 23, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(72, 74, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFirstname = new JLabel("firstname");
		lblFirstname.setBounds(10, 77, 46, 14);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("lastname");
		lblLastname.setBounds(10, 124, 46, 14);
		contentPane.add(lblLastname);
		
		textField_2 = new JTextField();
		textField_2.setBounds(72, 121, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(66, 167, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnSave = new JButton("save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NetworkingServer server=new NetworkingServer();
				try {
					server.display(Integer.parseInt(textField.getText().toString()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString());
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnSave.setBounds(10, 211, 89, 23);
		contentPane.add(btnSave);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NetworkingServer server=new NetworkingServer();
				ResultSet result = server.search(Integer.parseInt(textField_5.getText()));
				table.setModel(DbUtils.resultSetToTableModel(result));
				//NetworkingClient client=new NetworkingClient(textField.getText());
				
			}
		});
		btnSearch.setBounds(125, 211, 89, 23);
		contentPane.add(btnSearch);
		
		JLabel lblEnterId = new JLabel("enter id");
		lblEnterId.setBounds(186, 23, 46, 14);
		contentPane.add(lblEnterId);
		
		textField_4 = new JTextField();
		textField_4.setBounds(269, 74, 86, -35);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(254, 23, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		table = new JTable();
		table.setBounds(211, 74, 108, 89);
		contentPane.add(table);
	}
}
