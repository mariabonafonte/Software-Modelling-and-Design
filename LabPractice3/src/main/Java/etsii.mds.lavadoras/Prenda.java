package main.Java.etsii.mds.lavadoras;
import java.util.*;

public class Prenda {

	Collection<Estado> estados;
	private TipoPrenda tipo;
	private int peso;

	public Prenda(TipoPrenda tipo, int peso) {
		this.tipo = tipo;
		this.peso = peso;
	}

	public TipoPrenda getTipo() {
		return tipo;
	}

	public int getPeso() {
		return peso;
	}

	public Collection<Estado> getEstados() {
		return estados;
	}

	public void setEstados(Collection<Estado> estados) {
		this.estados = estados;
	}
}