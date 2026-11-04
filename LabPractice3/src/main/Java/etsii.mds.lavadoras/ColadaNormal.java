package main.Java.etsii.mds.lavadoras;

public class ColadaNormal extends Colada {
	private int capSuavizante;
	private int cantSuavizante;

	public ColadaNormal(int temp, int rpm, int cantDetergente, LavadoraNormal lavadora, int capSuavizante, int cantSuavizante) {
		super(temp, rpm, cantDetergente, lavadora);
		this.capSuavizante = capSuavizante;
		this.cantSuavizante = cantSuavizante;
	}

	public int getCantSuavizante() { return cantSuavizante; }
	public void setCantSuavizante(int cantSuavizante) { this.cantSuavizante = cantSuavizante; }
}
