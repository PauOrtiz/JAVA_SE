import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class  VentanaSecundaria extends JDialog implements ActionListener{
	private JButton b1;
	private JLabel etiqueta1;
    
	public VentanaSecundaria(VentanaPrincipal ventanaPrincipal, boolean modal) {
		super(ventanaPrincipal, modal);
		setLayout(null);
		setBounds(440,10,410,210);
		etiqueta1 = new JLabel("Adquiera su licencia");
		etiqueta1.setBounds(115,60,200,30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		add(etiqueta1);
		b1 = new JButton("Volver");
		b1.setBounds(105,110,200,40);
		add(b1);
		b1.addActionListener(this);    
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			setVisible(false);
		}
	}
    
}