package partC;

public class Triestable extends Dispositivo{
	
	public Triestable() {
		this.cambiarEstado(Rojo.rojo());
		this.setEstrategia(EstrategiaTriestable.estrategiaTriestable());
	}
}
