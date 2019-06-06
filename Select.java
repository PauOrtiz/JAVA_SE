
import java.sql.*;

	public class Select extends Conexion{
	    public void selectQuery(){
	        try{
	            Statement consulta=conn.createStatement();
	           ResultSet s= consulta.executeQuery("SELECT*FROM datos");
	         while(s.next())  {
	             System.out.println("mascota="+s.getObject("nom_mascota"));
	         }conn.close();
	        }catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	    } 
	
		public static void main(String[] args) {
			Select b=new Select();
			b.conexion();
			b.selectQuery();   
		  }
		}