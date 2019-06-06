package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Conexion;
import modelo.ConsultasDueñoMascota;
import modelo.DueñoMascota;

public class ConsultasDueñoMascota extends Conexion {

    public boolean registrar(DueñoMascota pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO datos (id_datos, nom_dueño, ap_dueño , tel,nom_mascota,observaciones) VALUES(?,?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId()); //NÚMERe almacena
            ps.setString(2, pro.getNom_dueño());
            ps.setString(3, pro.getAp_dueño());
            ps.setInt(4, pro.getTel());
            ps.setString(5, pro.getNom_mascota());
            ps.setString(6, pro.getObservaciones());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean modificar(DueñoMascota pro) { //hay que modificarlo por tus campos de tu bd
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "UPDATE producto SET id_datos=?, nom_dueño=?, ap_dueño=?, tel=?,nom_mascota=?,observaciones=? WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId()); //NÚMERe almacena
            ps.setString(2, pro.getNom_dueño());
            ps.setString(3, pro.getAp_dueño());
            ps.setInt(4, pro.getTel());
            ps.setString(5, pro.getNom_mascota());
            ps.setString(6, pro.getObservaciones());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(DueñoMascota pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "DELETE FROM datos WHERE id=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean buscar(DueñoMascota pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM producto WHERE id_datos=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               pro.setId( Integer.parseInt(rs.getString("id_datos")));
               pro.setNom_mascota(rs.getString("nom_mascota"));
               pro.setNom_dueño(rs.getString("nom_dueño"));
               pro.setAp_dueño(rs.getString("ap_dueño"));
               pro.setTel(Integer.parseInt(rs.getString("tel")));
               pro.setObservaciones(rs.getString("observaciones"));
               return true;
            }
            return false; //si no encuentra un resultado
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}

