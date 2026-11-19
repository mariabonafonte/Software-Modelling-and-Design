package partC;

class Verde extends Estado{

private static Verde verde;
	
	private Verde() {
		// Constructor privado
	}
	
	static Verde verde() {
		if(verde == null)
			verde = new Verde();
		return verde;
	}
	
	@Override
	void abrir(Dispositivo dispositivo) {
		assert(dispositivo != null);
		throw new RuntimeException("No se puede ejecutar abrir en un estado Verde");
	}

	@Override
	void cerrar(Dispositivo dispositivo) {
		assert(dispositivo != null);
		dispositivo.getEstrategia().cerrar(this, dispositivo);
	}

	@Override
	String estado(Dispositivo dispositivo) {
		assert(dispositivo != null);
		return "abierto";
	}

}
