
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Layout3en1 {
    //variables y comtenedores
    private JLabel titulo, etiqueta,etiqueta1,etiqueta2,etiqueta3,etiquetaImagen;
    private JPanel panelIzquierdo, panelDerecho, panelInferior,panelCentral;
   // private JButton botonIz1, botonIz2, botonIz3;
   // private JButton botonDe1, botonDe2, botonDe3;
    private JButton    botonIn1, botonIn2;
    private JPanel datos;
    private ImageIcon img;
    private JTextField textoCampo,textoCampo2,textoCampo3,textoCampo4;

    public void contruyePanelIzquierdo(){ //Insertar imagen dentro del JPanel
        panelIzquierdo = new JPanel();
        JLabel etiquetaImagen=new JLabel(img);
        etiquetaImagen.setIcon(new ImageIcon(Layout3en1.class.getResource("/interfacesgraficas/imagen/Michelle.jpg")));
        panelIzquierdo.add(etiquetaImagen);  
    }
    public void construyePanelCentral() {
    	 datos = new JPanel();
    	 etiqueta=new JLabel("Nombre de la mascota");
    	 datos.add(etiqueta);
    	 textoCampo=new JTextField("Nombre",50);
    	 datos.add(textoCampo);
    	 etiqueta1=new JLabel("Nombre del dueño");
    	 datos.add(etiqueta1);
    	 textoCampo2=new JTextField("Nombre1",50);
    	 datos.add(textoCampo2);
    	 etiqueta2=new JLabel("Apellido del dueño");
    	 datos.add(etiqueta2);
    	 textoCampo3=new JTextField("Apellido",50);
    	 datos.add(textoCampo3);
    	 etiqueta3=new JLabel("Correo electrónico");
    	 datos.add(etiqueta3);
    	 textoCampo4=new JTextField("Mail",50);
    	 datos.add(textoCampo4);
    	 //lograr que el campo de texto aparezca al lado de label
    	
    	 datos.setLayout(new BoxLayout(datos,BoxLayout.Y_AXIS));
         datos.setBackground(Color.blue);
         
    }
    
    public void contruyePanelInferior(){
        panelInferior = new JPanel();
        botonIn1=new JButton("Guardar");
        botonIn2=new JButton("Cancelar");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.setBackground(Color.black);
        panelInferior.add(botonIn1);
        panelInferior.add(botonIn2);
    }

    public void contruyeVentana(){
        JFrame frame = new JFrame();//estableces el manejador de diseño
        titulo = new JLabel("Centro Veterinario Happy Pet ");
        Font aux=titulo.getFont();
        titulo.setFont(new Font(aux.getFontName(), aux.getStyle(), 20));
        frame.setLayout(new BorderLayout());
     
        //agregamos los paneles al frame principal
        frame.add(titulo,BorderLayout.NORTH);//centro veterinario
        frame.add(datos, BorderLayout.CENTER);//datos
        frame.add(panelIzquierdo,BorderLayout.WEST);//foto
        //frame.add(panelDerecho,BorderLayout.EAST);//se anula
        frame.add(panelInferior,BorderLayout.SOUTH);//footer
        //Configuramos el frame
        frame.pack();
        frame.setVisible(true);
        frame.setSize(400,300);
		//frame.setResizable(false); 
		frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

    public Layout3en1(){
        contruyePanelInferior();
        contruyePanelIzquierdo();
       
        construyePanelCentral();
       
        contruyeVentana();
    }

    public static void main (String [] inforux){
        new Layout3en1();
       
    }
}


