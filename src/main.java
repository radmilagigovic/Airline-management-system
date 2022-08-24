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

public class main extends JFrame {

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
					main frame = new main();
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
	public main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(470, 200, 240, 270);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 51, 102));
		contentPane.setBorder(new LineBorder(new Color(12,45,28)));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBorder(new LineBorder(new Color(102, 51, 102)));
		panelMenu.setBackground(new Color(102, 51, 102));
		panelMenu.setBounds(0, 0, 246, 300);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		//KLIK NA LETOVE
	
		paneLetovi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paneLetovi.setBackground(new Color(1,50,32));
				admin_prijava.main(new String[]{});
			}
			
		});
		paneLetovi.setBackground(new Color(102, 51, 102));
		paneLetovi.setBounds(39, 139, 168, 43);
		panelMenu.add(paneLetovi);
		paneLetovi.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ADMIN");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(41,11, 80, 30);
		paneLetovi.add(lblNewLabel_1);
		
		JLabel img_putnici = new JLabel("");
		img_putnici.setBounds(29, 86, 46, 19);
		paneLetovi.add(img_putnici);
		img_putnici.setIcon(new ImageIcon(img_p));
		
		
		//KLIK NA PUTNIKE
		
		panePutnici.setBackground(new Color(102, 51, 102));
		panePutnici.setBounds(39, 199, 168, 43);
		panelMenu.add(panePutnici);
		
		panePutnici.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panePutnici.setBackground(new Color(1,50,32));
				prijavaZaposleni.main(new String[]{});
			}
			
		});
		panePutnici.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("ZAPOSLENI");
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(45, 0, 113, 41);
		panePutnici.add(lblNewLabel_2);
		
		JLabel img_let = new JLabel("");
		img_let.setBounds(35, 80, 49, 25);
		panePutnici.add(img_let);
		img_let.setIcon(new ImageIcon(img_l));
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(10, 0, 253, 116);
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
