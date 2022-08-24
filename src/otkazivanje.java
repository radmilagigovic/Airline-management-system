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
import java.awt.SystemColor;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
//import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.Type3Font;
public class otkazivanje {

	private JFrame frame;
	private JTextField txt_ID;
	private JTextField txt_IME;
	private JTextField txt_VREMEP;
	private JTextField txt_VREMED;
	private JTextField txt_CENA;
	private JComboBox cb_polazak;
	private JComboBox cb_dolazak;
	private JTextField txt_SIFRA;
	private JTextField txt_IME_AVIONA;
	private JTextField txt_BROJ_SEDISTA;
	
	private JTextField textField_pretraga22;
	private JTable table2;
	private JButton sve_2;
	private JButton btnNewButton_pretraga2;;

	private JTable table;
	private JTextField datum_polaska;
	private JButton btnNewButton_1;
	private JLabel label;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
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
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					otkazivanje window = new otkazivanje();
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
	public otkazivanje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setTitle("FinAir sistem");
		frame.setBounds(50, 100, 1013, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Header = new JPanel();
		Header.setBackground(new Color(102, 51, 102));
		Header.setBounds(0, 0, 1370, 91);
		frame.getContentPane().add(Header);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		//Image img1 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage();
		Header.setLayout(null);
		
		lblNewLabel.setIcon(new ImageIcon(img_s2));
		lblNewLabel.setBounds(772, 0, 538, 97);
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
		
		
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setBounds(116, 208, 793, 107);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(255, 255, 255));
		table.setBackground(new Color(0, 102, 102));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {			

					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
			     	int row =table.getSelectedRow();
			     	
			     		
				} catch (Exception ex) {
	                   System.out.println(table.getModel().getValueAt(table.getRowCount(), 0));

				}
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] { "ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp", "SIFRA", "broj_sedista","IME AVIONA", "IME", "PREZIME","ID", "BROJ PASOSA","POL", "BROJ TEL",  "ADRESA", "ID KARTE"
			
			}
		));
		scrollPane.addContainerListener(new ContainerAdapter() {
			public void componentAdded(ContainerEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
			     	String query = "SELECT * FROM karta";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					int br=0;
					while (rs.next()) {
						br++;
						
					}
					Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp", "SIFRA", "broj_sedista","IME AVIONA","IME", "PREZIME","ID", "BROJ PASOSA","POL", "BROJ TEL",  "ADRESA", "ID KARTE"};
					Object podaci [][] = new Object [br][19];
				
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
						podaci[i][11]=rs.getString("IME");
						podaci[i][12]=rs.getString("PREZIME");
						podaci[i][13]=rs.getString("ID");
						podaci[i][14]=rs.getString("BROJ PASOSA");
	                    podaci[i][15]=rs.getString("POL");		
						podaci[i][16]=rs.getString("BROJ TEL");
						podaci[i][17]=rs.getString("ADRESA");
						podaci[i][18]=rs.getString("ID KARTE");

					
						i++;
					
			
					}
					
			}catch(Exception ex) {}
				
				table = new JTable();
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
					     	cb_polazak.setToolTipText(model.getValueAt(row,5).toString());
					     	cb_dolazak.setToolTipText(model.getValueAt(row,6).toString());
					    	datum_polaska.setText(model.getValueAt(row,7).toString());
					    	txt_SIFRA.setText(model.getValueAt(row,8).toString());
					    	txt_BROJ_SEDISTA.setText(model.getValueAt(row,9).toString());
					    	txt_IME_AVIONA.setText(model.getValueAt(row,10).toString());
					     	textField_ime_putnika.setText(model.getValueAt(row,11).toString());
					     	textField_prezime.setText(model.getValueAt(row,12).toString());
					     	textField_id_putnika.setText(model.getValueAt(row,13).toString());
					     	textField_br_pasosa.setText(model.getValueAt(row,14).toString());
					     	textField_pol.setText(model.getValueAt(row,15).toString());
					     	textField_telefon.setText(model.getValueAt(row,16).toString());
					     	textField_adresa.setText(model.getValueAt(row,17).toString());
					     	
					     	textField_ID_KARTE.setText(model.getValueAt(row,18).toString());
					     	
											
									
						} catch (Exception ex) {
			                   System.out.println(table.getModel().getValueAt(table.getRowCount(), 0));

						}
					}
				});
				scrollPane.setViewportView(table);
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp", "SIFRA", "broj_sedista","IME AVIONA","IME", "PREZIME","ID", "BROJ PASOSA","POL", "BROJ TEL",  "ADRESA", "ID KARTE"
					}
				));
				
		           scrollPane.addContainerListener(new ContainerAdapter() {
					
					
					public void componentAdded(ContainerEvent e) {
						try {
							Class.forName("com.mysql.jdbc.Driver");
					     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					     	
							String query = "SELECT * FROM karta";
							java.sql.PreparedStatement s = con.prepareStatement(query);
							ResultSet rs = s.executeQuery();
							table.setModel(DbUtils.resultSetToTableModel(rs));
							int br=0;
							while (rs.next()) {
								br++;
								
							}
							Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp", "SIFRA", "broj_sedista","IME AVIONA","IME", "PREZIME","ID", "BROJ PASOSA","POL", "BROJ TEL",  "ADRESA", "ID KARTE"};
							Object podaci [][] = new Object [br][19];
							
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
								podaci[i][11]=rs.getString("IME");
								podaci[i][12]=rs.getString("PREZIME");
								podaci[i][13]=rs.getString("ID");
								podaci[i][14]=rs.getString("BROJ PASOSA");
			                    podaci[i][15]=rs.getString("POL");		
								podaci[i][16]=rs.getString("BROJ TEL");
								podaci[i][17]=rs.getString("ADRESA");
								podaci[i][18]=rs.getString("ID KARTE");


							
								i++;
							}
							
					}catch(Exception ex) {}
						
					}
				});
		          
		           
					
			}
			
			
		});
		
		JButton pretraga1 = new JButton("PRETRA\u017DI");
		pretraga1.setForeground(new Color(0, 0, 0));
   		pretraga1.setFont(new Font("Dialog", Font.PLAIN, 12));
   		pretraga1.setBackground(new Color(255, 255, 255));
   		pretraga1.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");			     	
   					String query = "SELECT * FROM karta WHERE id_karte like '%"+textField_pretraga22.getText()+"%' ";
   					java.sql.PreparedStatement s = con.prepareStatement(query);
   					ResultSet rs = s.executeQuery();
   					table.setModel(DbUtils.resultSetToTableModel(rs));
   					int br=0;
   					while (rs.next()) {
   						br++;						
   					}
   					Object podaci [][] = new Object [br][19];
   					
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
						podaci[i][11]=rs.getString("IME");
						podaci[i][12]=rs.getString("PREZIME");
						podaci[i][13]=rs.getString("ID");
						podaci[i][14]=rs.getString("BROJ PASOSA");
	                    podaci[i][15]=rs.getString("POL");		
						podaci[i][16]=rs.getString("BROJ TEL");
						podaci[i][17]=rs.getString("ADRESA");
						podaci[i][18]=rs.getString("ID KARTE");

   						i++;
   					}		
   			}catch(Exception ex) {}
   				}});
   		pretraga1.setBounds(532, 165, 103, 32);
   		frame.getContentPane().add(pretraga1);
   		
   	 textField_pretraga22 = new JTextField();
		textField_pretraga22.setBounds(376, 166, 119, 32);
		frame.getContentPane().add(textField_pretraga22);
		textField_pretraga22.setColumns(10);		
		
		JButton obrisi = new JButton("OTKA\u017DI KARTU");
		obrisi.setForeground(new Color(0, 0, 0));
		obrisi.setBackground(new Color(255, 255, 255));
		obrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					String query = "delete FROM karta where id_karte like '%"+ textField_pretraga22.getText()+"%'";
                    PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
                    pst.execute();
                    pst.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT * FROM karta";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					int br=0;
					while (rs.next()) {
						br++;
						
					}
					
					Object podaci [][] = new Object [br][19];
					
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
						podaci[i][11]=rs.getString("IME");
						podaci[i][12]=rs.getString("PREZIME");
						podaci[i][13]=rs.getString("ID");
						podaci[i][14]=rs.getString("BROJ PASOSA");
	                    podaci[i][15]=rs.getString("POL");		
						podaci[i][16]=rs.getString("BROJ TEL");
						podaci[i][17]=rs.getString("ADRESA");
						podaci[i][18]=rs.getString("ID KARTE");

						i++;
					}
          	}catch(Exception ex) {}
			}
		});
		obrisi.setFont(new Font("Dialog", Font.PLAIN, 14));
		obrisi.setBounds(599, 326, 146, 39);
		frame.getContentPane().add(obrisi);
		
		JButton btnSTAMPAJ = new JButton("\u0160TAMPAJ KARTU");
   		btnSTAMPAJ.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				try {
   					
   					String file_name= "C:\\Users\\giga_\\eclipse-workspace_new\\Diplomski_rad\\generate_pdf\\Elektronska_karta.pdf";
   				    
   			   
   					Rectangle pageSize = new Rectangle(800, 300); 
   					pageSize.setBackgroundColor(BaseColor.WHITE);
   					Document document= new Document(pageSize);
   			        PdfWriter.getInstance(document, new FileOutputStream(file_name));
   			        
 
   			        
   			        
   			        document.open();
   			        
   			    
   			        document.add(new Paragraph("                                                                                       ELEKTRONSKA KARTA"));
   			        
   			        document.add(new Paragraph(" "));

   			        document.add(new Paragraph(" "));
   			        document.add(new Paragraph(" VREME                    MESTO                        DATUM                     VREME                   VREME                  CENA                  BROJ"));
   			        document.add(new Paragraph("POLASKA                DOLASKA                  POLETANJA              POLETANJA           SLETANJA                  $                    PASOSA "));
   			        document.add(new Paragraph(" "));
   			        document.add(new Paragraph(" "));

   			      //KONEKCIJA SA BAZOM
   			      DBConnection objc= new DBConnection();
   			        Connection con = objc.getConnection();
   			        PreparedStatement s= null;
   			        ResultSet rs= null;
   					String query = "SELECT mesto_polaska, mesto_dolaska, datum_p, vreme_polaska, vreme_dolaska, cena, broj_pasosa FROM karta where id_karte like '%" + textField_pretraga22.getText()+"%' ";
   			        s=(PreparedStatement) con.prepareStatement (query);
   			        rs=s.executeQuery();
   			        
   			        while (rs.next()) {
   			        	Paragraph para= new Paragraph(rs.getString("mesto_polaska") + "                  " +rs.getString("mesto_dolaska") + "                  " +rs.getString("datum_p")
   			        	+ "                  " +	rs.getString("vreme_polaska") + "                  " +rs.getString("vreme_dolaska") + "                   " +rs.getString("cena")+ "                  " +rs.getString("broj_pasosa") );
   			        
   			            document.add(para);
   			            document.add(new Paragraph(" "));
   			        }
   			     
   			        
   			       // Paragraph para = new Paragraph("OVO JE TEST");
   			      //  document.add(para);
   			        
   			       // document.add(Image.getInstance("C:\\Users\\giga_\\eclipse-workspace_new\\Diplomski_rad\\generate_pdf\\pass.png"));
   			      //  Rectangle pageSize = new Rectangle(400, 720); 
   				 //    pageSize.setBackgroundColor(BaseColor.YELLOW);
   			      
   			        document.close();
   			        System.out.println("finished");
   			     
   				} catch (Exception e1) {
   					System.err.println(e1);
   				}
   			}
   		});
   		
   		btnSTAMPAJ.setBackground(new Color(204, 0, 0));
   		btnSTAMPAJ.setForeground(new Color(255, 255, 255));
   		btnSTAMPAJ.setFont(new Font("Tahoma", Font.PLAIN, 13));
   		btnSTAMPAJ.setBounds(327, 327, 174, 39);
   		frame.getContentPane().add(btnSTAMPAJ);
		
		JLabel lblSpisakProdatihKarata = new JLabel("SPISAK PRODATIH KARATA");
		lblSpisakProdatihKarata.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpisakProdatihKarata.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSpisakProdatihKarata.setBounds(202, 11, 459, 25);
		frame.getContentPane().add(lblSpisakProdatihKarata);
		
		JLabel lblNewLabel_3 = new JLabel("Unesite broj karte koju \u017Eelite da otka\u017Eete ili preuzmete:");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(51, 102, 102));
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(230, 122, 601, 32);
		frame.getContentPane().add(lblNewLabel_3);
	}

}
