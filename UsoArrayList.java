package colecciones;

import java.util.*;
public class UsoArrayList {
	
		private static String id;
		private static String nomMascota;
		private static String nomDueño;
		private static String apPaternoDueño;
		private static String dueñoMail;
		ArrayList<String> Mascotas = new ArrayList();
		
	
		
		public UsoArrayList(String id, String nomMascota, String nomDueño, String apPaternoDueño, String dueñoMail){
			//inicializamos variables
			id = "";
			nomMascota="";
			nomDueño="";
			apPaternoDueño="";
			dueñoMail="";
		}
		public void setId(String id){
			UsoArrayList.id = id;
		}
		public void setMascota(String nomMascota){
			UsoArrayList.nomMascota = nomMascota;
		}
		public void setDueño(String nomDueño){
			UsoArrayList.nomDueño = nomDueño;
		}
		public void setDueñoApellido(String apPaternoDueño){
			UsoArrayList.apPaternoDueño = apPaternoDueño;
		}
		public void setMail(String dueñoMail){
			UsoArrayList.dueñoMail = dueñoMail;
		}
		
		public String getId(){
			return UsoArrayList.id;
		}
		public String getMascota(){
			return UsoArrayList.nomMascota;
		}
		public String getDueño(){
			return UsoArrayList.nomDueño;
		}
		public String getDueñoApellido(){
			return UsoArrayList.apPaternoDueño;
		}
		public String getDueñoMail(){
			return UsoArrayList.dueñoMail;
		}
		
		private void insertar() {
			//int mascotas=2;
			for(int i=0;i<=1;i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Id del chip de la mascota ");
			String id=scanner.nextLine();
			Mascotas.add(id);
			System.out.println("Nombre de la mascota: ");
			String nomMascota= scanner.nextLine();
			Mascotas.add(nomMascota);
			System.out.println("Nombre del dueño");
			String nomDueño=scanner.nextLine();
			Mascotas.add(nomDueño);
			System.out.println("Apellido del dueño");
			String apPaternoDueño=scanner.nextLine();
			Mascotas.add(apPaternoDueño);
			System.out.println("Contacto");
			String dueñoMail=scanner.nextLine();
			Mascotas.add(dueñoMail);
			
			
			
		     System.out.println("Agregados hasta el momento:"+Mascotas);
		     
			}
		}
		private void recorrer() {
			System.out.println("Los elementos del arrayList son:");
			
			for(int j=0; j< Mascotas.size(); j++) {
				
				
				System.out.println(Mascotas.get(j));
			}
		}
		
		
	public static void main(String[] args) {
		UsoArrayList m=new UsoArrayList(id,nomMascota,nomDueño,apPaternoDueño,dueñoMail);
		m.insertar();
		m.recorrer();
	}
}
