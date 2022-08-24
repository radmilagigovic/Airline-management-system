import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Color;
import javax.swing.JTable;
import java.awt.EventQueue;
import java.awt.Font;
//import java.awt.Image;

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




public class Generate_PDF {

	public static void main(String[] args) {
		
		try {
			
		String file_name= "C:\\Users\\giga_\\eclipse-workspace_new\\Diplomski_rad\\generate_pdf\\test3.pdf";
		Rectangle pageSize = new Rectangle(800, 300); 
		pageSize.setBackgroundColor(BaseColor.WHITE);
		Document document= new Document(pageSize);
        PdfWriter.getInstance(document, new FileOutputStream(file_name));
        
        
        document.open();
        
    
        document.add(new Paragraph("                                                                                       ELEKTRONSKA KARTA"));
        
        document.add(new Paragraph(" "));

        document.add(new Paragraph(" "));
        document.add(new Paragraph(" MESTO                    MESTO                        DATUM                     VREME                   VREME                  CENA                  BROJ"));
        document.add(new Paragraph("POLASKA                DOLASKA                  POLETANJA              POLETANJA           SLETANJA                                       PASOSA "));
        document.add(new Paragraph(" "));
        document.add(new Paragraph(" "));

      //KONEKCIJA SA BAZOM
      DBConnection objc= new DBConnection();
        Connection con = objc.getConnection();
        PreparedStatement s= null;
        ResultSet rs= null;
		String query = "SELECT mesto_polaska, mesto_dolaska, datum_p, vreme_polaska, vreme_dolaska, cena FROM karta";
        s=(PreparedStatement) con.prepareStatement (query);
        rs=s.executeQuery();
        
        while (rs.next()) {
        	Paragraph para= new Paragraph(rs.getString("mesto_polaska") + "                  " +rs.getString("mesto_dolaska") + "                  " +rs.getString("datum_p")
        	+ "                  " +	rs.getString("vreme_polaska") + "                  " +rs.getString("vreme_dolaska") + "                   " +rs.getString("cena"));
        
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
        
      
        
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
