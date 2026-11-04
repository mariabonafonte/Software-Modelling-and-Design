package main.Java.etsii.mds.lavadoras;

public class ColadaSecado extends Colada {
	private int inicios;
	private int tempSecado;

	public ColadaSecado(int temp, int rpm, int cantDetergente, LavadoraSecadora lavadora, int tempSecado) {
		super(temp, rpm, cantDetergente, lavadora);
		this.inicios = -1;
		this.tempSecado = tempSecado;
	}

	public int getInicios() { return inicios; }
	public void setInicios(int inicios) { this.inicios = inicios; }

	public int getTempSecado() { return tempSecado; }
	public void setTempSecado(int tempSecado) { this.tempSecado = tempSecado; }
}
