package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
            ps.setString(2, pro.getNomDueño());
            ps.setString(3, pro.getApDueño());
            ps.setInt(4, pro.getTel());
            ps.setString(5, pro.getNomMascota());
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

      
        String sql = "UPDATE datos SET  nom_dueño=?, ap_dueño=?, tel=?,nom_mascota=?,observaciones=? WHERE id_datos=? ";

        try {
            ps = con.prepareStatement(sql);
           // ps.setInt(1, pro.getId()); //NÚMERe almacena
            ps.setString(1, pro.getNomDueño());
            ps.setString(2, pro.getApDueño());
            ps.setInt(3, pro.getTel());
            ps.setString(4, pro.getNomMascota());
            ps.setString(5, pro.getObservaciones());
            ps.setInt(6, pro.getId());
            ps.execute();
            ps.close();
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

        String sql = "DELETE FROM datos WHERE id_datos=? ";

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
    //hay que evaluar éste
    public boolean buscar(DueñoMascota pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM datos WHERE id_datos=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pro.getId());
            rs = ps.executeQuery();
            
            if(rs.next())
            {
               pro.setId( Integer.parseInt(rs.getString("id_datos")));
               pro.setNomMascota(rs.getString("nom_mascota"));
               pro.setNomDueño(rs.getString("nom_dueño"));
               pro.setApDueño(rs.getString("ap_dueño"));
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

