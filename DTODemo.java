public class DTODemo {
	public static void main(String[] args) {
		//objeto business object
		ClienteBO clienteBusinessObject = new ClienteBO();
		
		//obtiene todos los clientes
		clienteBusinessObject.obtenerClientes().forEach(System.out::println);
		
		// actualiza un cliente
		System.out.println("****");
		ClienteVO cliente = clienteBusinessObject.obtenerCliente(0);
		cliente.setNombre("Luis");
		clienteBusinessObject.actualizarCliente(cliente);
		
		// obtiene un cliente
		System.out.println("****");
		cliente=clienteBusinessObject.obtenerCliente(0);
		System.out.println(cliente);
		
		//elimina un cliente
		System.out.println("****");
		cliente=clienteBusinessObject.obtenerCliente(0);
		clienteBusinessObject.eliminarCliente(cliente);		
	}
}