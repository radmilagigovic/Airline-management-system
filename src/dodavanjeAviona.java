import java.awt.Color;
import javax.swing.JTable;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
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


public class dodavanjeAviona {

	private JFrame frame;
	private JTextField txt_SIFRA;
	private JTextField txt_IME;
	private JTextField txt_SEDISTA;
	//private JTextField txtBrojSedita;
	private JTable table;
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dodavanjeAviona window = new dodavanjeAviona();
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
	public dodavanjeAviona() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(255, 255, 255));
		frame.setFont(new Font("Dialog", Font.PLAIN, 12));
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setTitle("FinAir sistem");
		frame.setBounds(600, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Header = new JPanel();
		Header.setBackground(new Color(102, 51, 102));
		Header.setBounds(0, 0, 584, 97);
		frame.getContentPane().add(Header);
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		//Image img1 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage();
		Header.setLayout(null);
		
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
		
		JLabel lblPristupSistemu = new JLabel("Dostupni Avioni");
		lblPristupSistemu.setForeground(new Color(51, 102, 102));
		lblPristupSistemu.setHorizontalAlignment(SwingConstants.CENTER);
		lblPristupSistemu.setFont(new Font("Dialog", Font.PLAIN, 30));
		//lblPristupSistemu.setFont(new Font("Dialog", Font.BOLD, 20));
		lblPristupSistemu.setBounds(34, 108, 262, 40);
		frame.getContentPane().add(lblPristupSistemu);
		
		JLabel lblEmail = new JLabel("\u0160ifra aviona:");
		lblEmail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		lblEmail.setForeground(new Color(51, 102, 102));
		lblEmail.setBounds(64, 173, 103, 29);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblIme = new JLabel("Ime aviona:");
		lblIme.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		lblIme.setForeground(new Color(51, 102, 102));
		//lblLozinka.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblIme.setBounds(204, 173, 103, 29);
		frame.getContentPane().add(lblIme);
	
		//private JTextField id_input;
		//private JTextField planeName_input;
		//private JTextField seats_input;
		
		txt_SIFRA = new JTextField();
		txt_SIFRA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		txt_SIFRA.setBounds(64, 202, 103, 29);
		frame.getContentPane().add(txt_SIFRA);
		txt_SIFRA.setColumns(10);
		
		txt_IME = new JTextField();
		txt_IME.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
		txt_IME.setBounds(204, 202, 165, 30);
		frame.getContentPane().add(txt_IME);
		txt_IME.setColumns(10);
		
		txt_SEDISTA = new JTextField();
		txt_SEDISTA.setFont(new Font("Dialog", Font.PLAIN, 18));
		txt_SEDISTA.setBounds(64, 267, 103, 29);
		frame.getContentPane().add(txt_SEDISTA);
		txt_SEDISTA.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Broj sedi\u0161ta:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(64, 242, 103, 24);
		lblNewLabel_1.setForeground(new Color(51, 102, 102));
		frame.getContentPane().add(lblNewLabel_1);
	
		
		JButton dodaj = new JButton("DODAJ");
		dodaj.setForeground(new Color(255,255,255));
		dodaj.setBackground(new Color(102, 51, 102));
		
		dodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
				   String sifraa=txt_SIFRA.getText();
		           String sedistaa=txt_SEDISTA.getText();
		           String imee = txt_IME.getText();
		          
		           
		        	   try{
	     			Class.forName("com.mysql.jdbc.Driver");
	    	     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
	    	     	 String query = "insert into avion values('" + sifraa + "','" + sedistaa + "','" + imee +  "')";
	    	     	Statement st =con.createStatement() ;
					//ResultSet rs=st.executeQuery(sql);

	                int rows=st.executeUpdate(query);
	                
	                
	                if (rows == 0) {
	                	System.out.println("Odlicno");
	                	JOptionPane.showMessageDialog(null,"Uspešno ste dodali avion u bazu." );	
	                	//con.close();
	                     }
	            
	                else {
	                	System.out.println("ok");
	                	JOptionPane.showMessageDialog(null,"Uspešno ste dodali avion u bazu!");					
	                	//frame.dispose();
	                }
	           
	               //aerodrom.main(new String[]{});
					//frame.dispose();
				}catch(Exception e1) {System.out.print(e1);}
		        	   
		        	   try {
							Class.forName("com.mysql.jdbc.Driver");
					     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					     	
							String query = "SELECT sifra, broj_sedista, ime FROM avion";
							java.sql.PreparedStatement s = con.prepareStatement(query);
							ResultSet rs = s.executeQuery();
							table.setModel(DbUtils.resultSetToTableModel(rs));
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
		dodaj.setFont(new Font("Dialog", Font.PLAIN, 16));
		dodaj.setBounds(438, 169, 121, 38);
		frame.getContentPane().add(dodaj);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane.setBounds(64, 307, 337, 122);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(51, 102, 102));
		table.setForeground(new Color(255, 255, 255));
		table.setFont(new Font("Dialog", Font.PLAIN, 11));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {			

					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					DefaultTableModel model = (DefaultTableModel)table.getModel();
			     	int row =table.getSelectedRow();
			     	
			     	txt_SIFRA.setText(model.getValueAt(row,0).toString());
			     	txt_SEDISTA.setText(model.getValueAt(row,1).toString());
			     	txt_IME.setText(model.getValueAt(row,2).toString());
			     
						
							
				} catch (Exception ex) {
	                   System.out.println(table.getModel().getValueAt(table.getRowCount(), 0));

				}
			}
		});
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {  "SIFRA", "broj_sedista","IME AVIONA"
			}
		));
		
           scrollPane.addContainerListener(new ContainerAdapter() {
			
			
			public void componentAdded(ContainerEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT sifra, broj_sedista, ime FROM avion";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
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
          
           
		
        JButton izmeni = new JButton("IZMENI");
        
        izmeni.setBackground(new Color(102, 51, 102));
        izmeni.setForeground(new Color(255,255,255));
   		izmeni.setFont(new Font("Dialog", Font.PLAIN, 16));  
   		izmeni.addActionListener(new ActionListener() {
   			public void actionPerformed(ActionEvent e) {
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
   			     String query = "update avion set broj_sedista='"+txt_SEDISTA.getText()+"',ime='"+txt_IME.getText()+"'  where sifra like '%" + txt_SIFRA.getText()+"%' ";
                       PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
	                	JOptionPane.showMessageDialog(null,"Uspešno ste izmenili podatke!");					

                       pst.execute();
                       pst.close();
   				}catch(Exception e1) {
   					e1.printStackTrace();
   				}
   				try {
   					Class.forName("com.mysql.jdbc.Driver");
   			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
   			     	
   					String query = "SELECT sifra, broj_sedista, ime FROM avion";
   					java.sql.PreparedStatement s = con.prepareStatement(query);
   					ResultSet rs = s.executeQuery();
   					table.setModel(DbUtils.resultSetToTableModel(rs));
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
		izmeni.setBounds(438, 218, 121, 38);
		frame.getContentPane().add(izmeni);
		
		
		
		JButton obrisi = new JButton("OBRISI");
		obrisi.setBackground(new Color(102, 51, 102));
		obrisi.setForeground(new Color(255,255,255));
		obrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
					String query = "delete from avion where sifra like '%"+ txt_SIFRA.getText()+"%'";
                    PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
                    pst.execute();
                    pst.close();
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				try {
					Class.forName("com.mysql.jdbc.Driver");
			     	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
			     	
					String query = "SELECT sifra, broj_sedista, ime FROM avion";
					java.sql.PreparedStatement s = con.prepareStatement(query);
					ResultSet rs = s.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
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
		obrisi.setFont(new Font("Dialog", Font.PLAIN, 16));
		obrisi.setBounds(438, 268, 121, 38);
		frame.getContentPane().add(obrisi);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(414, 156, 21, 150);
		frame.getContentPane().add(separator);
		
		JButton btnNewButton = new JButton("NAZAD");
		btnNewButton.setBackground(new Color(102, 51, 102));
		btnNewButton.setForeground(new Color(255,255,255));
		btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main1.main(new String[]{});
				frame.dispose();
			}
		});
		btnNewButton.setBounds(438, 389, 121, 40);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 463, 584, 50);
		panel.setBackground(new Color(102, 51, 102));
		frame.getContentPane().add(panel);
		
		
		
		/*
		JButton izlaz = new JButton("IZLAZ");
		izlaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aerodrom.main(new String[]{});
				frame.dispose();

			}
		});
		izlaz.setFont(new Font("Dialog", Font.PLAIN, 14));
		izlaz.setBounds(653, 343, 89, 23);
		frame.getContentPane().add(izlaz);
		*/
		
		
		
	}
}
