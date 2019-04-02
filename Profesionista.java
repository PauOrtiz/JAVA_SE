public class Profesionista extends Persona{
	private int experienciaProf;
	private String empresa;
	
	
    public void setExperiencia(int ex) {
    	this.experienciaProf=ex;
    }
    public int getExperiencia() {
    	return experienciaProf;
    }
    public void setEmpresa(String m) {
    	this.empresa=m;
    }
    public String getEmpresa() {
    	return empresa;
    }
    
	public static void main(String[] args) {
		Profesionista datosProfesionista=new Profesionista();
		datosProfesionista.setNombre("Paula Millán");
		datosProfesionista.setEstudios("Licenciatura en Ciencia de datos");
		datosProfesionista.setExperiencia(3);
		datosProfesionista.setEmpresa("Grupo Carso");
		System.out.println(datosProfesionista.getNombre());
		System.out.println(datosProfesionista.getEstudios());
		System.out.println(datosProfesionista.getExperiencia());
		System.out.println(datosProfesionista.getEmpresa());
	}

}
