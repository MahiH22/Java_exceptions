public class TestCuentaExceptionChecked {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		//sin el try-catch no compila
		try {
			cuenta.deposita();//cuenta en deposita tiene "throws MiException"
		} catch (MiException e) {
			// checked
			e.printStackTrace();
			System.out.println("capturado 1");
		}
		Cuenta cuenta1 = null;
		try {
			cuenta1.deposita();//cuenta en deposita tiene "throws MiException"
		} catch (Exception e) {
			// checked
			e.printStackTrace();
			System.out.println("capturado 2");
		}
	}
}
