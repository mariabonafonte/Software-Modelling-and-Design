package partB;

class EstrategiaTriestable extends Estrategia{

	private static EstrategiaTriestable ejemplar;
	
	private EstrategiaTriestable() {
		//
	}
	
	static EstrategiaTriestable estrategiaTriestable() {
		if(ejemplar == null)
			ejemplar = new EstrategiaTriestable();
		return ejemplar;
	}
	
	@Override
	void abrir(Estado estado, Dispositivo dispositivo) {
		if(estado instanceof Rojo)
			dispositivo.cambiarEstado(Amarillo.amarillo());
		else
			dispositivo.cambiarEstado(Verde.verde());
	}

	@Override
	void cerrar(Estado estado, Dispositivo dispositivo) {
		if(estado instanceof Verde)
			dispositivo.cambiarEstado(Amarillo.amarillo());
		else
			dispositivo.cambiarEstado(Rojo.rojo());
	}

}
