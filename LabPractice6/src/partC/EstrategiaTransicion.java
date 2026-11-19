package partC;

class EstrategiaTransicion extends Estrategia {

	private static EstrategiaTransicion ejemplar;
	
	private EstrategiaTransicion() {}
	
	static EstrategiaTransicion estrategiaTransicion() {
		if(ejemplar == null)
			ejemplar = new EstrategiaTransicion();
		return ejemplar;
	}
	
	@Override
	void abrir(Estado estado, Dispositivo dispositivo) {
	
		if (estado instanceof Rojo) {
			dispositivo.cambiarEstado(Amarillo.amarillo());
			dispositivo.setEstrategia(EstrategiaTriestable.estrategiaTriestable());
		} else {
			// Comportamiento por defecto si estuviera en otro estado
			EstrategiaBiestable.estrategiaBiestable().abrir(estado, dispositivo);
		}
	}

	@Override
	void cerrar(Estado estado, Dispositivo dispositivo) {
		if (estado instanceof Verde) {
			dispositivo.cambiarEstado(Amarillo.amarillo());
			dispositivo.setEstrategia(EstrategiaTriestable.estrategiaTriestable());
		} else {
			EstrategiaBiestable.estrategiaBiestable().cerrar(estado, dispositivo);
		}
	}
}
