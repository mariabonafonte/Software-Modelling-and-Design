package main.Java.etsii.mds.lavadoras;
import java.util.*;

public abstract class Colada {

	private int temp;
	private int rpm;
	private int cantDetergente;
	private int inicioL;
	private int inicioC;
	private int fin;
	private int peso;

	protected Lavadora lavadora;
	protected List<Estado> estados;

	public Colada(int temp, int rpm, int cantDetergente, Lavadora lavadora) {
		this.temp = temp;
		this.rpm = rpm;
		this.cantDetergente = cantDetergente;
		this.lavadora = lavadora;

		this.inicioL = -1
		this.inicioC = -1;
		this.fin = -1;

		this.estados = new ArrayList<>();
	}

	public void agregarPrenda(Prenda prenda, EstadoPrenda estadoInicial) {
		Estado relacion = new Estado(prenda, this, estadoInicial);
		this.estados.add(relacion);
	}

	public int getInicioL() {
		return inicioL;
	}
	public void setInicioL(int inicioL) {
		this.inicioL = inicioL;
	}

	public int getInicioC() {
		return inicioC;
	}
	public void setInicioC(int inicioC) {
		this.inicioC = inicioC;
	}

	public int getFin() {
		return fin;
	}
	public void setFin(int fin) {
		this.fin = fin;
	}

	public int getPeso() {
		int pesoTotal = 0;
		for (Estado e : estados) {
			pesoTotal += e.getPrenda().getPeso();
		}
		return pesoTotal;
	}


}