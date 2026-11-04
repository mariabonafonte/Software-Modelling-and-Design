package main.Java.etsii.mds.lavadoras;

public abstract class Lavadora {

	private String marca;
	private int capDetergente;
	private int maxTempLavado;
	private int maxCentrifugado;
	private int maxPeso;

	public Lavadora(String marca, int capDetergente, int maxTempLavado, int maxCentrifugado, int maxPeso) {
		this.marca = marca;
		this.capDetergente = capDetergente;
		this.maxTempLavado = maxTempLavado;
		this.maxCentrifugado = maxCentrifugado;
		this.maxPeso = maxPeso;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapDetergente() {
		return capDetergente;
	}

	public void setCapDetergente(int capDetergente) {
		this.capDetergente = capDetergente;
	}

	public int getMaxTempLavado() {
		return maxTempLavado;
	}

	public void setMaxTempLavado(int maxTempLavado) {
		this.maxTempLavado = maxTempLavado;
	}

	public int getMaxPeso() {
		return maxPeso;
	}

	public void setMaxPeso(int maxPeso) {
		this.maxPeso = maxPeso;
	}

	public int getMaxCentrifugado() {
		return maxCentrifugado;
	}

	public void setMaxCentrifugado(int maxCentrifugado) {
		this.maxCentrifugado = maxCentrifugado;
	}

	//los atributos derivdos los convertimos en metodos
	public abstract boolean enFuncionamiento();
}