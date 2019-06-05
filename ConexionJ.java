import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class Conexion {
	
	private static Connection conn=null;
    public Connection conexion() {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 conn=(Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registroveterinario?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Litoplas19");
			 if(conn!=null) {
			System.out.println("Conexión exitosa");
			 }
		}catch( ClassNotFoundException e) {
		System.out.println("Error del driver "+e.getMessage());	
		}catch (SQLException ex ) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode()+ ex.getMessage());
		} finally{
			return conn;
			}
    }
public static void main(String[] args) {
	Conexion c=new Conexion();
	c.conexion();
  }
}