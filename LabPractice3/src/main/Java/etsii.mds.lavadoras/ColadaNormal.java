package main.Java.etsii.mds.lavadoras;
public class ColadaNormal extends Colada {

	LavadoraNormal lavadora;
	private int cantSuavizante;

	public ColadaNormal(int temp, int rpm, int inicioL, int cantDetergente, int inicioC, int fin, int peso, int cantSuavizante) {
		super(temp, rpm, inicioL, cantDetergente, inicioC, fin, peso);
		this.lavadora = new LavadoraNormal();
		this.cantSuavizante = cantSuavizante;
	}
}