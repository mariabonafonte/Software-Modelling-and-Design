package partA;

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
	void abrir(Biestable biestable) {
		assert(biestable != null);
		throw new RuntimeException("No se puede ejecutar abrir en un estado Verde");
	}

	@Override
	void cerrar(Biestable biestable) {
		assert(biestable != null);
		biestable.cambiarEstado(Rojo.rojo());
	}

	@Override
	String estado(Biestable biestable) {
		assert(biestable != null);
		return "abierto";
	}

}
