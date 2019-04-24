package colecciones; //https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/La_clase_ArrayList

public class ArrList {
    private String id, mascota,nomDueño,apDueño;
 //Inicialización
     public ArrList() {
	  id="";
	  mascota="";
	  nomDueño="";
	  apDueño="";
  }
 //setters
     public void setIdentificador(String id) {
	  this.id=id;
     }
     public void setNombreMascota(String mascota) {
	  this.mascota=mascota;
     }
     public void setNombreDueño(String nomDueño) {
	  this.nomDueño=nomDueño;
     }
     public void setApDueño(String apDueño) {
	  this.apDueño=apDueño;
    }
 //Getters
    public String getIdentificador() {
	 return this.id;
    }
 
 //Aparte el Scanner
 
 //Recorrido del arrayList
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}