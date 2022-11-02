package unlam.edu.pb2;

public class Ciclista extends Socio implements Int_Ciclismo {

	
	private TipoDeBicicleta tipoDeBicicleta;
	
	
	public Ciclista(String nombre, Integer numero_socio , TipoDeBicicleta tipoDeBicileta) {
		super(nombre, numero_socio);
		
		this.tipoDeBicicleta = tipoDeBicileta;
		
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	@Override
	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}
	
	

	

}
