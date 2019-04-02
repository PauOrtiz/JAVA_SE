public class Persona {
    protected int numAfiliacion,contacto;
    protected String nombre,apPaterno,apMaterno,gradoAcademico,especialidad,uniProcedencia;
    
    public void setAfiliacion(int numero) {
        this.numAfiliacion=numero;	
        }
    public int getAfiliacion() {
    	return numAfiliacion;
    }
    public void setContacto(int c) {
        this.contacto=c;
    }
    public int getContacto() {
    	return contacto;
    }
    
    public void setNombre(String n) {
        this.nombre=n;
    }
    public String getNombre() {
    	return nombre;
    }
    public void setPaterno(String p) {
        this.apPaterno=p;
    }
    public String getPaterno() {
    	return apPaterno;
    }
    public void setMaterno(String m) {
    	this.apMaterno=m;
    }
    public String getMaterno() {
    	return apMaterno;
    }
    
    public void setEstudios(String s) {
    	this.gradoAcademico=s;
    }
    public String getEstudios() {
    	return gradoAcademico;
    }
    public void setEspecialidad(String e) {
    	this.especialidad=e;
    }
    public String getEspecialidad() {
    	return especialidad;
    }
    public void setUniversidad(String u) {
    	this.uniProcedencia=u;
    }
    public String getUniversidad() {
    	return uniProcedencia;
    }
	public static void main(String[] args) {
		Persona nuevaP= new Persona();
        nuevaP.setAfiliacion(15699);
        nuevaP.setContacto(51217516);
        nuevaP.setNombre("Marina");
        nuevaP.setPaterno("Arezu");
        nuevaP.setMaterno("Tesla");
        nuevaP.setEstudios("Licenciatura en Sistemas computacionales");
        nuevaP.setEspecialidad("Sistemas expertos");
        nuevaP.setUniversidad("UNAM");
        System.out.println(nuevaP.getAfiliacion());
        System.out.println(nuevaP.getContacto());
        System.out.println(nuevaP.getNombre());
        System.out.println(nuevaP.getPaterno());
        System.out.println(nuevaP.getMaterno());
        System.out.println(nuevaP.getEstudios());
        System.out.println(nuevaP.getEspecialidad());
        System.out.println(nuevaP.getUniversidad());
	}

}
