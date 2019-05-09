package interfacesgraficas;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private static Connection con;
    private static final String sURL="jdbc:mysql://localhost:3306/plantilla_docente";
    private static final String usuario="root";
    private static final String password="Litoplas19";
     public  Conexion() {
    	 con=null;
    	 try {
    		 Class.forName(sURL);
    		 con= DriverManager.getConnection(sURL,usuario,password);
    		 if(con!=null) {
    			System.out.println("Conexión exitosa"); 
    		 }
    		 
    	 } catch(ClassNotFoundException |SQLException e) {
    	       System.out.println("Fallo en la conexión");
      }
    	
     }
     
     //retorna la conexión
     public Connection getConnection() {
          return con;
    }
    /* private void consulta() {
    	 
    	 Statement s=con.createStatement();
    	 String consulta="SELECT*FROM plantilla_docente";
     }*/
   
	public static void main(String[] args) {
		Conexion cc=new Conexion();
		cc.getConnection();

	}

}