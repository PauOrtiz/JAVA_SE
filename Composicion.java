package geometría; //utilizo los métodos de dos clases diferentes en una nueva clase

public class Composicion {

	public static void main(String[] args) {
		AreaCirculoMetodoInstancia nuevoCirculo= new AreaCirculoMetodoInstancia();
		PoligonoRegular  nuevoPoligono=new PoligonoRegular(123.4, 789.8);
		nuevoCirculo.setRadio(184.69);
		//nuevoCirculo.NuevoCalculo();
        //nuevoPoligono.areaPoligono();
        System.out.println(nuevoCirculo.NuevoCalculo());
        System.out.println(nuevoPoligono.areaPoligono());
	}

}
