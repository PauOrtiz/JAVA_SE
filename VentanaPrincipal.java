package interfacesgraficas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener{
  
private JButton b;
private JLabel etiqueta;
    
	
	public VentanaPrincipal() {
		setLayout(null);
		etiqueta = new JLabel("Registro veterinario Happy pet v1.0");
		etiqueta.setBounds(115,60,200,30);
		add(etiqueta);
		b = new JButton("Accede");
		b.setBounds(105,110,200,40);
		add(b);
		b.addActionListener(this);   
	}
    
 public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			VentanaSecundaria s = new VentanaSecundaria(this,true);
			s.setVisible(true);
		}
	}

	public static void main(String[] args) {
		VentanaPrincipal v=new VentanaPrincipal();
		v.setBounds(10,10,410,210);
		v.setVisible(true);
	}
}