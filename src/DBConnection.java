import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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
import java.awt.SystemColor;

public class DBConnection {
	public Connection getConnection() {
		Connection con= null;
		System.out.println("Connection called");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
	     	con=DriverManager.getConnection("jdbc:mysql://localhost:3308/aerodrom","root","");
	     	
		}  catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
