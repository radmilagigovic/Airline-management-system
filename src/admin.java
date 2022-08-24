import java.awt.EventQueue;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JSlider;
import net.proteanit.sql.DbUtils;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JProgressBar;
import com.toedter.calendar.JDateChooser;


import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.JFrame;
import javax.swing.JFrame;

public class admin {

	private JFrame frame;
	private JTextField textField_ID;
	private JTextField textField_IME;
	private JTextField textField_PREZIME;
	private JTextField textField_EMAIL;
	private JTextField textField_LOZINKA;
	private JLabel WarningText1;
	private JLabel WarningText2;
	
	
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);
	private JLabel lblNewLabel_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin window = new admin();
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
	public admin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBackground(new Color(255, 255, 255));
		frame.setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setTitle("FinAir sistem");
		frame.setBounds(700, 100, 374, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel Header = new JPanel();
		Header.setBackground(new Color(102, 51, 102));
		Header.setBounds(0, 0, 684, 97);
		frame.getContentPane().add(Header);
		
		JLabel lblNewLabel_6 = new JLabel("Admin strana");
		//lblNewLabel_6.setLabelFor(lblNewLabel_7);
		lblNewLabel_6.setBounds(10, 67, 241, 30);
		
		lblNewLabel_6.setBackground(Color.PINK);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Freestyle Script", Font.PLAIN, 31));
		Header.add(lblNewLabel_6);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		//Image img1 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage();
		Header.setLayout(null);
		
		lblNewLabel.setIcon(new ImageIcon(img_s2));
		lblNewLabel.setBounds(127, 0,329, 97);
		//frame.getContentPane().add(lblNewLabel);
		Header.add(lblNewLabel);
		
		JLabel lblPristupSistemu = new JLabel("NOVI NALOG");
		lblPristupSistemu.setForeground(new Color(51, 102, 102));
		lblPristupSistemu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPristupSistemu.setFont(new Font("Dialog", Font.BOLD, 25));
		//lblPristupSistemu.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPristupSistemu.setBounds(34, 119, 277, 39);
		frame.getContentPane().add(lblPristupSistemu);
		
		JLabel lblNewLabel_1 = new JLabel("Ime:");
		lblNewLabel_1.setForeground(new Color(51, 102, 102));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(68, 192, 46, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prezime:");
		lblNewLabel_2.setForeground(new Color(51, 102, 102));
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(68, 225, 81, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Lozinka:");
		lblNewLabel_3.setForeground(new Color(51, 102, 102));
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(68, 313, 101, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setForeground(new Color(51, 102, 102));
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(68, 285, 110, 17);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_16;
		lblNewLabel_16 = new JLabel("ID:");
		lblNewLabel_16.setForeground(new Color(51, 102, 102));
		lblNewLabel_16.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_16.setBounds(68, 255, 46, 19);
		frame.getContentPane().add(lblNewLabel_16);
		
		textField_ID = new JTextField();
		textField_ID.setBackground(new Color(255, 255, 255));
		textField_ID.setBounds(161, 255, 130, 19);
		frame.getContentPane().add(textField_ID);
		textField_ID.setColumns(10);
		
		textField_IME = new JTextField();
		textField_IME.setColumns(10);
		textField_IME.setBackground(Color.WHITE);
		textField_IME.setBounds(161, 194, 130, 20);
		frame.getContentPane().add(textField_IME);
		
		textField_PREZIME = new JTextField();
		textField_PREZIME.setColumns(10);
		textField_PREZIME.setBackground(Color.WHITE);
		textField_PREZIME.setBounds(161, 225, 130, 20);
		frame.getContentPane().add(textField_PREZIME);
		
		textField_LOZINKA = new JTextField();
		textField_LOZINKA.setColumns(10);
		textField_LOZINKA.setBackground(Color.WHITE);
		textField_LOZINKA.setBounds(161, 315, 130, 20);
		frame.getContentPane().add(textField_LOZINKA);
		
		textField_EMAIL = new JTextField();
		textField_EMAIL.setColumns(10);
		textField_EMAIL.setBackground(Color.WHITE);
		textField_EMAIL.setBounds(161, 286, 130, 20);
		frame.getContentPane().add(textField_EMAIL);
		JButton btnNewButton = new JButton("KREIRAJ");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(102, 51, 102));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(123, 354, 110, 37);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Unesite podatke o novom zaposlenom:");
		lblNewLabel_4.setForeground(new Color(51, 102, 102));
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(68, 158, 219, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				   String idd=textField_ID.getText();
		           String imee = textField_IME.getText();
		           String prezimee = textField_PREZIME.getText();
		           String emaill = textField_EMAIL.getText();
		           String lozinkaa = textField_LOZINKA.getText();
		           

		           
		        	   try{
	     			Class.forName("com.mysql.jdbc.Driver");
	    	     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");

	    	     	 
	    String query = "insert into zaposleni values('" + idd + "','" + imee + "','" + prezimee + "','" + emaill + "','" + lozinkaa + "')";

	    	     	 

     	            Statement st =con.createStatement() ;
                    int rows=st.executeUpdate(query);
	   
                
	                if (rows == 0) {
			            WarningText1.setText("* Duplim klikom na zeljeni red tabele odaberite destinaciju i putnika !");
			            WarningText2.setText(""); 
	                	System.out.println("vec postoji");
	                	JOptionPane.showMessageDialog(null,"Neuspesno, pokusajte ponovo!" );	
						
			 }
	                else {
	                	System.out.println("odlicno");
	                	JOptionPane.showMessageDialog(null,"Uspešno ste kreirali novi nalog zaposlenom!");					
						con.close();
						main.main(new String[]{});
						frame.dispose();
	           
	                }		}catch(Exception e1) {System.out.print(e1);}
				
			}
			private void setVisible(boolean b) {	
			}
			public void main(String[] args) {
		        new prijavaZaposleni().setVisible(true);
		}
		});
		
	
	}
}
