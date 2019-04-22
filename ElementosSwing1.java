import javax.swing.*;
public class ElementosSwing { 

	public static void main(String[] args) {
		JFrame v=new JFrame("HappyPet 1.0"); 
		v.setSize(800,400);
		v.setResizable(false); 
		v.setLocationRelativeTo(null);
		v.setVisible(true);
		//agrega una etiqueta
		v.setLayout(null);
		JLabel etiqueta=new JLabel("Sistema de control veterinario v1.0");
		etiqueta.setBounds(250, 100, 300, 75); 
	    etiqueta.setHorizontalAlignment(JLabel.CENTER);
		v.add(etiqueta); 
	}
}