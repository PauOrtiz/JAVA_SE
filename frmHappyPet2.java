package vista;


import vista.frmHappyPet2;
import java.awt.BorderLayout;
import java.awt.Color;
//import controlador.CtlrDueñoMascota; 
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class frmHappyPet2 extends  javax.swing.JFrame {
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		//variables y contenedores
	    public JLabel titulo,etiqueta0, etiqueta,etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiquetaImagen;
	    private JPanel panelIzquierdo, panelInferior,datos;
	   public JButton    botonIn1, botonIn2,botonIn3,botonIn4,botonIn5;
	    private ImageIcon img;
	   public JTextField textoCampo0,textoCampo,textoCampo2,textoCampo3,textoCampo4,textoCampo5;
	   

	   
	    public void PanelIzquierdo(){ //Insertar imagen dentro del JPanel
	        panelIzquierdo = new JPanel();
	        panelIzquierdo.setBackground(new Color(0, 255, 255));
	        etiquetaImagen=new JLabel(img);
	        etiquetaImagen.setIcon(new ImageIcon(frmHappyPet2.class.getResource("/vista/imagen/happy.jpg")));
	        panelIzquierdo.add(etiquetaImagen);
	       
	    }
	    public void PanelCentral() {
	    	 datos = new JPanel();
	    	 etiqueta0=new JLabel("Id");
	    	 etiqueta0.setForeground(Color.white);
	    	  datos.add(etiqueta0);
	    	  textoCampo0=new JTextField(20);
		    	 datos.add(textoCampo0);
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
	    
	    public void PanelInferior(){
	        panelInferior = new JPanel();
	        botonIn1=new JButton("Guardar");
	        //CtlrDueñoMascota m=new CtlrDueñoMascota();
	        botonIn3=new JButton("Modificar");
	        
	        botonIn4=new JButton("Eliminar");
	        botonIn2=new JButton("Cancelar");
	        botonIn5= new JButton("Buscar");
	        panelInferior.setLayout(new FlowLayout());
	        panelInferior.setBackground(Color.black);
	        panelInferior.add(botonIn1);
	        panelInferior.add(botonIn3);
	        panelInferior.add(botonIn4);
	        panelInferior.add(botonIn2);
	        panelInferior.add(botonIn5);
	    }

	    public void Ventana(){
	        JFrame frame = new JFrame();//estableces el manejador de diseño
	        titulo = new JLabel("Centro Veterinario Happy Pet ");
	        titulo.setForeground(Color.blue);
	        Font aux=titulo.getFont();
	        titulo.setFont(new Font(aux.getFontName(), aux.getStyle(), 45));//tamaño para la fuente del título
	        frame.getContentPane().setLayout(new BorderLayout());
	        //agregamos los paneles al frame principal
	        frame.getContentPane().add(titulo,BorderLayout.NORTH);//centro veterinario
	        frame.getContentPane().add(datos, BorderLayout.CENTER);//datos
	        frame.getContentPane().add(panelIzquierdo,BorderLayout.WEST);//foto
	        frame.getContentPane().add(panelInferior,BorderLayout.SOUTH);//footer
	        //Configuramos el frame
	        frame.pack();
	        frame.setResizable(false); 
			frame.setLocationRelativeTo(null);
	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }

	    public frmHappyPet2(){
	    	 
	        PanelInferior();
	        PanelIzquierdo();
	        PanelCentral();
	        Ventana();
	        initComponents();
	    }
	    private void initComponents() {
	        etiqueta0.setText("Id");
	        etiqueta.setText("Nombre de la mascota");
	       etiqueta1.setText("Nombre del dueño");
	       etiqueta2.setText("Apellido del dueño");
	       etiqueta3.setText("Telefono");
	       etiqueta4.setText("Observaciones");
	        botonIn1.setText("Guardar");
	        botonIn3.setText("Modificar");
	        botonIn4.setText("Eliminar");
	        botonIn2.setText("Cancelar");
	        botonIn5.setText("Buscar");
	 } 

	    public static void main (String [] in){
	    	
	        new frmHappyPet2();      
	    }
	}



