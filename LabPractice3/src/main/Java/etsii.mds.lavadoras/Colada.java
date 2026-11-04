package main.Java.etsii.mds.lavadoras;
import java.util.*;

public abstract class Colada {

	Collection<Estado> estados;
	private int temp;
	private int rpm;
	private int cantDetergente;
	private int inicioL;
	private int inicioC;
	private int fin;
	private int peso;

	public Colada(int temp, int rpm, int inicioL, int cantDetergente, int inicioC, int fin, int peso) {
		this.temp = temp;
		this.rpm = rpm;
		this.inicioL = inicioL;
		this.cantDetergente = cantDetergente;
		this.inicioC = inicioC;
		this.fin = fin;
		this.peso = peso;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public int getRpm() {
		return rpm;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public int getInicioL() {
		return inicioL;
	}

	public void setInicioL(int inicioL) {
		this.inicioL = inicioL;
	}

	public int getCantDetergente() {
		return cantDetergente;
	}

	public void setCantDetergente(int cantDetergente) {
		this.cantDetergente = cantDetergente;
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
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}