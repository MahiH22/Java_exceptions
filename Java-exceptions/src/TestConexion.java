public class TestConexion {
	public static void main(String[] args) throws Exception {
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch(IllegalStateException ex) {
			ex.printStackTrace();
		}
		
		/*
		Conexion con = new Conexion();
		try {
			con.leerDatos();
		}catch(IllegalStateException ex) {
			ex.printStackTrace();
		}finally{
			con.cerrar();
		}
		*/
		
		/*
		 Conexion = null;
		 try{
		 	con = new Conexion();
		 	con.leerDatos();
		 }catch(IllegalStateException ex){
		 	ex.printStackTrace();
		 }finally{
		 	System.out.println("Ejecutando finally");
		 	if(con != null){
		 		con.cerrar();
		 	}
		 }
		 */
	}
}
