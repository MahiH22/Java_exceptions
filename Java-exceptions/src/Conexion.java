public class Conexion implements AutoCloseable{
	public Conexion() {
		
	}
	public void leerDatos() {
		System.out.println("Leer datos");
		throw new IllegalStateException();	
		}
	public void cerrar() {
		System.out.println("Cerrando conexion");
	}
	@Override
	public void close() throws Exception {
		this.cerrar();
	}
}
