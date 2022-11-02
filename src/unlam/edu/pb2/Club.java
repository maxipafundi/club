package unlam.edu.pb2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Club {

	private String nombre;
	private HashSet <Socio> socios;
	private Map<Evento, Socio> competencias = new HashMap<>();
	
	
	public Club(String nombre) {
		
		this.nombre = nombre;
		this.socios = new HashSet<>();
	}


	public void agregarDeportista (Socio socio) {
		this.socios.add(socio);
	}
	
	
	public Integer getCantidadDeSocios() {
		return this.socios.size();
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public HashSet<Socio> getSocios() {
		return socios;
	}


	public void setSocios(HashSet<Socio> socios) {
		this.socios = socios;
	}

	
	
	

	public void inscribirEnEvento(Evento eventoAInscribir, Socio socioAInscribir) throws NoEstaPreparado {
		
		
		switch(eventoAInscribir.getTipoEvento()) {
		
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
			if(socioAInscribir instanceof Int_Natacion) {
				this.competencias.put(eventoAInscribir, socioAInscribir);
			}
			else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
		case CARRERA_NATACION_EN_PICINA:

	    	if(socioAInscribir instanceof Int_Natacion) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case CARRERA_5K:

	    	if(socioAInscribir instanceof Int_Pedestrismo) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case CARRERA_10K:

	    	if(socioAInscribir instanceof Int_Pedestrismo) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case CARRERA_21K:

	    	if(socioAInscribir instanceof Int_Pedestrismo) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case CARRERA_42K:

	    	if(socioAInscribir instanceof Int_Pedestrismo) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case DUATLON:

	    	if(socioAInscribir instanceof Int_Pedestrismo && socioAInscribir instanceof Int_Ciclismo ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case TRIATLON_SHORT:

	    	if(socioAInscribir instanceof Int_Pedestrismo && socioAInscribir instanceof Int_Ciclismo && socioAInscribir instanceof Int_Natacion ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case TRIATLON_OLIMPICO:

	    	if(socioAInscribir instanceof Int_Pedestrismo && socioAInscribir instanceof Int_Ciclismo && socioAInscribir instanceof Int_Natacion ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case TRIATLON_MEDIO:

	    	if(socioAInscribir instanceof Int_Pedestrismo && socioAInscribir instanceof Int_Ciclismo && socioAInscribir instanceof Int_Natacion ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
			break;
			
	    case TRIATLON_IRONMAN:

	    	if(socioAInscribir instanceof Int_Pedestrismo && socioAInscribir instanceof Int_Ciclismo && socioAInscribir instanceof Int_Natacion ) {
	    		competencias.put(eventoAInscribir,socioAInscribir );
			}
	    	else{
	    		throw new NoEstaPreparado (nombre);
	    	};
			
	    	throw new NoEstaPreparado (nombre);

		}
		
	}
	
	public Integer cantidadDeInscriptosAlEvento () {
		return this.competencias.size();
	}
	
	}



	
	
	
	
	

