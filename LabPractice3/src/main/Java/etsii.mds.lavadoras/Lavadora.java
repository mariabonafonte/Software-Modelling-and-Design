package main.Java.etsii.mds.lavadoras;

import java.util.ArrayList;
import java.util.List;

public abstract class Lavadora {
	private String marca;
	private int capDetergente;
	private int maxTempLavado;
	private int maxCentrifugado;
	private int maxPeso;
	protected List<Colada> coladas;

	public Lavadora(String marca, int capDetergente, int maxTempLavado, int maxCentrifugado, int maxPeso) {
		this.marca = marca;
		this.capDetergente = capDetergente;
		this.maxTempLavado = maxTempLavado;
		this.maxCentrifugado = maxCentrifugado;
		this.maxPeso = maxPeso;
		this.coladas = new ArrayList<Colada>();
	}

	public int getCapDetergente() {
		return capDetergente;
	}
	public int getMaxTempLavado() {
		return maxTempLavado;
	}
	public int getMaxPeso() {
		return maxPeso;
	}
	public int getMaxCentrifugado() {
		return maxCentrifugado;
	}

	//los atributos derivdos los convertimos en metodos
	public boolean enFuncionamiento() {
		for (Colada c : coladas) {
			// Si la colada ha empezado (iniciol != -1) y no ha terminado (fin == -1)
			if (c.getInicioL() != -1 && c.getFin() == -1) {
				return true;
			}
		}
		return false;
	}
	public void agregarColada(Colada colada) {
		this.coladas.add(colada);
	}

	public List<Colada> getColadas() { return coladas; }
	public String getMarca() { return marca; }

}