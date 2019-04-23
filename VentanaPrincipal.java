package interfacesgraficas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Color;
/**
 * Una clase que dibuja una ventana con un botón, el cual al ser presionado por el usuario
 * lanza una ventana secundaria del tipo JDialog modal
 * @version 1.0
 * @author CPE
 * */
/**clase VentanaPrincipal hereda de JFrame*/
public class VentanaPrincipal extends JFrame implements ActionListener{
	private JButton b;
	private JLabel etiqueta;
/**Inicialización de los componentes gráficos en constructor*/
	public VentanaPrincipal() {
		setLayout(null); /*Componentes en distribución personalizada*/
/**Etiqueta*/
		etiqueta = new JLabel("Registro veterinario Happy pet v1.0");
		etiqueta.setBounds(115,60,200,30);
		etiqueta.setHorizontalAlignment(JLabel.CENTER);
		add(etiqueta);
/**Botón*/	
		b = new JButton("Accede");
		b.setBounds(105,110,200,40);
		b.setBackground(Color.GREEN);
		add(b);
		b.addActionListener(this);     
	}
/**Listener*/
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			VentanaSecundaria s = new VentanaSecundaria(this,true);
			s.setVisible(true);
		}
	}
/**Método principal*/
	public static void main(String[] args) {
		VentanaPrincipal v=new VentanaPrincipal();
		v.setSize(400,300);
		v.setResizable(false); 
		v.setLocationRelativeTo(null);
		v.setVisible(true);
	}
}
