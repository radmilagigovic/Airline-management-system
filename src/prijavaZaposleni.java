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



public class prijavaZaposleni {

	private JFrame frmAerodrom;
	private JLabel label1;
	private JTextField textField_email;
	private JPasswordField passwordField;
	private Image img_pass = new ImageIcon(this.getClass().getResource("/pass.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_email = new ImageIcon(this.getClass().getResource("/email.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);
	private JLabel WarningText1;
	private JLabel WarningText2;
	/**
	 * 
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prijavaZaposleni window = new prijavaZaposleni();
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
	public prijavaZaposleni() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAerodrom = new JFrame();
		frmAerodrom.setBackground(new Color(255, 255, 255));
		frmAerodrom.setFont(new Font("Dialog", Font.PLAIN, 12));
		frmAerodrom.getContentPane().setBackground(new Color(255, 255, 255));
		frmAerodrom.setTitle("FinAir sistem");
		frmAerodrom.setBounds(600, 100, 600, 500);
		frmAerodrom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAerodrom.getContentPane().setLayout(null);
		JLabel slika2 = new JLabel("");
		slika2.setBounds(142, 261, 26, 47);
		slika2.setIcon(new ImageIcon(img_pass));
		frmAerodrom.getContentPane().add(slika2);
		slika2.setLabelFor(textField_email);
		JPanel Header = new JPanel();
		Header.setBackground(new Color(102, 51, 102));
		Header.setBounds(0, 0, 584, 97);
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
	        
	        

			JLabel WarningText2 = new JLabel("");
			WarningText2.setSize(146, 19);
			WarningText2.setLocation(168, 282);
			WarningText1.setSize(176, 19);
			WarningText1.setLocation(168, 204);
			  WarningText2.setFont(new Font("Dialog", Font.PLAIN, 13)); // NOI18N
		        WarningText2.setForeground(new java.awt.Color(207, 0, 15));
		      //  Main.add(WarningText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, 50));
		        frmAerodrom.getContentPane().add(WarningText2);
	        
	        
		lblNewLabel.setIcon(new ImageIcon(img_s2));
		lblNewLabel.setBounds(355, 0,239, 97);
		//frame.getContentPane().add(lblNewLabel);
		Header.add(lblNewLabel);
		

		JLabel lblNewLabel_6 = new JLabel("Za siguran i \r\nudoban let");
		//lblNewLabel_6.setLabelFor(lblNewLabel_7);
		lblNewLabel_6.setBounds(26, 0, 241, 110);
		
		lblNewLabel_6.setBackground(Color.PINK);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Freestyle Script", Font.PLAIN, 31));
		Header.add(lblNewLabel_6);
		
		JLabel slika3 = new JLabel("");
		slika3.setBounds(123, 182, 40, 53);
		slika3.setIcon(new ImageIcon(img_email));
		frmAerodrom.getContentPane().add(slika3);
		


		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		lblEmail.setForeground(new Color(51, 102, 102));
		
		lblEmail.setBounds(72, 194, 62, 29);
		frmAerodrom.getContentPane().add(lblEmail);
		
		JLabel lblLozinka = new JLabel("Lozinka:");
		lblLozinka.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		lblLozinka.setForeground(new Color(51, 102, 102));
		//lblLozinka.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLozinka.setBounds(72, 272, 103, 29);
		frmAerodrom.getContentPane().add(lblLozinka);
		
		textField_email = new JTextField();
		textField_email.setFont(new Font("Dialog", Font.PLAIN, 15)); // NOI18N
		textField_email.setBounds(72, 221, 214, 29);
		textField_email.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		
		frmAerodrom.getContentPane().add(textField_email);
		textField_email.setColumns(10);
		
		
		
		
		
		JLabel lblPristupSistemu = new JLabel("Pristup Sistemu");
		lblPristupSistemu.setForeground(new Color(51, 102, 102));
		lblPristupSistemu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPristupSistemu.setFont(new java.awt.Font("Dialog", 1, 30));
		//lblPristupSistemu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPristupSistemu.setBounds(10, 108, 262, 40);
		frmAerodrom.getContentPane().add(lblPristupSistemu);
	
		
		JButton prijava = new JButton("PRIJAVA");
		prijava.setForeground(new Color(255, 255, 255));
		prijava.setBackground(new Color(102, 51, 102));
		prijava.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					Statement stmt=con.createStatement();
                   	String Email=textField_email.getText();
			        String Lozinka=String.valueOf(passwordField.getPassword());
					String sql="SELECT * FROM zaposleni WHERE email='"+Email+"' AND lozinka='"+Lozinka+"'";
					ResultSet rs=stmt.executeQuery(sql);
					
					if (textField_email.getText().isEmpty() && passwordField.getText().isEmpty()) {
			            WarningText1.setText("* Morate uneti email");
			            WarningText2.setText("* Morate uneti lozinku");
			       
			        }else if (textField_email.getText().isEmpty()) {
			        	WarningText1.setText("* Morate uneti email");
				          // WarningText2.setText("* Morate uneti lozinku");
			            
			        } else if (passwordField.getText().isEmpty()) {
			        	 //WarningText1.setText("* Morate uneti email");
				           WarningText2.setText("* Morate uneti lozinku");
			            
			        }
			       else {
			            String emaill = textField_email.getText();
			             String pass = passwordField.getText();
			            // new proba(emaill).setVisible(true); 
			            // System.out.println(main.flight.getSeatInfo(seat));
			             this.setVisible(false);

			        }if(rs.next()) {                          
						JOptionPane.showMessageDialog(null,"Uspešno ste se prijavili." );	
						main1.main(new String[]{});
						
						frmAerodrom.dispose();}
					else 
						JOptionPane.showMessageDialog(null,"Prijava nije uspela, pokušajte ponovo!");					
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
		prijava.setBounds(343, 393, 109, 42);
		frmAerodrom.getContentPane().add(prijava);
		
		JButton izlaz = new JButton("NAZAD");
		izlaz.setForeground(new Color(255, 255, 255));
		izlaz.setBackground(new Color(102, 51, 102));
		izlaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prijavaZaposleni.main(new String[]{});
				frmAerodrom.dispose();
			}
		});
		izlaz.setBounds(462, 393, 99, 42);
		izlaz.setFont(new Font("Dialog", Font.PLAIN, 14));
		frmAerodrom.getContentPane().add(izlaz);
		
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(334, 380, 240, 2);
		frmAerodrom.getContentPane().add(separator);
		
		JLabel img2 = new JLabel("");
		img2.setBounds(343, 194, 224, 164);
		Image img3 = new ImageIcon(this.getClass().getResource("/employee.png")).getImage();
		Header.setLayout(null);
		img2.setIcon(new ImageIcon(img3));
		//img2.setBounds(10, 0,202, 200);
		frmAerodrom.getContentPane().add(img2);
		Header.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 15)); // NOI18N
		
				passwordField.setBounds(72, 299, 214, 29);
				frmAerodrom.getContentPane().add(passwordField);
		
	
	}
	 protected void setVisible(boolean b) {
			}
}
