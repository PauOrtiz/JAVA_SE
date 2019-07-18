import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.BoxLayout;

public class Libro extends JPanel implements ActionListener{
 
private JButton b;
private JLabel text,lblLibreraPegaso; 
	
	public Libro() {
		setBackground(Color.MAGENTA);
		setForeground(Color.WHITE);
		setLayout(null);
		b=new JButton("Cupón de descuento");
		b.setBounds(94,137,200,30);
		b.addActionListener(this);
		add(b);
		text=new JLabel("Haz clic para obtenerlo");
		text.setBounds(94,114,301,24); //izquierda, alto respecto al borde inferior, ancho,alto(x,y,ancho,alto)
		text.setForeground(Color.white);
		text.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));		
		add(text);
	     lblLibreraPegaso = new JLabel("LIBRER\u00CDA PEGASO");
		lblLibreraPegaso.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLibreraPegaso.setForeground(Color.BLACK);
		lblLibreraPegaso.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 16));
		add(lblLibreraPegaso);

	}

}
