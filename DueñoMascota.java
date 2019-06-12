package modelo;

public class DueñoMascota { 
	private int id_datos,tel;
    private String nom_dueño,ap_dueño,nom_mascota,observaciones;

    public int getId() {
        return id_datos;
    }

    public void setId(int id_datos) {
        this.id_datos = id_datos;
    }

    public String getNomDueño() {
        return nom_dueño;
    }

    public void setNomDueño(String nom_dueño) {
        this.nom_dueño = nom_dueño;
    }

    public String getApDueño() {
        return ap_dueño;
    }
    public void setApDueño(String ap_dueño) {
        this.ap_dueño = ap_dueño;
    }
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }
   
    public String getNomMascota() {
        return nom_mascota;
    }
    public void setNomMascota(String nom_mascota) {
        this.nom_mascota = nom_mascota;
    }
    
    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }  
}
