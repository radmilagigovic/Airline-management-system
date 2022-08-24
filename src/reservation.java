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
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
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
public class reservation {

	private JFrame frame;
	private JTextField txt_ID;
	private JTextField txt_IME;
	private JTextField txt_VREMEP;
	private JTextField txt_VREMED;
	private JTextField txt_CENA;
	private JComboBox cb_polazak;
	private JComboBox cb_dolazak;
	
	
	private JTable table2;
	private JTable table;
	private JTextField datum_polaska;
	private Image img_s3 = new ImageIcon(this.getClass().getResource("/search.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);
	private Image img_av = new ImageIcon(this.getClass().getResource("/av.png")).getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH);

	private JTextField textField;
	private JTextField txt_SIFRA;
	private JTextField txt_BROJ_SEDISTA;
	private JTextField txt_IME_AVIONA;
	
	private JTextField textField_pretraga12;
	private JTextField txt_polazak;
	private JTextField txt_dolazak;
	private JTextField textField_pretraga11;
	private JTextField textField_pretraga22;

	private JButton btnREZERVISI;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel222;
	private JTextField textField_ime_putnika;
	private JTextField textField_prezime;
	private JTextField textField_id_putnika;
	private JTextField textField_br_pasosa;
	private JTextField textField_pol;
	private JTextField textField_telefon;
	private JTextField textField_adresa;
	private JLabel lblIdKarte;
	private JTextField textField_ID_KARTE;
	private JButton btnNewButton;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_6;
	private JLabel lblslika3;
	private JLabel lblslika3_1;
	private JPanel panel;
	private JLabel WarningText1;
	private JLabel WarningText2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reservation window = new reservation();
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
	public reservation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBackground(new Color(255, 255, 255));
		frame.setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setTitle("FinAir sistem");
		frame.setBounds(200, 50, 1256, 788);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JPanel Header = new JPanel();
		Header.setBackground(new Color(102, 51, 102));
		Header.setBounds(0, 0, 1284, 91);
		frame.getContentPane().add(Header);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		//Image img1 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage();
		Header.setLayout(null);
		
		lblNewLabel.setIcon(new ImageIcon(img_s2));
		lblNewLabel.setBounds(1011, 0, 250, 97);
		//frame.getContentPane().add(lblNewLabel);
		Header.add(lblNewLabel);

		JLabel lblNewLabel_16;
		lblNewLabel_16 = new JLabel("Za siguran i \r\nudoban let");
		//lblNewLabel_6.setLabelFor(lblNewLabel_7);
		lblNewLabel_16.setBounds(26, 0, 241, 110);
		
		lblNewLabel_16.setBackground(Color.PINK);
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		lblNewLabel_16.setFont(new Font("Freestyle Script", Font.PLAIN, 31));
		Header.add(lblNewLabel_16);
		JLabel lblPristupSistemu = new JLabel("Unesi grad iz kog putuje\u0161:");
		lblPristupSistemu.setForeground(new Color(51, 102, 102));
		lblPristupSistemu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPristupSistemu.setFont(new Font("Dialog", Font.PLAIN, 19));
		//lblPristupSistemu.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPristupSistemu.setBounds(17, 121, 235, 39);
		frame.getContentPane().add(lblPristupSistemu);
		
		JLabel lblNewLabel_4 = new JLabel("VREME DOLASKA");
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_4.setForeground(new Color(51, 102, 102));
		lblNewLabel_4.setBounds(1011, 516, 128, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("VREME POLASKA");
		lblNewLabel_5.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(51, 102, 102));
		lblNewLabel_5.setBounds(844, 517, 128, 19);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel WarningText1 = new JLabel("");
	    // WarningText1.setSize(166, 19);
		//WarningText1.setLocation(171, 182);
		  WarningText1.setFont(new Font("Dialog", Font.PLAIN, 13)); // NOI18N
	        WarningText1.setForeground(new java.awt.Color(207, 0, 15));
	      //  Main.add(WarningText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, 50));
	       frame.getContentPane().add(WarningText1);
	        
	        

			JLabel WarningText2 = new JLabel("");
			WarningText2.setSize(174, 19);
			WarningText2.setLocation(747, 329);
			WarningText1.setSize(524, 19);
			WarningText1.setLocation(74, 353);
			  WarningText2.setFont(new Font("Dialog", Font.PLAIN, 13)); // NOI18N
		        WarningText2.setForeground(new java.awt.Color(207, 0, 15));
		      //  Main.add(WarningText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 210, 50));
		       frame.getContentPane().add(WarningText2);

		txt_IME = new JTextField();
		txt_IME.setForeground(new Color(0, 0, 0));
		txt_IME.setFont(new Font("Tahoma", Font.BOLD, 23));
		txt_IME.setColumns(10);
		txt_IME.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txt_IME.setBackground(new Color(211, 211, 211));
		txt_IME.setBounds(952, 404, 96, 39);
		frame.getContentPane().add(txt_IME);
		
		txt_VREMEP = new JTextField();
		txt_VREMEP.setForeground(new Color(204, 0, 0));
		txt_VREMEP.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt_VREMEP.setColumns(10);
		txt_VREMEP.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txt_VREMEP.setBackground(new Color(211, 211, 211));
		txt_VREMEP.setBounds(854, 538, 96, 28);
		frame.getContentPane().add(txt_VREMEP);
		
		
		txt_VREMED = new JTextField();
		txt_VREMED.setForeground(new Color(204, 0, 0));
		txt_VREMED.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt_VREMED.setColumns(10);
		txt_VREMED.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txt_VREMED.setBackground(new Color(211, 211, 211));
		txt_VREMED.setBounds(1030, 540, 84, 28);
		frame.getContentPane().add(txt_VREMED);

		txt_CENA = new JTextField();
		txt_CENA.setBackground(new Color(211, 211, 211));
		txt_CENA.setFont(new Font("Tahoma", Font.BOLD, 18));
		txt_CENA.setForeground(new Color(204, 0, 0));
		txt_CENA.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		txt_CENA.setBounds(1033, 615, 36, 25);
		frame.getContentPane().add(txt_CENA);
		txt_CENA.setColumns(10);
		
		txt_ID = new JTextField();
		txt_ID.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txt_ID.setBounds(136, 318, 116, 1);
		frame.getContentPane().add(txt_ID);
		txt_ID.setColumns(10);
		
		textField_pretraga12 = new JTextField();
		textField_pretraga12.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField_pretraga12.setBackground(new Color(255, 255, 255));
		textField_pretraga12.setForeground(new Color(204, 0, 0));
   		textField_pretraga12.setBounds(630, 128, 116, 28);
   		frame.getContentPane().add(textField_pretraga12);
   		textField_pretraga12.setColumns(10);

		JLabel lblSpisakSvihLetova = new JLabel("Spisak svih letova:");
		lblSpisakSvihLetova.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpisakSvihLetova.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblSpisakSvihLetova.setForeground(new Color(51, 102, 102));

		lblSpisakSvihLetova.setBounds(370, 37, 304, 25);
		frame.getContentPane().add(lblSpisakSvihLetova);
		
		JLabel lblNewLabel_7 = new JLabel("CENA");
		lblNewLabel_7.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel_7.setForeground(new Color(51, 102, 102));
		lblNewLabel_7.setBounds(1025, 590, 56, 23);
		frame.getContentPane().add(lblNewLabel_7);
		
		
		
		JLabel lblNewLabel_10 = new JLabel("DATUM POLASKA");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10.setForeground(new Color(51, 102, 102));
		lblNewLabel_10.setBounds(833, 590, 139, 23);
		frame.getContentPane().add(lblNewLabel_10);
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setBounds(38, 181, 1145, 137);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(51, 102, 102));
   		table.setForeground(new Color(255, 255, 255));
		table.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		table.setFont(new Font("Dialog", Font.PLAIN, 11));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {			

					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
			     	int row =table.getSelectedRow();
			     	
			     	txt_ID.setText(model.getValueAt(row,0).toString());
			     	txt_IME.setText(model.getValueAt(row,1).toString());
			     	txt_VREMEP.setText(model.getValueAt(row,2).toString());
			     	txt_VREMED.setText(model.getValueAt(row,3).toString());
			     	txt_CENA.setText(model.getValueAt(row,4).toString());
			     
					txt_polazak.setText(model.getValueAt(row,5).toString());
			    
			     	txt_dolazak.setText(model.getValueAt(row,6).toString());
			     	//cb_polazak_radi.setToolTipText(model.getValueAt(row,5).toString());
			     	//cb_dolazak.setToolTipText(model.getValueAt(row,6).toString());
			    	datum_polaska.setText(model.getValueAt(row,7).toString());
			    	txt_SIFRA.setText(model.getValueAt(row,8).toString());
			    	txt_BROJ_SEDISTA.setText(model.getValueAt(row,9).toString());
			    	txt_IME_AVIONA.setText(model.getValueAt(row,10).toString());
			     	
			     	
							
				} catch (Exception ex) {
	                   System.out.println(table.getModel().getValueAt(table.getRowCount(), 0));

				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {  "ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK","dp", "SIFRA", "broj_sedista","IME AVIONA"
			}
		));
		
           scrollPane.addContainerListener(new ContainerAdapter() {
			
			
			public void componentAdded(ContainerEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT id_leta, ime_leta, vreme_polaska, vreme_dolaska, cena, mesto_polaska, mesto_dolaska,datum_p, sifra, broj_sedista, ime FROM sve";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					int br=0;
					while (rs.next()) {
						br++;
						
					}
					Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp","SIFRA", "broj_sedista","IME AVIONA"};
					
					Object podaci [][] = new Object [br][11];
				
				
					int i = 0;
					while (rs.next()) {
						podaci[i][0]=rs.getString("ID");
						podaci[i][1]=rs.getString("IME");
						podaci[i][2]=rs.getString("POLAZNO VREME");
						podaci[i][3]=rs.getString("DOLAZNO VREME");
						podaci[i][4]=rs.getString("CENA");
						podaci[i][5]=rs.getString("POLAZAK");
						podaci[i][6]=rs.getString("DOLAZAK");
						podaci[i][7]=rs.getString("dp");
						podaci[i][8]=rs.getString("SIFRA");
						podaci[i][9]=rs.getString("broj_sedista");
						podaci[i][10]=rs.getString("IME AVIONA");
						

					

						
						i++;
					}
					
			}catch(Exception ex) {}
				
			}
		});
          
         
           JButton pretraga11 = new JButton("PRETRA\u017DI:");
           pretraga11.setForeground(new Color(51, 102, 102));
	   		pretraga11.setFont(new Font("Dialog", Font.PLAIN, 15));
	   		pretraga11.setBackground(new Color(255, 255, 255));
	   		pretraga11.addActionListener(new ActionListener() {
	   			public void actionPerformed(ActionEvent e) {
	   				try {
	   					Class.forName("com.mysql.jdbc.Driver");
	   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");			     	
	   					String query = "SELECT id_leta, ime_leta, vreme_polaska, vreme_dolaska, cena, mesto_polaska, mesto_dolaska, datum_p, sifra, broj_sedista, ime FROM sve WHERE mesto_polaska like '%"+textField_pretraga11.getText()+"%' AND mesto_dolaska like '%"+textField_pretraga12.getText()+"%' ";
	   					java.sql.PreparedStatement s = con.prepareStatement(query);
	   					ResultSet rs = s.executeQuery();
	   					table.setModel(DbUtils.resultSetToTableModel(rs));
	   					int br=0;
	   					while (rs.next()) {
	   						br++;						
	   					}
	   					Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp","SIFRA", "broj_sedista","IME AVIONA"};
						
						Object podaci [][] = new Object [br][11];
					
					
						int i = 0;
						while (rs.next()) {
							podaci[i][0]=rs.getString("ID");
							podaci[i][1]=rs.getString("IME");
							podaci[i][2]=rs.getString("POLAZNO VREME");
							podaci[i][3]=rs.getString("DOLAZNO VREME");
							podaci[i][4]=rs.getString("CENA");
							podaci[i][5]=rs.getString("POLAZAK");
							podaci[i][6]=rs.getString("DOLAZAK");
							podaci[i][7]=rs.getString("dp");
							podaci[i][8]=rs.getString("SIFRA");
							podaci[i][9]=rs.getString("broj_sedista");
							podaci[i][10]=rs.getString("IME AVIONA");
							
	   						i++;
	   					}		
	   			}catch(Exception ex) {}
	   				}});
	   		pretraga11.setBounds(782, 130, 124, 25);
	   		frame.getContentPane().add(pretraga11);
	   		
	   		scrollPane.addContainerListener(new ContainerAdapter() {
	   			@Override
	   			
	   			public void componentAdded(ContainerEvent e) {
	   				try {
	   					Class.forName("com.mysql.jdbc.Driver");
	   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
	   			     	
						String query = "SELECT id_leta, ime_leta, vreme_polaska, vreme_dolaska, cena, mesto_polaska, mesto_dolaska,datum_p, sifra, broj_sedista, ime FROM sve";

	   					java.sql.PreparedStatement s = con.prepareStatement(query);
	   					ResultSet rs = s.executeQuery();
	   					table.setModel(DbUtils.resultSetToTableModel(rs));
	   					int br=0;
	   					while (rs.next()) {
	   						br++;						
	   					}
	   					Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp","SIFRA", "broj_sedista","IME AVIONA"};
						
						Object podaci [][] = new Object [br][11];
					
					
						int i = 0;
						while (rs.next()) {
							podaci[i][0]=rs.getString("ID");
							podaci[i][1]=rs.getString("IME");
							podaci[i][2]=rs.getString("POLAZNO VREME");
							podaci[i][3]=rs.getString("DOLAZNO VREME");
							podaci[i][4]=rs.getString("CENA");
							podaci[i][5]=rs.getString("POLAZAK");
							podaci[i][6]=rs.getString("DOLAZAK");
							podaci[i][7]=rs.getString("dp");
							podaci[i][8]=rs.getString("SIFRA");
							podaci[i][9]=rs.getString("broj_sedista");
							podaci[i][10]=rs.getString("IME AVIONA");
							

	   						i++;
	   					}					
	   			}catch(Exception ex) {}											
	   			}
	   		});
	   		
	   		frame.getContentPane().add(scrollPane);
	   		
	   
	   		 table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							try {			

								Class.forName("com.mysql.jdbc.Driver");
						     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
								DefaultTableModel model = (DefaultTableModel)table.getModel();
						     	int row =table.getSelectedRow();
						     	
						     	txt_ID.setText(model.getValueAt(row,0).toString());
						     	txt_IME.setText(model.getValueAt(row,1).toString());
						     	txt_VREMEP.setText(model.getValueAt(row,2).toString());
						     	txt_VREMED.setText(model.getValueAt(row,3).toString());
						     	txt_CENA.setText(model.getValueAt(row,4).toString());
						     	txt_polazak.setText(model.getValueAt(row,5).toString());
						     	txt_dolazak.setText(model.getValueAt(row,6).toString());

						     	//cb_polazak_radi.setToolTipText(model.getValueAt(row,5).toString());
						     	//cb_dolazak.setToolTipText(model.getValueAt(row,6).toString());
						    	datum_polaska.setText(model.getValueAt(row,7).toString());
						    	txt_SIFRA.setText(model.getValueAt(row,8).toString());
						    	txt_BROJ_SEDISTA.setText(model.getValueAt(row,9).toString());
						    	txt_IME_AVIONA.setText(model.getValueAt(row,10).toString());
						    	
						    	
							} catch (Exception ex) {
				                   System.out.println(table.getModel().getValueAt(table.getRowCount(), 0));

							}
							
						}
						
					});
					
	   		/*
	   		 * java.sql.PreparedStatement s = con.prepareStatement(query);
	   					ResultSet rs = s.executeQuery();
	   					table.setModel(DbUtils.resultSetToTableModel(rs));
	   					int br=0;
	   					while (rs.next()) {
	   						br++;						
	   					}
	   		 */
	  
	   	
	   		scrollPane.setViewportView(table);
	   		table.setModel(new DefaultTableModel(
	   			new Object[][] {
	   			},
	   			new String[] {
	   					"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp","SIFRA", "broj_sedista","IME AVIONA"
	   			}
	   		));
		
		datum_polaska = new JTextField();
		datum_polaska.setBackground(new Color(211, 211, 211));
		datum_polaska.setForeground(new Color(204, 0, 0));
		datum_polaska.setFont(new Font("Dialog", Font.BOLD, 18));
		datum_polaska.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		datum_polaska.setBounds(855, 615, 117, 23);
		frame.getContentPane().add(datum_polaska);
		datum_polaska.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("$");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(1072, 615, 28, 23);
		frame.getContentPane().add(lblNewLabel_8);
   		
   		txt_SIFRA = new JTextField();
   		txt_SIFRA.setForeground(new Color(211, 211, 211));
   		txt_SIFRA.setBackground(new Color(211, 211, 211));
   		txt_SIFRA.setFont(new Font("Tahoma", Font.PLAIN, 13));
   		txt_SIFRA.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   		txt_SIFRA.setBounds(1173, 207, 23, 20);
   		frame.getContentPane().add(txt_SIFRA);
   		txt_SIFRA.setColumns(10);
   		
   	  textField_pretraga22 = new JTextField();
   	  textField_pretraga22.setBackground(new Color(255, 255, 255));
   	  textField_pretraga22.setForeground(new Color(204, 0, 0));
   	  textField_pretraga22.setFont(new Font("Tahoma", Font.PLAIN, 16));
 		textField_pretraga22.setBounds(300, 418, 104, 25);
 		frame.getContentPane().add(textField_pretraga22);
 		textField_pretraga22.setColumns(10);
   		
   		txt_BROJ_SEDISTA = new JTextField();
   		txt_BROJ_SEDISTA.setFont(new Font("Tahoma", Font.PLAIN, 13));
   		txt_BROJ_SEDISTA.setBounds(446, 318, 116, 1);
   		frame.getContentPane().add(txt_BROJ_SEDISTA);
   		txt_BROJ_SEDISTA.setColumns(10);
   		
   		txt_IME_AVIONA = new JTextField();
   		txt_IME_AVIONA.setForeground(new Color(211, 211, 211));
   		txt_IME_AVIONA.setBackground(new Color(211, 211, 211));
   		txt_IME_AVIONA.setFont(new Font("Tahoma", Font.PLAIN, 10));
   		txt_IME_AVIONA.setBorder(javax.swing.BorderFactory.createEmptyBorder());

   		txt_IME_AVIONA.setBounds(644, 329, 63, 14);
   		frame.getContentPane().add(txt_IME_AVIONA);
   		txt_IME_AVIONA.setColumns(10);
   		
   		txt_polazak = new JTextField();
   		txt_polazak.setBackground(new Color(211, 211, 211));
   		txt_polazak.setForeground(new Color(204, 0, 0));
   		txt_polazak.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   		txt_polazak.setFont(new Font("Tahoma", Font.BOLD, 25));
   		txt_polazak.setBounds(857, 454, 104, 36);
   		frame.getContentPane().add(txt_polazak);
   		txt_polazak.setColumns(10);
   		
   		txt_dolazak = new JTextField();
   		txt_dolazak.setForeground(new Color(204, 0, 0));
   		txt_dolazak.setFont(new Font("Tahoma", Font.BOLD, 25));
   		txt_dolazak.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   		txt_dolazak.setBackground(new Color(211, 211, 211));
   		txt_dolazak.setBounds(1044, 454, 116, 36);
   		frame.getContentPane().add(txt_dolazak);
   		txt_dolazak.setColumns(10);
   		
   		JLabel proba_polazniaero = new JLabel("");
   		proba_polazniaero.setBounds(114, 418, 46, 14);
   		frame.getContentPane().add(proba_polazniaero);
   		
   		textField_pretraga11 = new JTextField();
   		textField_pretraga11.setFont(new Font("Dialog", Font.PLAIN, 16));
   		textField_pretraga11.setBackground(new Color(255, 255, 255));
   		textField_pretraga11.setForeground(new Color(204, 0, 0));
   		textField_pretraga11.setBounds(252, 128, 116, 28);
   		frame.getContentPane().add(textField_pretraga11);
   		textField_pretraga11.setColumns(10);
   		
   		JLabel lblNewLabel_12 = new JLabel("Unesi grad u koji putuje\u0161:");
   		lblNewLabel_12.setForeground(new Color(51, 102, 102));
   		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 19));
   		lblNewLabel_12.setBounds(413, 121, 224, 39);
   		frame.getContentPane().add(lblNewLabel_12);
   		JButton pretraga22 = new JButton("PRETRA\u017DI");
   		pretraga22.setForeground(new Color(51, 102, 102));
   		pretraga22.setFont(new Font("Dialog", Font.PLAIN, 15));
   		pretraga22.setBackground(new Color(255, 255, 255));
   		pretraga22.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");			     	
   					String query = "SELECT * FROM putnik WHERE broj_pasosa like '%"+textField_pretraga22.getText()+"%' ";
   					java.sql.PreparedStatement s = con.prepareStatement(query);
   					ResultSet rs = s.executeQuery();
   					table2.setModel(DbUtils.resultSetToTableModel(rs));
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
   				}});
   		pretraga22.setBounds(433, 419, 109, 25);
   		frame.getContentPane().add(pretraga22);
   		
   		JScrollPane scrollPane2 = new JScrollPane();
   		scrollPane2.addContainerListener(new ContainerAdapter() {
   			@Override
   			
   			public void componentAdded(ContainerEvent e) {
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
   			     	
   					String query = "SELECT * FROM putnik ";
   					java.sql.PreparedStatement s = con.prepareStatement(query);
   					ResultSet rs = s.executeQuery();
   					table2.setModel(DbUtils.resultSetToTableModel(rs));
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
   		scrollPane2.setBounds(38, 477, 588, 87);
   		frame.getContentPane().add(scrollPane2);
   		table2 = new JTable();
   		
   
   		 table2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {			

							Class.forName("com.mysql.jdbc.Driver");
					     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
							DefaultTableModel model = (DefaultTableModel)table2.getModel();
					     	int row =table2.getSelectedRow();
					     	
					     	textField_ime_putnika.setText(model.getValueAt(row,0).toString());
					     	textField_prezime.setText(model.getValueAt(row,1).toString());
					     	textField_id_putnika.setText(model.getValueAt(row,2).toString());
					     	textField_br_pasosa.setText(model.getValueAt(row,3).toString());
					     	textField_pol.setText(model.getValueAt(row,4).toString());
					     	textField_telefon.setText(model.getValueAt(row,5).toString());
					     	textField_adresa.setText(model.getValueAt(row,6).toString());
					     	
									
						} catch (Exception ex) {
			                   System.out.println(table2.getModel().getValueAt(table2.getRowCount(), 0));

						}
					}
				});
				
   		
   		
   		
   		table2.setBackground(new Color(51, 102, 102));
   		table2.setForeground(new Color(255, 255, 255));
   		scrollPane2.setViewportView(table2);
   		table2.setModel(new DefaultTableModel(
   			new Object[][] {
   			},
   			new String[] {
   					"IME", "PREZIME","ID", "BROJ PASOSA","pol", "BROJ TEL",  "ADRESA"
   			}
   		));		
   		
   		

   		lblNewLabel_1 = new JLabel("ID putnika:");
   		lblNewLabel_1.setForeground(new Color(51, 102, 102));
   		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 16));
   		lblNewLabel_1.setBounds(478, 623, 84, 20);
   		frame.getContentPane().add(lblNewLabel_1);
   		
   		lblNewLabel_4 = new JLabel("Ime putnika:");
   		lblNewLabel_4.setForeground(new Color(51, 102, 102));
   		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 17));
   		lblNewLabel_4.setBounds(38, 581, 94, 36);
   		frame.getContentPane().add(lblNewLabel_4);
   		
   		lblNewLabel_11 = new JLabel("Prezime:");
   		lblNewLabel_11.setForeground(new Color(51, 102, 102));
   		lblNewLabel_11.setFont(new Font("Dialog", Font.PLAIN, 16));
   		lblNewLabel_11.setBounds(38, 622, 84, 23);
   		frame.getContentPane().add(lblNewLabel_11);
   		
   		lblNewLabel_12 = new JLabel("Broj pasosa:");
   		lblNewLabel_12.setForeground(new Color(51, 102, 102));
   		lblNewLabel_12.setFont(new Font("Dialog", Font.PLAIN, 16));
   		lblNewLabel_12.setBounds(478, 584, 114, 30);
   		frame.getContentPane().add(lblNewLabel_12);
   		
   	/*	JComboBox cb_polazak = new JComboBox();
		cb_polazak.setFont(new Font("Dialog", Font.BOLD, 18));
		cb_polazak.setModel(new DefaultComboBoxModel(new String[] {"Beograd", "Barselona", "Pariz", "Nica", "Berlin", "Frankfurt", "Nica"}));
		cb_polazak.setToolTipText("Beograd");
		cb_polazak.setMaximumRowCount(15);
		cb_polazak.setBounds(307, 148, 153, 39);
		frame.getContentPane().add(cb_polazak);
		
		JComboBox cb_dolazak = new JComboBox();
		cb_dolazak.setFont(new Font("Dialog", Font.BOLD, 18));
		cb_dolazak.setForeground(Color.BLACK);
		cb_dolazak.setToolTipText("");
		cb_dolazak.setModel(new DefaultComboBoxModel(new String[] {"Barselona", "Pariz", "Amsterdam", "Atina", "Nica", "Beograd", "Berlin", "Krakov", "Njujork", "Varsava", "Banja Luka"}));
		cb_dolazak.setBounds(307, 187, 153, 39);
		frame.getContentPane().add(cb_dolazak);
   		lblNewLabel_13 = new JLabel("Pol:");
   		lblNewLabel_13.setFont(new Font("Dialog", Font.PLAIN, 16));
   		lblNewLabel_13.setBounds(284, 664, 104, 14);
   		frame.getContentPane().add(lblNewLabel_13);*/
   		
   		lblNewLabel_14 = new JLabel("Broj telefona:");
   		lblNewLabel_14.setForeground(new Color(51, 102, 102));
   		lblNewLabel_14.setFont(new Font("Dialog", Font.PLAIN, 17));
   		lblNewLabel_14.setBounds(250, 589, 104, 20);
   		frame.getContentPane().add(lblNewLabel_14);
   		
   		lblNewLabel_15 = new JLabel("Adresa:");
   		lblNewLabel_15.setForeground(new Color(51, 102, 102));
   		lblNewLabel_15.setFont(new Font("Dialog", Font.PLAIN, 17));
   		lblNewLabel_15.setBounds(250, 626, 84, 14);
   	frame.getContentPane().add(lblNewLabel_15);
   		
   		textField_ime_putnika = new JTextField();
   		textField_ime_putnika.setForeground(new Color(204, 0, 0));
   		textField_ime_putnika.setBackground(new Color(211, 211, 211));
   		textField_ime_putnika.setFont(new Font("Tahoma", Font.BOLD, 16));
   		textField_ime_putnika.setBorder(javax.swing.BorderFactory.createEmptyBorder());

   		textField_ime_putnika.setBounds(130, 590, 80, 20);
   		frame.getContentPane().add(textField_ime_putnika);
   		textField_ime_putnika.setColumns(10);
   		
   		textField_prezime = new JTextField();
   		textField_prezime.setForeground(new Color(204, 0, 0));
   		textField_prezime.setBackground(new Color(211, 211, 211));
   		textField_prezime.setFont(new Font("Tahoma", Font.BOLD, 16));
   		textField_prezime.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   		textField_prezime.setColumns(10);
   		textField_prezime.setBounds(130, 624, 93, 20);
   		frame.getContentPane().add(textField_prezime);
   		
   		textField_id_putnika = new JTextField();
   		textField_id_putnika.setForeground(new Color(204, 0, 0));
   		textField_id_putnika.setBackground(new Color(211, 211, 211));
   		textField_id_putnika.setFont(new Font("Tahoma", Font.BOLD, 15));
   		textField_id_putnika.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   		textField_id_putnika.setColumns(10);
   		textField_id_putnika.setBounds(572, 625, 43, 20);
   		frame.getContentPane().add(textField_id_putnika);
   		JButton izlaz = new JButton("NAZAD");
		izlaz.setForeground(new Color(255, 255, 255));
		izlaz.setBackground(new Color(204, 0, 0));
		izlaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main1.main(new String[]{});
				frame.dispose();
			}
		});
		izlaz.setBounds(1009, 657, 174, 39);
		izlaz.setFont(new Font("Dialog", Font.PLAIN, 14));
		frame.getContentPane().add(izlaz);
   		
   		textField_br_pasosa = new JTextField();
   		textField_br_pasosa.setForeground(new Color(204, 0, 0));
   		textField_br_pasosa.setBackground(new Color(211, 211, 211));
   		textField_br_pasosa.setFont(new Font("Tahoma", Font.BOLD, 15));
   		textField_br_pasosa.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   		textField_br_pasosa.setColumns(10);
   		textField_br_pasosa.setBounds(575, 586, 64, 30);
   		frame.getContentPane().add(textField_br_pasosa);
   		JLabel lblNewLabel2 = new JLabel("Unesite broj pasosa putnika:");
   		lblNewLabel2.setForeground(new Color(51, 102, 102));
   		lblNewLabel2.setFont(new Font("Dialog", Font.PLAIN, 19));
   		lblNewLabel2.setBounds(41, 418, 363, 29);
   		frame.getContentPane().add(lblNewLabel2);
   		
   		textField_telefon = new JTextField();
   		textField_telefon.setForeground(new Color(204, 0, 0));
   		textField_telefon.setBackground(new Color(211, 211, 211));
   		textField_telefon.setFont(new Font("Tahoma", Font.BOLD, 15));
   		textField_telefon.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   		textField_telefon.setColumns(10);
   		textField_telefon.setBounds(352, 591, 116, 20);
   		frame.getContentPane().add(textField_telefon);
   		
   		textField_adresa = new JTextField();
   		textField_adresa.setForeground(new Color(204, 0, 0));
   		textField_adresa.setBackground(new Color(211, 211, 211));
   		textField_adresa.setFont(new Font("Tahoma", Font.BOLD, 16));
   		textField_adresa.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   	textField_adresa.setColumns(10);
   		textField_adresa.setBounds(332, 624, 124, 20);
   		frame.getContentPane().add(textField_adresa);
   		
   		
   		textField_pol = new JTextField();
   		textField_pol.setBounds(0, 748, 1, 1);
   		frame.getContentPane().add(textField_pol);
   		textField_pol.setBorder(javax.swing.BorderFactory.createEmptyBorder());
   		textField_pol.setColumns(10);
   		
   		lblslika3 = new JLabel("");

   		lblslika3.setIcon(new ImageIcon(img_s3));
   		lblslika3.setBounds(916, 124, 36, 36);
   		frame.getContentPane().add(lblslika3);
   		
   		lblslika3_1 = new JLabel("");
   		lblslika3_1.setBounds(541, 418, 28, 25);
   		lblslika3_1.setIcon(new ImageIcon(img_s3));
   		frame.getContentPane().add(lblslika3_1);
   		
   		JLabel slikaav = new JLabel("");
   		slikaav.setBounds(959, 443, 74, 53);
   		slikaav.setIcon(new ImageIcon(img_av));
   		frame.getContentPane().add(slikaav);
   		
   		btnREZERVISI = new JButton("REZERVI\u0160I KARTU");
   		btnREZERVISI.setBounds(942, 341, 211, 52);
   		frame.getContentPane().add(btnREZERVISI);
   		btnREZERVISI.setForeground(new Color(255, 255, 255));
   		btnREZERVISI.setFont(new Font("Dialog", Font.BOLD, 17));
   		btnREZERVISI.setBackground(new Color(204, 0, 0));
   		
   		textField_ID_KARTE = new JTextField();
   		textField_ID_KARTE.setBounds(800, 375, 84, 20);
   		frame.getContentPane().add(textField_ID_KARTE);
   		textField_ID_KARTE.setFont(new Font("Tahoma", Font.PLAIN, 16));
   		textField_ID_KARTE.setForeground(new Color(204, 0, 0));
   		textField_ID_KARTE.setColumns(10);
   		
   		lblIdKarte = new JLabel("Broj karte:");
   		lblIdKarte.setBounds(798, 353, 94, 20);
   		frame.getContentPane().add(lblIdKarte);
   		
   		lblIdKarte.setFont(new Font("Dialog", Font.BOLD, 17));
   		lblIdKarte.setForeground(new Color(255, 255, 255));
   		

   		
   		JButton btnSTAMPAJ = new JButton("ŠTAMPANJE KARTE");
   		btnSTAMPAJ.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
				otkazivanje.main(new String[]{});
				frame.dispose();
			}
		});
   		btnSTAMPAJ.setBackground(new Color(204, 0, 0));
   		btnSTAMPAJ.setForeground(new Color(255, 255, 255));
   		btnSTAMPAJ.setFont(new Font("Tahoma", Font.PLAIN, 13));
   		btnSTAMPAJ.setBounds(800, 658, 174, 39);
   		frame.getContentPane().add(btnSTAMPAJ);
   		
   		panel = new JPanel();
   		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, new Color(0, 128, 128)));
   		panel.setBackground(new Color(211, 211, 211));
   		panel.setBounds(800, 396, 383, 260);
   		frame.getContentPane().add(panel);
		
   		

   		btnREZERVISI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				   String iddd=txt_ID.getText();
		           String imeee = txt_IME.getText();
		           String vremeppp = txt_VREMEP.getText();
		           String vremeddd = txt_VREMED.getText();
		           String cenaaa = txt_CENA.getText();
		           String polazakkk= txt_polazak.getText();
		           String dolazakkk= txt_dolazak.getText();
		           String datummpp = datum_polaska.getText();
		           String sifraaa=txt_SIFRA.getText();
		           String sedistaaa=txt_BROJ_SEDISTA.getText();
		           String imee2 = txt_IME_AVIONA.getText();
		           String imee_p=textField_ime_putnika.getText();
		           String prezimee_p=textField_prezime.getText();
		           String idd_p= textField_id_putnika.getText();
		           String pasoss_p = textField_br_pasosa.getText();
		           String poll_p = textField_pol.getText();
		           String telefonn_p = textField_telefon.getText();
		           String adresaa_p=textField_adresa.getText();    
		           String kartaa =textField_ID_KARTE.getText();
		        	   try{
	     			Class.forName("com.mysql.jdbc.Driver");
	    	     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");

	    	     	 
	    String query = "insert into karta values('" + iddd + "','" + imeee + "','" + vremeppp + "','" + vremeddd + "','" + cenaaa +
	    	     			 "','" + polazakkk + "','" + dolazakkk + "','" + datummpp + "','" +sifraaa+ "','" +sedistaaa + "','" +imee2+ "','" +imee_p
	    	     			 + "','" + prezimee_p + "','" + idd_p + "','" + pasoss_p + "','" + poll_p + "','" + telefonn_p + "','" +
	    	     			 adresaa_p + "','" + kartaa + "')";

	    	     	 

     	            Statement st =con.createStatement() ;
                    int rows=st.executeUpdate(query);
	   
                
	                if (rows == 0) {
			            WarningText1.setText("* Duplim klikom na zeljeni red tabele odaberite destinaciju i putnika !");
			            WarningText2.setText(""); 
	                	System.out.println("vec postoji");
	                	JOptionPane.showMessageDialog(null,"Rezervacija neuspesna, pokusajte ponovo!" );	
						
			 }
	                else {
	                	System.out.println("odlicno");
	                	JOptionPane.showMessageDialog(null,"Uspešno ste napravili rezervaciju!");					
						con.close();
						reservation.main(new String[]{});
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
