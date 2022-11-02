package unlam.edu.pb2;

import java.util.HashMap;

public class Evento {

	private String nombreEvento;
	private TipoDeEvento tipoEvento;
	private HashMap <Integer , Socio> participantes;
	private Integer numeroDeInscripcion;
	
	public Evento(String nombreEvento, TipoDeEvento tipoEvento) {
		
		this.nombreEvento = nombreEvento;
		this.tipoEvento = tipoEvento;
	}

	public String getNombreEvento() {
		return nombreEvento;
	}

	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}

	public TipoDeEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoDeEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public HashMap<Integer, Socio> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(HashMap<Integer, Socio> participantes) {
		this.participantes = participantes;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}
	
	
	
	
	
	
}
