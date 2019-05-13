import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class HappyPettListener extends miListener implements ActionListener {
 
	//variables y contenedores
    private static  JLabel titulo,etiqueta,etiqueta1,etiqueta2,etiqueta3,etiqueta4, etiquetaImagen;
    private static JPanel panelIzquierdo,panelInferior,datos;
    private static JButton    botonIn1,botonIn2;
    private static ImageIcon img;
    private static JTextField textoCampo,textoCampo2,textoCampo3,textoCampo4,textoCampo5;
	
    public static void PanelIzquierdo(){ //Insertar imagen dentro del JPanel
        panelIzquierdo = new JPanel();
        etiquetaImagen=new JLabel(img);
        etiquetaImagen.setIcon(new ImageIcon(HappyPettListener.class.getResource("/interfacesgraficas/imagen/happy.jpg")));
        panelIzquierdo.add(etiquetaImagen);
       
    }
    public static void PanelCentral() {
    	 datos = new JPanel();
    	 etiqueta=new JLabel("Nombre de la mascota");
    	 etiqueta.setForeground(Color.white);
    	  datos.add(etiqueta);
    	 textoCampo=new JTextField(20);
    	 datos.add(textoCampo);
    	 etiqueta1=new JLabel("Nombre del dueño");
    	 etiqueta1.setForeground(Color.white);
    	 datos.add(etiqueta1);
    	 textoCampo2=new JTextField(20);
    	 datos.add(textoCampo2);
    	 etiqueta2=new JLabel("Apellido del dueño");
    	 etiqueta2.setForeground(Color.white);
    	 datos.add(etiqueta2);
    	 textoCampo3=new JTextField(20);
    	 datos.add(textoCampo3);
    	 etiqueta3=new JLabel("Teléfono");
    	 etiqueta3.setForeground(Color.white);
    	 datos.add(etiqueta3);
    	 textoCampo4=new JTextField(20);
    	 datos.add(textoCampo4);
    	 etiqueta4=new JLabel("Observaciones");
    	 etiqueta4.setForeground(Color.white);
    	 datos.add(etiqueta4);
    	 textoCampo5=new JTextField(20);
    	 datos.add(textoCampo5);
      	 datos.setLayout(new BoxLayout(datos,BoxLayout.Y_AXIS));
         datos.setBackground(Color.blue);
         
    }
    
    public static void PanelInferior(){
        panelInferior = new JPanel();
        botonIn1=new JButton("Guardar");
        ActionListener miListener=new HappyPettListener(); //se crea una clase aparte para el listener
        //agregar al-->http://www.edu4java.com/es/swing/swing4.html
        botonIn1.addActionListener(miListener);
        botonIn2=new JButton("Cancelar");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.setBackground(Color.black);
        panelInferior.add(botonIn1);
        panelInferior.add(botonIn2);
    }

    public static void Ventana(){
        JFrame frame = new JFrame();//estableces el manejador de diseño
        titulo = new JLabel("Centro Veterinario Happy Pet ");
        titulo.setForeground(Color.blue);
        Font aux=titulo.getFont();
        titulo.setFont(new Font(aux.getFontName(), aux.getStyle(), 45));//tamaño para la fuente del título
        frame.setLayout(new BorderLayout());
        //agregamos los paneles al frame principal
        frame.add(titulo,BorderLayout.NORTH);//centro veterinario
        frame.add(datos, BorderLayout.CENTER);//datos
        frame.add(panelIzquierdo,BorderLayout.WEST);//foto
        frame.add(panelInferior,BorderLayout.SOUTH);//footer
        //Configuramos el frame
        frame.pack();
        frame.setResizable(false); 
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
 static void main (String [] in){
        new HappyPettListener(); 
        PanelInferior();
        PanelIzquierdo();
        PanelCentral();
        Ventana();
    }
	
}