package unlam.edu.pb2;

public class NoEstaPreparado extends Exception {

	private String mensaje = "El deportista no esta preparado";
	 public NoEstaPreparado(String mensaje) {
	      super(mensaje);
	    }

}
