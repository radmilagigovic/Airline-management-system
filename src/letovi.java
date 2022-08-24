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


public class letovi {

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
	private JTextField txt_SEDISTA;
	private JTable table2;
	private JButton sve_2;

	private JTable table;
	private JTextField datum_polaska;
	private JButton btnNewButton_1;
	private Image img_od = new ImageIcon(this.getClass().getResource("/od.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_do = new ImageIcon(this.getClass().getResource("/do.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);
	private Image img_vp = new ImageIcon(this.getClass().getResource("/vp.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	private Image img_vd = new ImageIcon(this.getClass().getResource("/vd.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);
	private JLabel lblNewLabel_16;
	private Image img_datum = new ImageIcon(this.getClass().getResource("/calendar.png")).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					letovi window = new letovi();
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
	public letovi() {
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
		frame.setBounds(500, 100, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		JPanel Header = new JPanel();
		Header.setBackground(new Color(102, 51, 102));
		Header.setBounds(0, 0, 784, 91);
		frame.getContentPane().add(Header);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		//Image img1 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage();
		Header.setLayout(null);
		
		lblNewLabel.setIcon(new ImageIcon(img_s2));
		lblNewLabel.setBounds(560, 0, 239, 97);
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
		JLabel lblPristupSistemu = new JLabel("Dodajte Novu Destinaciju");
		lblPristupSistemu.setForeground(new Color(51, 102, 102));
		lblPristupSistemu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPristupSistemu.setFont(new Font("Dialog", Font.BOLD, 26));
		//lblPristupSistemu.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPristupSistemu.setBounds(28, 102, 355, 39);
		frame.getContentPane().add(lblPristupSistemu);
		
		JLabel lblNewLabel_2 = new JLabel("Ime leta:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_2.setForeground(new Color(51, 102, 102));

		lblNewLabel_2.setBounds(48, 195, 71, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Do:");
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_3.setForeground(new Color(51, 102, 102));
		lblNewLabel_3.setBounds(48, 289, 71, 19);
		frame.getContentPane().add(lblNewLabel_3); 
		
		JLabel lblNewLabel_4 = new JLabel("Vreme dolaska:");
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_4.setForeground(new Color(51, 102, 102));
		lblNewLabel_4.setBounds(446, 228, 116, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Vreme polaska:");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_5.setForeground(new Color(51, 102, 102));
		lblNewLabel_5.setBounds(446, 197, 116, 19);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Od:");
		lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_6.setForeground(new Color(51, 102, 102));
		lblNewLabel_6.setBounds(48, 242, 80, 14);
		frame.getContentPane().add(lblNewLabel_6); 
		
		/*JLabel lblNewLabel_8 = new JLabel("Broj mesta:");
		lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(48, 319, 71, 19);
		frame.getContentPane().add(lblNewLabel_8);  */
		
		txt_IME = new JTextField();
		txt_IME.setColumns(10);
		txt_IME.setBackground(Color.WHITE);
		txt_IME.setBounds(171, 195, 153, 23);
		frame.getContentPane().add(txt_IME);
		
		txt_VREMEP = new JTextField();
		txt_VREMEP.setColumns(10);
		txt_VREMEP.setBackground(Color.WHITE);
		txt_VREMEP.setBounds(588, 198, 116, 23);
		frame.getContentPane().add(txt_VREMEP);
		
		/*textField_BR_MESTA = new JTextField();
		textField_BR_MESTA.setForeground(Color.BLACK);
		textField_BR_MESTA.setColumns(10);
		textField_BR_MESTA.setBackground(Color.WHITE);
		textField_BR_MESTA.setBounds(150, 320, 73, 20);
		frame.getContentPane().add(textField_BR_MESTA);*/
		
		txt_VREMED = new JTextField();
		txt_VREMED.setColumns(10);
		txt_VREMED.setBackground(Color.WHITE);
		txt_VREMED.setBounds(588, 230, 116, 23);
		frame.getContentPane().add(txt_VREMED);

		txt_CENA = new JTextField();
		txt_CENA.setForeground(Color.RED);
		txt_CENA.setBounds(588, 264, 75, 23);
		frame.getContentPane().add(txt_CENA);
		txt_CENA.setColumns(10);
		
		txt_ID = new JTextField();
		txt_ID.setBounds(171, 165, 153, 23);
		frame.getContentPane().add(txt_ID);
		txt_ID.setColumns(10);
		
	/*	JLabel lblPristupSistemu = new JLabel("Dostupni Avioni");
		lblPristupSistemu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPristupSistemu.setFont(new java.awt.Font("Dialog", 1, 30));
		//lblPristupSistemu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPristupSistemu.setBounds(28, 579, 262, 40);
		frame.getContentPane().add(lblPristupSistemu);
		*/
		JLabel lblEmail = new JLabel("\u0160ifra aviona:");
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 17)); // NOI18N
		lblEmail.setForeground(new Color(51, 102, 102));
		
		lblEmail.setBounds(367, 551, 95, 29);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblIme = new JLabel("Ime aviona:");
		lblIme.setFont(new Font("Dialog", Font.PLAIN, 17)); // NOI18N
		lblIme.setForeground(new Color(51, 102, 102));
		//lblLozinka.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIme.setBounds(367, 610, 103, 29);
		frame.getContentPane().add(lblIme);
	
		//private JTextField id_input;
		//private JTextField planeName_input;
		//private JTextField seats_input;
		
		txt_SIFRA = new JTextField();
		txt_SIFRA.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		txt_SIFRA.setBounds(470, 555, 92, 19);
		frame.getContentPane().add(txt_SIFRA);
		txt_SIFRA.setColumns(10);
		
		txt_IME_AVIONA = new JTextField();
		txt_IME_AVIONA.setFont(new Font("Dialog", Font.PLAIN, 12)); // NOI18N
		txt_IME_AVIONA.setBounds(470, 614, 92, 19);
		frame.getContentPane().add(txt_IME_AVIONA);
		txt_IME_AVIONA.setColumns(10);
		
		txt_SEDISTA = new JTextField();
		txt_SEDISTA.setFont(new Font("Dialog", Font.PLAIN, 12));
		txt_SEDISTA.setBounds(470, 584, 92, 19);
		frame.getContentPane().add(txt_SEDISTA);
		txt_SEDISTA.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Broj sedi\u0161ta:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_1.setForeground(new Color(51, 102, 102));
		lblNewLabel_1.setBounds(367, 580, 103, 29);
		frame.getContentPane().add(lblNewLabel_1);
	
		

		JLabel lblSpisakSvihLetova = new JLabel("Spisak svih letova:");
		lblSpisakSvihLetova.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpisakSvihLetova.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblSpisakSvihLetova.setForeground(new Color(51, 102, 102));

		lblSpisakSvihLetova.setBounds(370, 37, 304, 25);
		frame.getContentPane().add(lblSpisakSvihLetova);
		
		JLabel lblNewLabel_13 = new JLabel("Sifra leta:");
		lblNewLabel_13.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_13.setForeground(new Color(51, 102, 102));
		lblNewLabel_13.setBounds(48, 159, 109, 28);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_7 = new JLabel("Cena:");
		lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 17));
		lblNewLabel_7.setForeground(new Color(51, 102, 102));
		lblNewLabel_7.setBounds(446, 261, 56, 23);
		frame.getContentPane().add(lblNewLabel_7);
		
		JComboBox cb_polazak = new JComboBox();
		cb_polazak.setFont(new Font("Dialog", Font.BOLD, 18));
		cb_polazak.setModel(new DefaultComboBoxModel(new String[] {"Beograd", "Barselona", "Pariz", "Nica", "Berlin", "Frankfurt", "Nica"}));
		cb_polazak.setToolTipText("Beograd");
		cb_polazak.setMaximumRowCount(15);
		cb_polazak.setBounds(171, 230, 153, 39);
		frame.getContentPane().add(cb_polazak);
		
		JComboBox cb_dolazak = new JComboBox();
		cb_dolazak.setFont(new Font("Dialog", Font.BOLD, 18));
		cb_dolazak.setForeground(Color.BLACK);
		cb_dolazak.setToolTipText("");
		cb_dolazak.setModel(new DefaultComboBoxModel(new String[] {"Barselona", "Pariz", "Amsterdam", "Atina", "Nica", "Beograd", "Berlin", "Krakov", "Njujork", "Varsava", "Banja Luka"}));
		cb_dolazak.setBounds(171, 279, 153, 39);
		frame.getContentPane().add(cb_dolazak);
		
		JLabel lblNewLabel_10 = new JLabel("Datum:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_10.setForeground(new Color(51, 102, 102));
		lblNewLabel_10.setBounds(409, 162, 95, 23);
		frame.getContentPane().add(lblNewLabel_10);
		
		JButton dodaj = new JButton("DODAJ");
		dodaj.setForeground(new Color(255, 255, 255));
		dodaj.setBackground(new Color(102, 51, 102));
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				   String idd=txt_ID.getText();
		           String imee = txt_IME.getText();
		           String vremepp = txt_VREMEP.getText();
		           String vremedd = txt_VREMED.getText();
		           String cenaa = txt_CENA.getText();
			       String polazakk = (String)cb_polazak.getItemAt(cb_polazak.getSelectedIndex());
			       String dolazakk = (String)cb_dolazak.getItemAt(cb_dolazak.getSelectedIndex());
		           String datummp = datum_polaska.getText();
		           
		        //   String tipp1 = rdbtn_1.getText();
		        //   String tipp2 = rdbtn2.getText();


		           
		        	   try{
	     			Class.forName("com.mysql.jdbc.Driver");
	    	     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
	    	     	 String query = "insert into letovi values('" + idd + "','" + imee + "','" + vremepp + "','" + vremedd + "','" + cenaa + "','" + polazakk + "','" + dolazakk + "','" + datummp +  "')";
	    	     	Statement st =con.createStatement() ;
	    	     
	                int rows=st.executeUpdate(query);
	                
	                if (rows == 0) {
	                	System.out.println("vec postoji");
	                }else {
	                	System.out.println("odlicno");
	                }
	           
	               //aerodrom.main(new String[]{})
					//frame.dispose();
				}catch(Exception e1) {System.out.print(e1);}
		        	   
		        	   try {
							Class.forName("com.mysql.jdbc.Driver");
					     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					     	
							String query = "SELECT id_leta, ime_leta, vreme_polaska, vreme_dolaska, cena, mesto_polaska, mesto_dolaska, datum_p FROM letovi";
							java.sql.PreparedStatement s = con.prepareStatement(query);
							ResultSet rs = s.executeQuery();
							table.setModel(DbUtils.resultSetToTableModel(rs));
							int br=0;
							while (rs.next()) {
								br++;
								
							}
							Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp"};
							
							Object podaci [][] = new Object [br][8];
						
						
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
								
								

								i++;
							}

							
					}catch(Exception ex) {}
		     			
			}
		});
		dodaj.setFont(new Font("Dialog", Font.PLAIN, 14));
		dodaj.setBounds(151, 346, 92, 41);
		frame.getContentPane().add(dodaj);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setBounds(28, 398, 719, 85);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFillsViewportHeight(true);
		//table.setBackground(Color.WHITE);
		table.setBackground(new Color(51, 102, 102));
   		table.setForeground(new Color(255, 255, 255));
		table.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		//table.setForeground(Color.GRAY);
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
			     	cb_polazak.setToolTipText(model.getValueAt(row,5).toString());
			     	cb_dolazak.setToolTipText(model.getValueAt(row,6).toString());
			    	datum_polaska.setText(model.getValueAt(row,7).toString());
			     	
