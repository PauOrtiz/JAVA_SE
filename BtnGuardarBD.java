
import java.sql.Connection;
import java.sql.PreparedStatement; 
import javax.swing.JOptionPane;
import java.sql.*;

public class BtnGuardarBD extends Conexion {

	public void queryInsert() {
		try {
		Statement consulta=conn.createStatement();
		consulta.executeUpdate("INSERT INTO datos(id_datos,nom_dueño,ap_dueño,tel,nom_mascota,observaciones)"+ "VALUES(101,'Alfredo','Mora',52344344,'Oscarín','Problemas de piel')");
	    conn.close();
		}catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	}
	
	public static void main(String[] args) {
		BtnGuardarBD b=new BtnGuardarBD();
		b.conexion();
		b.queryInsert();
        
	}

}
