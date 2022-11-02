package unlam.edu.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClub {

	
	@Test
	public void queSePuedaCrearUnClub() {
		Club club = new Club ("Chicago");
		
		String resultadoEsperado = "Chicago";
		String resultadoObtenido = club.getNombre();
		
		assertEquals(resultadoEsperado,resultadoObtenido);
		
		
	}
	
	
	@Test
	public void queSePuedaCrearUnSocio(){
		Socio nuevo = new Socio ("Maxi Pafundi", 01);
		
		String resultadoEsperado = "Maxi Pafundi";
		String resultadoObtenido = nuevo.getNombre();
		
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	
	@Test
	
	public void queSePuedaInscribirUnSocioAlClub() {
		Club club = new Club ("Chicago");
		Socio nuevo = new Socio ("Maxi Pafundi", 01);
		
		club.agregarDeportista(nuevo);
		
		Integer resultadoEsperado = 1;
		Integer resultadoObtenido = club.getCantidadDeSocios();
		
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	
	@Test
	public void queSePuedaCrearUnNadador() {
		Nadador nuevo = new Nadador( "Camila", 1 , "Mariposa");

		String resultadoEsperado = "Mariposa";
		String resultadoObtenido = nuevo.getEstilo();
		
		assertEquals(resultadoEsperado,resultadoObtenido);
		
	}
	
	@Test
	public void queSePuedaCrearUnCorredor() {
		Corredor nuevo = new Corredor("Carolina", 2 , 10000);
		nuevo.setCantidadDeKmEntrenados(50000);
		
		assertEquals((Integer)10000, nuevo.getDistanciaPreferida());
		assertEquals((Integer)50000, nuevo.getCantidadDeKmEntrenados());
		assertEquals((Integer)2, nuevo.getNumero_socio());
	}
	
	@Test
	public void  queSePuedaCrearUnCiclista() {
		Ciclista nuevo = new Ciclista( "Enzo", 3 , TipoDeBicicleta.RUTA);

		assertEquals(TipoDeBicicleta.RUTA, nuevo.getTipoDeBicicleta());
		assertEquals((Integer) 3, nuevo.getNumero_socio());
	}
	

	
	@Test
	public void  queSePuedaCrearUnTriatleta() {
		Triatleta nuevo = new Triatleta("Anto", 4 , 10000, TipoDeBicicleta.TRIATLON);
		
		assertEquals((Integer)10000, nuevo.getDistanciaPreferida());
		assertEquals(TipoDeBicicleta.TRIATLON, nuevo.getTipoDeBicicleta());
		assertEquals((Integer)4, nuevo.getNumero_socio());
	}
	
	
	@Test
	public void  queSePuedanIncorporarDistintosDeportistas() {
		// El número de socio no se puede repetir
		Club actual = new Club("CARP");
		
		actual.agregarDeportista(new Corredor("Camila", 1000, 42000));
		actual.agregarDeportista(new Corredor("Natalia", 1001, 5000));
		actual.agregarDeportista(new Corredor("Jorge", 1002, 21000));
		actual.agregarDeportista(new Nadador("Lucrecia", 1003, "Pecho"));
		actual.agregarDeportista(new Triatleta("Tamara", 1004, 10000, TipoDeBicicleta.RUTA));
		actual.agregarDeportista(new Ciclista("Alberto", 1005, TipoDeBicicleta.MONTAÑA));
		actual.agregarDeportista(new Ciclista("Domingo", 1006, TipoDeBicicleta.TRIATLON));
		actual.agregarDeportista(new Corredor("Luciana", 1007, 10000));
		actual.agregarDeportista(new Nadador("Luna", 1008, "Crol"));
		actual.agregarDeportista(new Nadador("Victor", 1009, "Mariposa"));
		actual.agregarDeportista(new Triatleta("Cecilia", 1004, 10000, TipoDeBicicleta.TRIATLON));
			
		assertEquals((Integer) 10, actual.getCantidadDeSocios());		
	}
	
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnaCarreraDeNatacion () throws NoEstaPreparado{	
		// En las carreras de natación sólo pueden inscribirse los que sean INadador
		Corredor celeste = new Corredor("Celeste", 1000, 10000);
		Triatleta nuevo = new Triatleta("Anto", 4 , 10000, TipoDeBicicleta.TRIATLON);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		actual.agregarDeportista(nuevo);
		
		Evento acuatico = new Evento("Maraton de aguas abiertas", TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS);
		Evento ciclismo = new Evento ( "Carrera de bicis" , TipoDeEvento.CARRERA_NATACION_EN_AGUAS_ABIERTAS);
		 actual.inscribirEnEvento(acuatico, celeste);	
		 actual.inscribirEnEvento(acuatico, celeste);
		 actual.inscribirEnEvento(ciclismo, nuevo);
		 Integer valorEsperado = 4;
		 Integer valorObtenido= actual.cantidadDeInscriptosAlEvento();
		 assertEquals((Integer)1 , actual.cantidadDeInscriptosAlEvento());
		 System.out.println(actual.cantidadDeInscriptosAlEvento());
	}
	
	
	@Test (expected = NoEstaPreparado.class)
	public void  queUnCorredorNoSePuedaInscribirEnUnTriatlon () throws NoEstaPreparado{		
		// En los triatlones s�lo pueden inscribirse los que sean INadador & ICiclista
		Socio celeste = new Corredor("Celeste", 1000, 10000);
		Club actual = new Club("Sitas");
		actual.agregarDeportista(celeste);
		Evento triatlon = new Evento("Triatlon Khona", TipoDeEvento.TRIATLON_IRONMAN);
		actual.inscribirEnEvento(triatlon, celeste);		
	}
	
}


