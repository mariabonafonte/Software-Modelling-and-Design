package main.Java.etsii.mds.lavadoras;
import java.util.*;

public class LavadoraSecadora extends Lavadora {
	private int maxTempSecado;

	public LavadoraSecadora(String marca, int capDetergente, int maxTempLavado, int maxCentrifugado, int maxPeso, int maxTempSecado) {
		super(marca, capDetergente, maxTempLavado, maxCentrifugado, maxPeso);
		this.maxTempSecado = maxTempSecado;
	}

	public int getMaxTempSecado() { return maxTempSecado; }
	public void setMaxTempSecado(int maxTempSecado) { this.maxTempSecado = maxTempSecado; }
}
