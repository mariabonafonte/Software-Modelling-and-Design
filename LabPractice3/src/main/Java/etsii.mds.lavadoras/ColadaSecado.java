package main.Java.etsii.mds.lavadoras;

public class ColadaSecado extends Colada {

	LavadoraSecadora lavadora;
	private int inicioS;
	private int tempSecado;

	public ColadaSecado(int temp, int rpm, int inicioL, int cantDetergente, int inicioC, int fin, int peso, int inicioS, int tempSecado) {
		super(temp, rpm, inicioL, cantDetergente, inicioC, fin, peso);
		this.inicioS = inicioS;
		this.tempSecado = tempSecado;
		this.lavadora = new LavadoraSecadora();
	}
}