			     	//rdbtn_1.setText(model.getValueAt(row,9).toString());
			     	//rdbtn2.setText(model.getValueAt(row,10).toString());

						
							
				} catch (Exception ex) {
	                   System.out.println(table.getModel().getValueAt(table.getRowCount(), 0));

				}
			}
		});
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {  "ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK","dp"
			}
		));
		
           scrollPane.addContainerListener(new ContainerAdapter() {
			
			
			public void componentAdded(ContainerEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT id_leta, ime_leta, vreme_polaska, vreme_dolaska, cena, mesto_polaska, mesto_dolaska,datum_p FROM letovi";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					int br=0;
					while (rs.next()) {
						br++;
						
					}
					Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp"};
					
					Object podaci [][] = new Object [br][8];
				
				
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
						
						

					

						
						i++;
					}
					
			}catch(Exception ex) {}
				
			}
		});
          
           
		
        JButton izmeni = new JButton("IZMENI");
        izmeni.setForeground(new Color(255, 255, 255));
        izmeni.setBackground(new Color(102, 51, 102));
   		izmeni.setFont(new Font("Dialog", Font.PLAIN, 14));  
   		izmeni.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
   			     String query = "update letovi set ime_leta='"+txt_IME.getText()+"',vreme_polaska='"+txt_VREMEP.getText()+"',vreme_dolaska='"+txt_VREMED.getText()+"',cena='"+txt_CENA.getText()+"', mesto_polaska='"+cb_polazak.getSelectedItem()+"',mesto_dolaska='"+cb_dolazak.getSelectedItem() +"',datum_p='"+datum_polaska.getText()+"'  where id_leta like '%" + txt_ID.getText()+"%' ";
                       PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
                       
                       pst.execute();
                       pst.close();
   				}catch(Exception e1) {
   					e1.printStackTrace();
   				}
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT id_leta, ime_leta, vreme_polaska, vreme_dolaska, cena, mesto_polaska, mesto_dolaska, datum_p FROM letovi";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					int br=0;
					while (rs.next()) {
						br++;
						
					}
                    Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp"};
					
					Object podaci [][] = new Object [br][8];
				
				
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
						i++;
   					}

   					
   			}catch(Exception ex) {}
   			}
   			
   		});
   		izmeni.setBounds(345, 347, 92, 38);
   		frame.getContentPane().add(izmeni);
		
		
		
		JButton obrisi = new JButton("OBRISI");
		obrisi.setForeground(new Color(255, 255, 255));
		obrisi.setBackground(new Color(102, 51, 102));
		obrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					String query = "delete FROM letovi where id_leta like '%"+ txt_ID.getText()+"%'";
                    PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
                    pst.execute();
                    pst.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT id_leta, ime_leta, vreme_polaska, vreme_dolaska, cena, mesto_polaska, mesto_dolaska, datum_p FROM letovi";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					int br=0;
					while (rs.next()) {
						br++;
						
					}
					
                    Object kolona[] = {"ID", "IME","POLAZNO VREME","DOLAZNO VREME","CENA", "POLAZAK", "DOLAZAK", "dp"};
					
					Object podaci [][] = new Object [br][8];
				
				
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
						i++;
					}
          	}catch(Exception ex) {}
			}
		});
		obrisi.setFont(new Font("Dialog", Font.PLAIN, 14));
		obrisi.setBounds(532, 347, 92, 39);
		frame.getContentPane().add(obrisi);
		
		
		JButton btnNewButton = new JButton("NAZAD");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(102, 51, 102));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main1.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setBounds(630, 627, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		datum_polaska = new JTextField();
		datum_polaska.setBounds(588, 164, 116, 23);
		frame.getContentPane().add(datum_polaska);
		datum_polaska.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(390, 127, 20, 203);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_8 = new JLabel("$");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_8.setBounds(673, 261, 20, 23);
		frame.getContentPane().add(lblNewLabel_8);
		
		table2 = new JTable();
   		JScrollPane scrollPane2 = new JScrollPane();
   		scrollPane2.addContainerListener(new ContainerAdapter() {
   			@Override
   			
   			public void componentAdded(ContainerEvent e) {
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
   			     	
   					String query = "SELECT sifra, broj_sedista, ime FROM avion ";
   					java.sql.PreparedStatement s = con.prepareStatement(query);
   					ResultSet rs = s.executeQuery();
   					table2.setModel(DbUtils.resultSetToTableModel(rs));
   					int br=0;
   					while (rs.next()) {
   						br++;						
   					}
   					Object kolona[] = {"SIFRA", "broj_sedista","IME AVIONA"};
					Object podaci [][] = new Object [br][3];
				
				
					int i = 0;
					while (rs.next()) {
						podaci[i][0]=rs.getString("SIFRA");
						podaci[i][1]=rs.getString("broj_sedista");
						podaci[i][2]=rs.getString("IME AVIONA");
   						i++;
   					}					
   			}catch(Exception ex) {}											
   			}
   		});
   		scrollPane2.setBounds(33, 548, 304, 91);
   		frame.getContentPane().add(scrollPane2);
   		
   		
   
   		 table2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						try {			

							Class.forName("com.mysql.jdbc.Driver");
					     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
							DefaultTableModel model = (DefaultTableModel)table2.getModel();
					     	int row =table2.getSelectedRow();
					     	
					     	txt_SIFRA.setText(model.getValueAt(row,0).toString());
					     	txt_SEDISTA.setText(model.getValueAt(row,1).toString());
					     	txt_IME_AVIONA.setText(model.getValueAt(row,2).toString());
					     	
									
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
   					"SIFRA", "broj_sedista","IME AVIONA"
   			}
   		));		
   		
   		JLabel lblNewLabel_9 = new JLabel("Odaberite Avion");
   		lblNewLabel_9.setForeground(new Color(51, 102, 102));
   		lblNewLabel_9.setFont(new Font("Dialog", Font.BOLD, 26));
   		lblNewLabel_9.setBounds(39, 513, 215, 24);
   		frame.getContentPane().add(lblNewLabel_9);
   		
   		

   		btnNewButton_1 = new JButton("SA\u010CUVAJ");
   		btnNewButton_1.setForeground(new Color(255, 255, 255));
   		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
   		btnNewButton_1.setBackground(new Color(102, 51, 102));
   		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				   String iddd=txt_ID.getText();
		           String imeee = txt_IME.getText();
		           String vremeppp = txt_VREMEP.getText();
		           String vremeddd = txt_VREMED.getText();
		           String cenaaa = txt_CENA.getText();
			       String polazakkk = (String)cb_polazak.getItemAt(cb_polazak.getSelectedIndex());
			       String dolazakkk = (String)cb_dolazak.getItemAt(cb_dolazak.getSelectedIndex());
		           String datummpp = datum_polaska.getText();
		           String sifraaa=txt_SIFRA.getText();
		           String sedistaaa=txt_SEDISTA.getText();
		           String imee2 = txt_IME_AVIONA.getText();
		           
		        	   try{
	     			Class.forName("com.mysql.jdbc.Driver");
	    	     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
	    	 
	    	     	 
	    String query = "insert into sve values('" + iddd + "','" + imeee + "','" + vremeppp + "','" + vremeddd + "','" + cenaaa +
	    	     			 "','" + polazakkk + "','" + dolazakkk + "','" + datummpp + "','" + sifraaa + "','" + sedistaaa + "','" + imee2 +  "')";

	    	     	 
	    	     	 
	    	     	Statement st =con.createStatement() ;
	    	     
	              
	                int rows=st.executeUpdate(query);
	                
	                if (rows == 0) {
	                	System.out.println("vec postoji");
	                }else {
	                	System.out.println("odlicno");
	                	JOptionPane.showMessageDialog(null,"Uspesno ste sacuvali podatke o destinaciji!");	
	                	
	                }
	           
	              // aerodrom.main(new String[]{});
					//frame.dispose();
				}catch(Exception e1) {System.out.print(e1);}
				
			}
		});
   		
   		btnNewButton_1.setBounds(620, 568, 131, 52);
   		frame.getContentPane().add(btnNewButton_1);
   		
   		JLabel slika_od = new JLabel("");
   		slika_od.setBounds(126, 239, 53, 30);
   		slika_od.setIcon(new ImageIcon(img_od));
   		frame.getContentPane().add(slika_od);
   		
   		JLabel slika_do = new JLabel("");
   		slika_do.setBounds(126, 285, 46, 29);
   		slika_do.setIcon(new ImageIcon(img_do));
   		frame.getContentPane().add(slika_do);
   		
   		JLabel slika_vp = new JLabel("");
   		slika_vp.setBounds(705, 198, 33, 23);
   		slika_vp.setIcon(new ImageIcon(img_vp));
        frame.getContentPane().add(slika_vp);
   		
   		JLabel slika_vd = new JLabel("");
   		slika_vd.setBounds(705, 228, 33, 28);
   		slika_vd.setIcon(new ImageIcon(img_vd));
      	frame.getContentPane().add(slika_vd);
   		
   		JLabel slika_datum = new JLabel("");
   		slika_datum.setBounds(705, 159, 33, 35);
   		slika_datum.setIcon(new ImageIcon(img_datum));
   		frame.getContentPane().add(slika_datum);
   		
   		

		
		
		
	}
}
