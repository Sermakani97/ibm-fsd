package comm.exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;
import model.Employee;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class DemoFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtSerma;
	private JTextField txtKani;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
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
	public DemoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmpid = new JLabel("empId");
		lblEmpid.setBounds(45, 35, 46, 14);
		contentPane.add(lblEmpid);
		
		textField = new JTextField();
		textField.setBounds(141, 32, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFname = new JLabel("fname");
		lblFname.setBounds(45, 86, 46, 14);
		contentPane.add(lblFname);
		
		JLabel lblLname = new JLabel("lname");
		lblLname.setBounds(45, 130, 46, 14);
		contentPane.add(lblLname);
		
		JLabel lblEmail = new JLabel("email");
		lblEmail.setBounds(45, 171, 46, 14);
		contentPane.add(lblEmail);
		
		txtSerma = new JTextField();
		txtSerma.setBounds(141, 83, 86, 20);
		contentPane.add(txtSerma);
		txtSerma.setColumns(10);
		
		txtKani = new JTextField();
		txtKani.setBounds(141, 127, 86, 20);
		contentPane.add(txtKani);
		txtKani.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(141, 168, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAdd = new JButton("add");
		btnAdd.setBounds(66, 210, 89, 23);
		contentPane.add(btnAdd);

		btnAdd.addActionListener(new ActionListener() {
			EmployeeService emp=null;
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					emp=new EmployeeServiceImpl();
					
				}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				emp.createEmployee(new Employee(Integer.parseInt(textField.getText().toString()),txtSerma.getText().toString(),txtKani.getText().toString(),textField_3.getText().toString()));
				//emp.createEmployee(new Employee(Integer.parseInt(textField.getText().toString()),textField1.getText().to));
			}
			
		});
		
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				txtSerma.setText("");
				txtKani.setText("");
				textField_3.setText("");
			}
		});
		btnReset.setBounds(185, 210, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnDisplaydata = new JButton("DisplayData");
		btnDisplaydata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					try {
						new MyFrame5();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		
				}
		});
		btnDisplaydata.setBounds(293, 210, 89, 23);
		contentPane.add(btnDisplaydata);
		
			
		}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
