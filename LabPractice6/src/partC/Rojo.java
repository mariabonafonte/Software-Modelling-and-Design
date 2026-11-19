package partC;

class Rojo extends Estado{

	private static Rojo rojo;
	
	private Rojo() {
		// Constructor privado
	}
	
	static Rojo rojo() {
		if(rojo == null)
			rojo = new Rojo();
		return rojo;
	}
	
	@Override
	void abrir(Dispositivo dispositivo) {
		assert(dispositivo != null);
		dispositivo.getEstrategia().abrir(this, dispositivo);
	}

	@Override
	void cerrar(Dispositivo dispositivo) {
		assert(dispositivo != null);
		throw new RuntimeException("No se puede hacer cerrar en estado Rojo");
	}

	@Override
	String estado(Dispositivo dispositivo) {
		assert(dispositivo != null);
		return "cerrado";
	}

	
}
