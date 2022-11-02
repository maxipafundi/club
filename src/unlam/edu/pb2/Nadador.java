package unlam.edu.pb2;

public class Nadador extends Socio implements Int_Natacion{

	private String estilo;
	
	public Nadador(String nombre, Integer numero_socio, String estilo) {
		super(nombre, numero_socio);
		this.estilo = estilo;
	}

	@Override
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	

	
	
}
