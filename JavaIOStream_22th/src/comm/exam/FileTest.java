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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class FileTest extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileTest frame = new FileTest();
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
	public FileTest()throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterText = new JLabel("Enter Text");
		lblEnterText.setBounds(53, 35, 62, 25);
		contentPane.add(lblEnterText);
		
		textField = new JTextField();
		textField.setBounds(99, 83, 180, 85);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				File ofile=new File("output.txt");
				try {
					
					FileWriter out=new FileWriter(ofile);
					PrintWriter outputStream=new PrintWriter(out);

				String l;
					while((l=textField.getText().toString())!=null) {
						System.out.println(l);
						outputStream.write(l);
					}
				
				} catch ( IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
		});
		btnSave.setBounds(10, 193, 89, 23);
		contentPane.add(btnSave);
		JButton btnRead = new JButton("Read");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*File ifile=new File("output.txt");
				try {
					
					FileReader out=new FileReader(ifile);
					BufferedReader bf=new BufferedReader(out);
					PrintWriter outputStream=new PrintWriter();

				String l;
					while((l=textField.getText().toString())!=null) {
						System.out.println(l);
						outputStream.write(l);
					}
				
				} catch ( IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}
*/
			}
		});
		btnRead.setBounds(157, 193, 89, 23);
		contentPane.add(btnRead);
	}

}
