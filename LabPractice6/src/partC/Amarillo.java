package partC;

class Amarillo extends Estado{

	private static Amarillo amarillo;
	
	private Amarillo() {
		// Constructor privado
	}
	
	static Amarillo amarillo() {
		if(amarillo == null)
			amarillo = new Amarillo();
		return amarillo;
	}
	
	@Override
	void abrir(Dispositivo dispositivo) {
		assert(dispositivo != null);
		dispositivo.getEstrategia().abrir(this, dispositivo);
	}

	@Override
	void cerrar(Dispositivo dispositivo) {
		assert(dispositivo != null);
		dispositivo.getEstrategia().cerrar(this, dispositivo);
	}

	@Override
	String estado(Dispositivo dispositivo) {
		assert(dispositivo != null);
		return "precaución";
	}
}
