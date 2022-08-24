import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.SwingConstants;


import javax.swing.JSeparator;


public class admin_prijava {


	private JFrame frmAerodrom;
	private JLabel label1;
	private JPasswordField passwordField;
	private Image img_pass = new ImageIcon(this.getClass().getResource("/key.png")).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
	private Image img_email = new ImageIcon(this.getClass().getResource("/email.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);
	private JLabel WarningText1;
	private JLabel WarningText2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_prijava window = new admin_prijava();
					window.frmAerodrom.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public admin_prijava() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAerodrom = new JFrame();
		frmAerodrom.setBackground(new Color(255, 255, 255));
		frmAerodrom.setFont(new Font("Dialog", Font.PLAIN, 12));
		frmAerodrom.getContentPane().setBackground(new Color(102, 51, 102));
		frmAerodrom.setTitle("FinAir sistem");
		frmAerodrom.setBounds(600, 100, 315, 350);
		frmAerodrom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAerodrom.getContentPane().setLayout(null);
		JLabel slika2 = new JLabel("");
		slika2.setBounds(130, 90, 64, 59);
		slika2.setIcon(new ImageIcon(img_pass));
		frmAerodrom.getContentPane().add(slika2);
		//slika2.setLabelFor(textField_email);
		JPanel Header = new JPanel();
		Header.setBorder(null);
		Header.setBackground(new Color(102, 51, 102));
		Header.setBounds(0, 0, 311, 97);
		frmAerodrom.getContentPane().add(Header);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		//Image img1 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage();
		Header.setLayout(null);
		
		
		JLabel WarningText1 = new JLabel("");
	    // WarningText1.setSize(166, 19);
		//WarningText1.setLocation(171, 182);
		  WarningText1.setFont(new Font("Dialog", Font.PLAIN, 13)); // NOI18N
	        WarningText1.setForeground(new java.awt.Color(207, 0, 15));
	      //  Main.add(WarningText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, 50));
	        frmAerodrom.getContentPane().add(WarningText1);
			WarningText1.setSize(176, 19);
			WarningText1.setLocation(168, 204);
	        
	        
		lblNewLabel.setIcon(new ImageIcon(img_s2));
		lblNewLabel.setBounds(355, 0,239, 97);
		//frame.getContentPane().add(lblNewLabel);
		Header.add(lblNewLabel);
		

		JLabel lblNewLabel_6 = new JLabel("Za siguran i \r\nudoban let");
		//lblNewLabel_6.setLabelFor(lblNewLabel_7);
		lblNewLabel_6.setBounds(60, 0, 241, 110);
		
		lblNewLabel_6.setBackground(Color.PINK);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Freestyle Script", Font.PLAIN, 31));
		Header.add(lblNewLabel_6);
	
		
		JButton prijava = new JButton("POTVRDI");
		prijava.setForeground(new Color(102, 0, 102));
		prijava.setBackground(new Color(255, 255, 255));
		prijava.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					Statement stmt=con.createStatement();
                   	
			        String Lozinka=String.valueOf(passwordField.getPassword());
					String sql="SELECT * FROM admin WHERE id='"+Lozinka+"'";
					ResultSet rs=stmt.executeQuery(sql);
					
					 if (passwordField.getText().isEmpty()) {
			        	 //WarningText1.setText("* Morate uneti email");
				           WarningText2.setText("* Morate uneti lozinku");
			            
			        }
			       else {
			           
			             String pass = passwordField.getText();
			             
			            // System.out.println(main.flight.getSeatInfo(seat));
			             this.setVisible(false);

			        }if(rs.next()) {                          
						JOptionPane.showMessageDialog(null,"        Pristup odobren !" );	
						admin.main(new String[]{});
						
						frmAerodrom.dispose();}
					else 
						JOptionPane.showMessageDialog(null,"    Kod neispravan, pokusajte ponovo!");					
					con.close();
				}catch(Exception e1) {System.out.print(e1);}		
			}
			
			
			private void setVisible(boolean b) {	
			}
			public void main(String[] args) {
		        new prijavaZaposleni().setVisible(true);
		}
			
			
		});
		
		prijava.setFont(new Font("Dialog", Font.PLAIN, 14));
		prijava.setBounds(104, 214, 99, 29);
		frmAerodrom.getContentPane().add(prijava);
		Image img3 = new ImageIcon(this.getClass().getResource("/employee.png")).getImage();
		Header.setLayout(null);
		Header.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(204, 0, 0));
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 18)); // NOI18N
		
				passwordField.setBounds(67, 160, 176, 29);
				frmAerodrom.getContentPane().add(passwordField);
				
				JLabel lblNewLabel_1 = new JLabel("Unesite kod za pristup:");
				lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 12));
				lblNewLabel_1.setForeground(new Color(255, 250, 250));
				lblNewLabel_1.setBounds(91, 142, 137, 14);
				frmAerodrom.getContentPane().add(lblNewLabel_1);
		
	
	}
	 protected void setVisible(boolean b) {
			}
}
