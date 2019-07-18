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
 private JLabel text;
	
	public Libro() {
		setBackground(Color.MAGENTA);
		setForeground(Color.BLACK);
		setLayout(null);
		b=new JButton("Ingresar");
		b.setBounds(100,150,100,30);
		b.addActionListener(this);
		add(b);
		JLabel lblLibreraPegaso = new JLabel("LIBRER\u00CDA PEGASO");
		lblLibreraPegaso.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLibreraPegaso.setForeground(Color.BLACK);
		lblLibreraPegaso.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 16));
		add(lblLibreraPegaso);

	}

}
