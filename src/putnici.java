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
public class putnici {

	private JFrame frame;
	private JTextField textField_ID;
	private JTextField textField_IME;
	private JTextField textField_PASOS;
	private JTextField textField_TEL;
	private JTextField textField_POL;
	private JTextField textField_ADRESA;
	private JTable table;
	private JTextField textField_PREZIME;
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);
	private JLabel lblNewLabel_16;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					putnici window = new putnici();
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
	public putnici() {
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
		frame.setBounds(700, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JPanel Header = new JPanel();
		Header.setBackground(new Color(102, 51, 102));
		Header.setBounds(0, 0, 684, 97);
		frame.getContentPane().add(Header);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		//Image img1 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage();
		Header.setLayout(null);
		
		lblNewLabel.setIcon(new ImageIcon(img_s2));
		lblNewLabel.setBounds(451, 0,329, 97);
		//frame.getContentPane().add(lblNewLabel);
		Header.add(lblNewLabel);
		

		JLabel lblNewLabel_6 = new JLabel("Za siguran i \r\nudoban let");
		//lblNewLabel_6.setLabelFor(lblNewLabel_7);
		lblNewLabel_6.setBounds(26, 0, 241, 110);
		
		lblNewLabel_6.setBackground(Color.PINK);
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Freestyle Script", Font.PLAIN, 31));
		Header.add(lblNewLabel_6);
		
		JLabel lblPristupSistemu = new JLabel("Unesite Podatke o Putniku");
		lblPristupSistemu.setForeground(new Color(51, 102, 102));
		lblPristupSistemu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPristupSistemu.setFont(new Font("Dialog", Font.BOLD, 25));
		//lblPristupSistemu.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPristupSistemu.setBounds(10, 110, 355, 39);
		frame.getContentPane().add(lblPristupSistemu);
		
		JLabel lblNewLabel_1 = new JLabel("Ime:");
		lblNewLabel_1.setForeground(new Color(51, 102, 102));
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(27, 189, 46, 19);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Prezime:");
		lblNewLabel_2.setForeground(new Color(51, 102, 102));
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(27, 219, 81, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Broj pasosa:");
		lblNewLabel_3.setForeground(new Color(51, 102, 102));
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_3.setBounds(25, 246, 101, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Adresa:");
		lblNewLabel_4.setForeground(new Color(51, 102, 102));
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(261, 213, 85, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Broj telefona:");
		lblNewLabel_5.setForeground(new Color(51, 102, 102));
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_5.setBounds(261, 251, 110, 17);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_16;
		lblNewLabel_16 = new JLabel("ID:");
		lblNewLabel_16.setForeground(new Color(51, 102, 102));
		lblNewLabel_16.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(530, 192, 46, 14);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_8 = new JLabel("Pol:");
		lblNewLabel_8.setForeground(new Color(51, 102, 102));
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(261, 189, 155, 19);
		frame.getContentPane().add(lblNewLabel_8);
		
		textField_ID = new JTextField();
		textField_ID.setBackground(new Color(255, 255, 255));
		textField_ID.setBounds(572, 189, 46, 19);
		frame.getContentPane().add(textField_ID);
		textField_ID.setColumns(10);
		
		textField_IME = new JTextField();
		textField_IME.setColumns(10);
		textField_IME.setBackground(Color.WHITE);
		textField_IME.setBounds(118, 188, 86, 20);
		frame.getContentPane().add(textField_IME);
		
		textField_PREZIME = new JTextField();
		textField_PREZIME.setColumns(10);
		textField_PREZIME.setBackground(Color.WHITE);
		textField_PREZIME.setBounds(118, 219, 86, 20);
		frame.getContentPane().add(textField_PREZIME);
		
		textField_PASOS = new JTextField();
		textField_PASOS.setColumns(10);
		textField_PASOS.setBackground(Color.WHITE);
		textField_PASOS.setBounds(118, 248, 86, 20);
		frame.getContentPane().add(textField_PASOS);
		
		textField_TEL = new JTextField();
		textField_TEL.setColumns(10);
		textField_TEL.setBackground(Color.WHITE);
		textField_TEL.setBounds(381, 248, 86, 20);
		frame.getContentPane().add(textField_TEL);
		
		textField_POL = new JTextField();
		textField_POL.setColumns(10);
		textField_POL.setBackground(Color.WHITE);
		textField_POL.setBounds(381, 191, 86, 20);
		frame.getContentPane().add(textField_POL);
		
		textField_ADRESA = new JTextField();
		textField_ADRESA.setColumns(10);
		textField_ADRESA.setBackground(Color.WHITE);
		textField_ADRESA.setBounds(381, 219, 86, 20);
		frame.getContentPane().add(textField_ADRESA);
		
	
		
		JButton dodaj = new JButton("DODAJ");
		dodaj.setForeground(new Color(255, 255, 255));
		dodaj.setBackground(new Color(102, 51, 102));
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				   String imee=textField_IME.getText();
		           String prezimee=textField_PREZIME.getText();
		           String idd = textField_ID.getText();
		           String pasoss = textField_PASOS.getText();
		           String poll = textField_POL.getText();
		           String telefonn = textField_TEL.getText();
		           String adresaa=textField_ADRESA.getText();
		           
		        	   try{
	     			Class.forName("com.mysql.jdbc.Driver");
	    	     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
	    	     	 String query = "insert into putnik values('" + imee + "','" + prezimee + "','" + idd + "','" + pasoss + "','" + poll + "','" +  telefonn + "','" + adresaa + "')";
	    	     	Statement st =con.createStatement() ;
	    	     
	                int rows=st.executeUpdate(query);
	                
	                if (rows == 0) {
	                	System.out.println("vec postoji");
	                	JOptionPane.showMessageDialog(null,"Dodavanje neuspešno, sva polja moraju biti popunjena!." );
	                }else {
	                	System.out.println("odlicno");
	                	JOptionPane.showMessageDialog(null,"Uspešno ste dodali informacije o putniku!" );
	                }
	           
	               //aerodrom.main(new String[]{});
					//frame.dispose();
				}catch(Exception e1) {System.out.print(e1);}
		        	   
		        	   try {
							Class.forName("com.mysql.jdbc.Driver");
					     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					     	
							String query = "SELECT ime, prezime, id_p,broj_pasosa,pol,br_tel, adresa FROM putnik";
							java.sql.PreparedStatement s = con.prepareStatement(query);
							ResultSet rs = s.executeQuery();
							table.setModel(DbUtils.resultSetToTableModel(rs));
							int br=0;
							while (rs.next()) {
								br++;
								
							}
							Object kolona[] = {"IME", "PREZIME","ID", "BROJ PASOSA","POL", "BROJ TEL",  "ADRESA"};
							Object podaci [][] = new Object [br][7];
						
						
							int i = 0;
							while (rs.next()) {
								podaci[i][0]=rs.getString("IME");
								podaci[i][1]=rs.getString("PREZIME");
								podaci[i][2]=rs.getString("ID");
								podaci[i][3]=rs.getString("BROJ PASOSA");
			                    podaci[i][4]=rs.getString("POL");		
								podaci[i][5]=rs.getString("BROJ TEL");
								podaci[i][6]=rs.getString("ADRESA");
								i++;
							}

							
					}catch(Exception ex) {}
		     			
			}
		});
		dodaj.setFont(new Font("Dialog", Font.PLAIN, 14));
		dodaj.setBounds(56, 318, 136, 38);
		frame.getContentPane().add(dodaj);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setBounds(56, 393, 585, 97);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setBackground(new Color(51, 102, 102));
		table.setForeground(new Color(255, 255, 255));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {			

					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
			     	int row =table.getSelectedRow();
			     	
			     	textField_IME.setText(model.getValueAt(row,0).toString());
			     	textField_PREZIME.setText(model.getValueAt(row,1).toString());
			     	textField_ID.setText(model.getValueAt(row,2).toString());
			     	textField_PASOS.setText(model.getValueAt(row,3).toString());
			     	textField_POL.setText(model.getValueAt(row,4).toString());
			     	textField_TEL.setText(model.getValueAt(row,5).toString());
			     	textField_ADRESA.setText(model.getValueAt(row,6).toString());
						
							
				} catch (Exception ex) {
	                   System.out.println(table.getModel().getValueAt(table.getRowCount(), 0));

				}
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {  "IME", "PREZIME","ID", "BROJ PASOSA","POL", "BROJ TEL",  "ADRESA"
			}
		));
		
           scrollPane.addContainerListener(new ContainerAdapter() {
			
			
			public void componentAdded(ContainerEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT ime, prezime, id_p,broj_pasosa,pol,br_tel, adresa FROM putnik";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					int br=0;
					while (rs.next()) {
						br++;
						
					}
					Object kolona[] = {"IME", "PREZIME","ID", "BROJ PASOSA","POL", "BROJ TEL",  "ADRESA"};
					Object podaci [][] = new Object [br][7];
				
				
					int i = 0;
					while (rs.next()) {
						podaci[i][0]=rs.getString("IME");
						podaci[i][1]=rs.getString("PREZIME");
						podaci[i][2]=rs.getString("ID");
						podaci[i][3]=rs.getString("BROJ PASOSA");
	                    podaci[i][4]=rs.getString("POL");		
						podaci[i][5]=rs.getString("BROJ TEL");
						podaci[i][6]=rs.getString("ADRESA");
						i++;
					}
					
			}catch(Exception ex) {}
				
			}
		});
          
           
		
        JButton izmeni = new JButton("IZMENI");
        izmeni.setBackground(new Color(102, 51, 102));
        izmeni.setForeground(new Color(255, 255, 255));
   		izmeni.setFont(new Font("Dialog", Font.PLAIN, 14));  
   		izmeni.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
   			     String query = "update putnik set ime='"+textField_IME.getText()+"',prezime='"+textField_PREZIME.getText()+"',broj_pasosa='"+textField_PASOS.getText()+"' , pol='"+textField_POL.getText()+"' , br_tel='"+textField_TEL.getText()+"' ,adresa='"+textField_ADRESA.getText()+"' where id_p like '%" + textField_ID.getText()+"%' ";
                       PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
                       JOptionPane.showMessageDialog(null,"Uspešno ste izmenili podatke!" );
                       pst.execute();
                       pst.close();
   				}catch(Exception e1) {
   					e1.printStackTrace();
   				}
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
   			     	
   					String query = "SELECT ime, prezime, id_p,broj_pasosa,pol,br_tel, adresa FROM putnik";
   					java.sql.PreparedStatement s = con.prepareStatement(query);
   					ResultSet rs = s.executeQuery();
   					table.setModel(DbUtils.resultSetToTableModel(rs));
   					int br=0;
   					while (rs.next()) {
   						br++;
   						
   					}
   					Object kolona[] = {"IME", "PREZIME","ID", "BROJ PASOSA","pol", "BROJ TEL",  "ADRESA"};
					Object podaci [][] = new Object [br][7];
				
				
					int i = 0;
					while (rs.next()) {
						podaci[i][0]=rs.getString("IME");
						podaci[i][1]=rs.getString("PREZIME");
						podaci[i][2]=rs.getString("ID");
						podaci[i][3]=rs.getString("BROJ PASOSA");
	                    podaci[i][4]=rs.getString("pol");		
						podaci[i][5]=rs.getString("BROJ TEL");
						podaci[i][6]=rs.getString("ADRESA");
						i++;
   					}

   					
   			}catch(Exception ex) {}
   			}
   			
   		});
		izmeni.setBounds(289, 318, 136, 38);
		frame.getContentPane().add(izmeni);
		
		
		
		JButton obrisi = new JButton("OBRISI");
		obrisi.setForeground(new Color(255, 255, 255));
		obrisi.setBackground(new Color(102, 51, 102));
		obrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					String query = "delete from putnik where id_p like '%"+ textField_ID.getText()+"%'";
                    PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
                    JOptionPane.showMessageDialog(null,"Uspešno ste obrisali podatke!" );
                    pst.execute();
                    pst.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT ime, prezime, id_p,broj_pasosa,pol,br_tel, adresa FROM putnik";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					int br=0;
					while (rs.next()) {
						
						br++;
					}
					Object kolona[] = {"IME", "PREZIME","ID", "BROJ PASOSA","pol", "BROJ TEL",  "ADRESA"};
					Object podaci [][] = new Object [br][7];
				
				
					int i = 0;
					while (rs.next()) {
						podaci[i][0]=rs.getString("IME");
						podaci[i][1]=rs.getString("PREZIME");
						podaci[i][2]=rs.getString("ID");
						podaci[i][3]=rs.getString("BROJ PASOSA");
	                    podaci[i][4]=rs.getString("pol");		
						podaci[i][5]=rs.getString("BROJ TEL");
						podaci[i][6]=rs.getString("ADRESA");
						i++;
					}
          	}catch(Exception ex) {}
			}
		});
		obrisi.setFont(new Font("Dialog", Font.PLAIN, 14));
		obrisi.setBounds(523, 318, 136, 38);
		frame.getContentPane().add(obrisi);
		
		
		JButton izlaz = new JButton("NAZAD");
		izlaz.setBackground(new Color(102, 51, 102));
		izlaz.setForeground(new Color(255, 255, 255));
		izlaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.main(new String[]{});
				frame.dispose();

			}
		});
		izlaz.setFont(new Font("Dialog", Font.PLAIN, 14));
		izlaz.setBounds(572, 511, 102, 39);
		frame.getContentPane().add(izlaz);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(234, 172, 17, 108);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(490, 172, 9, 108);
		frame.getContentPane().add(separator_1);
		
		
		
		
	}
}