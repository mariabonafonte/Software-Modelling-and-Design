package main.Java.etsii.mds.lavadoras;

import java.util.*;

public class LavadoraNormal extends Lavadora {
	protected int capSuavizante;

	public LavadoraNormal(String marca, int capDetergente, int maxTempLavado, int maxCentrifugado, int maxPeso, int capSuavizante) {
		super(marca, capDetergente, maxTempLavado, maxCentrifugado, maxPeso);
		this.capSuavizante = capSuavizante;
	}

	public int getCapSuavizante() { return capSuavizante; }
	public void setCapSuavizante(int capSuavizante) { this.capSuavizante = capSuavizante; }
}
