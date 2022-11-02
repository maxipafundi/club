package unlam.edu.pb2;

public class Corredor extends Socio implements Int_Pedestrismo{

	private Integer KmEntrenados;
	private Integer distanciaPreferida;
	
	public Corredor(String nombre, Integer numero_socio, Integer distanciaPreferida) {
		super(nombre, numero_socio);
		this.distanciaPreferida = distanciaPreferida;	}

	@Override
	public void setCantidadDeKmEntrenados(Integer kmEntrenados) {
		KmEntrenados = kmEntrenados;
		
	}


	@Override
	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}

	@Override
	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	@Override
	public Integer getCantidadDeKmEntrenados() {
		
		return this.KmEntrenados;
	}

	
	
	
	
}
