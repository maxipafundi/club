package unlam.edu.pb2;

public class Triatleta extends Socio implements Int_Ciclismo , Int_Natacion , Int_Pedestrismo {

	private TipoDeBicicleta tipoDeBicicleta;
	private Integer distanciaPreferida;
	private Integer KmEntrenados;
	
	public Triatleta(String nombre, Integer numero_socio, Integer distanciaPreferida, TipoDeBicicleta tipoDeBicicleta) {
		super(nombre, numero_socio);
		this.distanciaPreferida = distanciaPreferida;
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public void setCantidadDeKmEntrenados(Integer kmEntrenados) {
		KmEntrenados = kmEntrenados;
		
	}

	@Override
	public Integer getCantidadDeKmEntrenados() {
		return this.KmEntrenados;
	}

	@Override
	public Integer getDistanciaPreferida() {
		
		return this.distanciaPreferida;
	}

	@Override
	public String getEstilo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoDeBicicleta getTipoDeBicicleta() {
		// TODO Auto-generated method stub
		return this.tipoDeBicicleta;
	}

	@Override
	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
		
	}

	
	
	
}
