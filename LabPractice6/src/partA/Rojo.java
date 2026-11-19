package partA;

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
	void abrir(Biestable biestable) {
		assert(biestable != null);
		biestable.cambiarEstado(Verde.verde());
	}

	@Override
	void cerrar(Biestable biestable) {
		assert(biestable != null);
		throw new RuntimeException("No se puede hacer cerrar en estado Rojo");
	}

	@Override
	String estado(Biestable biestable) {
		assert(biestable != null);
		return "cerrado";
	}
}
