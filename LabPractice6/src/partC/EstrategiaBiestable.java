package partC;

class EstrategiaBiestable extends Estrategia{

	private static EstrategiaBiestable ejemplar;
	
	private EstrategiaBiestable() {
		//
	}
	
	static EstrategiaBiestable estrategiaBiestable() {
		if(ejemplar == null)
			ejemplar = new EstrategiaBiestable();
		return ejemplar;
	}
	
	@Override
	void abrir(Estado estado, Dispositivo dispositivo) {
		dispositivo.cambiarEstado(Verde.verde());
	}

	@Override
	void cerrar(Estado estado, Dispositivo dispositivo) {
		dispositivo.cambiarEstado(Rojo.rojo());
	}

}
