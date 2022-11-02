package unlam.edu.pb2;

public class Socio {
	
	private String nombre;
	private Integer numero_socio;
	
	
	public Socio(String nombre, Integer numero_socio) {
		
		this.nombre = nombre;
		this.numero_socio = numero_socio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getNumero_socio() {
		return numero_socio;
	}


	public void setNumero_socio(Integer numero_socio) {
		this.numero_socio = numero_socio;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero_socio == null) ? 0 : numero_socio.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Socio other = (Socio) obj;
		if (numero_socio == null) {
			if (other.numero_socio != null)
				return false;
		} else if (!numero_socio.equals(other.numero_socio))
			return false;
		return true;
	}
	
	
	
	
	
	

}
