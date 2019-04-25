import java.util.Scanner;
import java.util.ArrayList;
public class AList {
		private String id,nomMascota,nomDueño,apPaternoDueño,dueñoMail;
		public AList(){
			id = "";
			nomMascota="";
			nomDueño="";
			apPaternoDueño="";
			dueñoMail="";
		}
		public void setId(String id){
			this.id = id;
		}
		public void setMascota(String nomMascota){
			this.nomMascota = nomMascota;
		}
		public void setDueño(String nomDueño){
			this.nomDueño = nomDueño;
		}
		public void setDueñoApellido(String apPaternoDueño){
			this.apPaternoDueño = apPaternoDueño;
		}
		public void setMail(String dueñoMail){
			this.dueñoMail = dueñoMail;
		}
		
		public String getId(){
			return this.id;
		}
		public String getMascota(){
			return this.nomMascota;
		}
		public String getDueño(){
			return this.nomDueño;
		}
		public String getDueñoApellido(){
			return this.apPaternoDueño;
		}
		public String getDueñoMail(){
			return this.dueñoMail;
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList Mascotas = new ArrayList();	
		int mascotas = 3;		
		System.out.println("*******Registro Happy Pet v1.0*******");
		for(int i = 0;i < mascotas;i++){
			AList miMascota = new AList();
			System.out.println("Id del chip de la mascota "+"["+i+"]");
			miMascota.setId(scanner.nextLine());
			System.out.println("Nombre de la mascota: "+"["+i+"]");
			miMascota.setMascota(scanner.nextLine());
			System.out.println("Nombre del dueño "+"["+i+"]");
			miMascota.setDueño(scanner.nextLine());
			System.out.println("Apellido del dueño "+"["+i+"]");
			miMascota.setDueñoApellido(scanner.nextLine());
			System.out.println("Contacto "+"["+i+"]");
			miMascota.setMail(scanner.nextLine());
			Mascotas.add(miMascota);		
			System.out.println("**************");
		}
			
		for(int j = 0;j < Mascotas.size();j++){
			AList miMascota = (AList)Mascotas.get(j);
			System.out.println("Id: "+miMascota.getId());
			System.out.println("Nombre de la mascota: "+miMascota.getMascota());
			System.out.println("Nombre del dueño: "+miMascota.getDueño());
			System.out.println("Apellido del dueño: "+miMascota.getDueñoApellido());
			System.out.println("Correo electrónico: "+miMascota.getDueñoMail());		
		}
	}
}
