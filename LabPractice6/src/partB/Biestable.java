package partB;

public class Biestable extends Dispositivo{
	
	public Biestable() {
		this.cambiarEstado(Rojo.rojo());
		this.setEstrategia(EstrategiaBiestable.estrategiaBiestable());
	}
	
}
