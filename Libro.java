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
private JPanel p;	
	public Libro() {
		setBackground(Color.MAGENTA);
		setForeground(Color.WHITE);
		setLayout(null);
		b=new JButton("Cupón de descuento");
		Libro elListener=new Libro();
		b.addActionListener(elListener);
		b.setBounds(94,137,200,30);
		add(b);
		text=new JLabel("Haz clic para obtenerlo");
		text.setBounds(94,114,301,24); //izquierda, alto respecto al borde inferior, ancho,alto(x,y,ancho,alto)
		text.setForeground(Color.white);
		text.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));		
		add(text);
		b.addActionListener(null);
	     lblLibreraPegaso = new JLabel("LIBRERÍA PEGASO");
	     lblLibreraPegaso.setBounds(94,37,300,30);
		lblLibreraPegaso.setVerticalAlignment(SwingConstants.BOTTOM);
		lblLibreraPegaso.setFont(new Font("Verdana", Font.BOLD, 21));
		add(lblLibreraPegaso);
		p=new JPanel();
		 p.setBounds(500,500,500,500);
    	 p.setVisible(true);
		 add(p);
		 JLabel lblNewLabel = new JLabel("New label");
    	 Image img=new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg").getImage();
    	 ImageIcon img2= new ImageIcon(img.getScaledInstance(78, 130, Image.SCALE_SMOOTH));
    	 //lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Lighthouse.jpg"));
    	 //lblNewLabel.setBounds(26, 178, 343, 78);
		 lblNewLabel.setIcon(img2);
		 this.repaint();
    	 add(lblNewLabel);
	}
     
    	 public void actionPerformed(ActionEvent e) {
    			if (e.getSource() == b) {
    				System.out.println("En breve será redireccionado");
    			}
    	public static void main (String [] args){
    			new Libro();     
    			    
    			}			    
       }
}