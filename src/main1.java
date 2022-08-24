import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;



import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Menu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.MatteBorder;

public class main1 extends JFrame {

	private JPanel contentPane;
	private final JPanel paneLetovi = new JPanel();
	private final JPanel panePutnici = new JPanel();
	private Image img_a = new ImageIcon(this.getClass().getResource("/avionii.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_l = new ImageIcon(this.getClass().getResource("/letovi.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_p = new ImageIcon(this.getClass().getResource("/putniciii.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_r = new ImageIcon(this.getClass().getResource("/rezervacijaa.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_o = new ImageIcon(this.getClass().getResource("/otkazivanjee.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_k = new ImageIcon(this.getClass().getResource("/kartee.png")).getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
	private Image img_s = new ImageIcon(this.getClass().getResource("/logonovi.png")).getImage().getScaledInstance(180, 110, Image.SCALE_SMOOTH);
	private Image img_s2 = new ImageIcon(this.getClass().getResource("/slikaaa.png")).getImage().getScaledInstance(230, 110, Image.SCALE_SMOOTH);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main1 frame = new main1();
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
	public main1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 200, 450, 300);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new LineBorder(new Color(102, 51, 102)));
		panelMenu.setBackground(new Color(102, 51, 102));
		panelMenu.setBounds(104, 0, 231, 289);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		//KLIK NA LETOVE
	
		paneLetovi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneLetovi.setBackground(new Color(255,140,0));
				letovi.main(new String[]{});
			}
			
		});
		paneLetovi.setBackground(new Color(102, 51, 102));
		paneLetovi.setBounds(0, 145, 231, 30);
		panelMenu.add(paneLetovi);
		paneLetovi.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LETOVI\r\n");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(75,5, 80, 16);
		paneLetovi.add(lblNewLabel_1);
		
		JLabel img_let = new JLabel("");
		img_let.setBounds(25, 5, 49, 25);
		img_let.setIcon(new ImageIcon(img_l));
		paneLetovi.add(img_let);
		
		
		//KLIK NA PUTNIKE
		
		panePutnici.setBackground(new Color(102, 51, 102));
		panePutnici.setBounds(0, 186, 231, 27);
		panelMenu.add(panePutnici);
		
		panePutnici.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panePutnici.setBackground(new Color(255,140,0));
				putnici.main(new String[]{});
			}
			
		});
		panePutnici.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("PUTNICI");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(88, 8, 87, 14);
		panePutnici.add(lblNewLabel_2);
		
		JLabel img_putnici = new JLabel("");
		img_putnici.setBounds(24, 0, 46, 27);
		img_putnici.setIcon(new ImageIcon(img_p));
		panePutnici.add(img_putnici);
		
		//KLIK NA REZERVACIJU
		
		JPanel paneRezervacija = new JPanel();
		paneRezervacija.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneRezervacija.setBackground(new Color(255,140,0));
				reservation.main(new String[]{});
			}
			
		});
		paneRezervacija.setBackground(new Color(102, 51, 102));
		paneRezervacija.setBounds(0, 224, 231, 27);
		panelMenu.add(paneRezervacija);
		paneRezervacija.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("REZERVACIJA");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(70, 9, 113, 14);
		paneRezervacija.add(lblNewLabel_3);
		
		JLabel img_rez = new JLabel("");
		img_rez.setBounds(24, 5, 46, 16);
		img_rez.setIcon(new ImageIcon(img_r));
		paneRezervacija.add(img_rez);
		
		JPanel paneOtkazivanje = new JPanel();
		paneOtkazivanje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneOtkazivanje.setBackground(new Color(255,140,0));
				otkazivanje.main(new String[]{});
				

			}
		});
		paneOtkazivanje.setBackground(new Color(102, 51, 102));
		paneOtkazivanje.setBounds(0, 262, 231, 27);
		panelMenu.add(paneOtkazivanje);
		paneOtkazivanje.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("OTKAZIVANJE");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(70, 8, 115, 14);
		paneOtkazivanje.add(lblNewLabel_4);
		
		JLabel img_otkazivanje = new JLabel("");
		img_otkazivanje.setBounds(25, 0, 49, 27);
		img_otkazivanje.setIcon(new ImageIcon(img_o));
		paneOtkazivanje.add(img_otkazivanje);
		
		JPanel paneAvioni = new JPanel();
	      paneAvioni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 paneAvioni.setBackground(new Color(255,140,0));
			 dodavanjeAviona.main(new String[]{});
			

				//paneAvioni.dispose();
			}
	});
	
		
		paneAvioni.setBounds(0, 104, 231, 30);
		panelMenu.add(paneAvioni);
		paneAvioni.setBackground(new Color(102, 51, 102));
		paneAvioni.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AVIONI");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel.setBounds(49, -1, 128, 25);
		paneAvioni.add(lblNewLabel);
		
		JLabel img_airplane = new JLabel("");
		img_airplane.setBounds(27, 10, 46, 14);
		img_airplane.setIcon(new ImageIcon(img_a));
		paneAvioni.add(img_airplane);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(0, 0, 231, 116);
		panelMenu.add(lblNewLabel_7);
		lblNewLabel_7.setIcon(new ImageIcon(img_s2));
		
		JLabel lbllogo = new JLabel("");
		lbllogo.setBounds(359, 40, 81, 46);
		contentPane.add(lbllogo);
		
		JPanel paneStampanje = new JPanel();
		paneStampanje.setBorder(new EmptyBorder(0, 0, 0, 0));
		paneStampanje.setBounds(358, 263, 92, 37);
		contentPane.add(paneStampanje);
		paneStampanje.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneStampanje.setBackground(new Color(255,140,0));
				JOptionPane.showMessageDialog(null,"Uspešno ste se odjavili!" );
				prijavaZaposleni.main(new String[]{});

			}
		});
		paneStampanje.setBackground(new Color(102, 51, 102));
		paneStampanje.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("ODJAVI SE");
		lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(new Color(255, 250, 250));
		lblNewLabel_5.setBounds(10, 11, 72, 14);
		paneStampanje.add(lblNewLabel_5);
		
		
		//JLabel lblNewLabel_6 = new JLabel("Za siguran i \r\nudoban let");
		//lblNewLabel_6.setLabelFor(lblNewLabel_7);
		//lblNewLabel_6.setBounds(48, 34, 182, 110);
		//panelMenu.add(lblNewLabel_6);
		//lblNewLabel_6.setBackground(Color.PINK);
		///lblNewLabel_6.setForeground(Color.MAGENTA);
		//lblNewLabel_6.setFont(new Font("Freestyle Script", Font.PLAIN, 28));
	}
	
	private class PanelButtonMouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel){
			this.panel=panel;
			}
	
		public void MouseEntered(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));

			}
		
		public void MouseExited(MouseEvent e) {
			panel.setBackground(new Color(47, 79, 79));

			}
		
		public void MousePressed(MouseEvent e) {
			panel.setBackground(new Color(60, 179, 113));

		}
		
		public void MouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));

		}
		
	}
}
