public class Flujo2 {
	public static void main(String[] args) {
		System.out.println("Inicio de main");
		metodo1();
		System.out.println("Fin de main");
		
	}
	private static void metodo1() {
		System.out.println("Inicio de metodo1");
		try{
			metodo2();	
		}catch(MiRTExcepcion exepcion){
			System.out.println("Si");
		}
		System.out.println("Fin de metodo1");
	}
	private static void metodo2() {
		System.out.println("Inicio de metodo2");
		System.out.println("Fin de metodo2");
		/*
		ArithmeticException ae = new ArithmeticException();
		throw ae;
		*/
		//throw new ArithmeticException();
		throw new MiRTExcepcion("No");
	}
	private static void diesEntre(int numero) {
		try {
			System.out.println();
			System.out.println(10/numero);//error causado x/0
		}catch(ArithmeticException | NullPointerException exception){
			imprimeMensajeError(exception);
		}
	}
	private static void imprimeMensaje(String mensaje) {
		try {
			System.out.println(mensaje.toString());
			System.out.println("El mensajes es: "+mensaje);
		}catch(ArithmeticException | NullPointerException exception){
			imprimeMensajeError(exception);
		}
	}
	private static void imprimeMensajeError(Exception error){
		String msg = error.getMessage();
        System.out.println("Error es: " + msg);
	}
	/*
	try {
		System.out.println(i);
		System.out.println(i/0);	
	}catch(ArithmeticException exception){
		System.out.println(exception.getMessage());
		exception.getStackTrace();
	}catch(NullPointerException exception){
		System.out.println(exception.getMessage());
		exception.getStackTrace();
	}
	*/
	/*
	NullPointer Exception
	CuentaCorriente cuenta = null;
	cuenta.depositar(500);
	*/
	
	/*
	ArithmeticException
	int num1;
	num1=0;
	int resultado = 30/num1;	
	System.out.println(resultado);
	*/
}