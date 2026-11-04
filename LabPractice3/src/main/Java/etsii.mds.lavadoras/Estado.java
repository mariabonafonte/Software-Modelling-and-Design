package main.Java.etsii.mds.lavadoras;
public class Estado {
	private Colada colada;
	private Prenda prenda;
	private EstadoPrenda estado;

	public Estado(Colada colada, Prenda prenda, EstadoPrenda estado) {
		this.colada = colada;
		this.prenda = prenda;
		this.estado = estado;
	}

	public Prenda getPrenda() {
		return prenda;
	}

	public EstadoPrenda getEstado() {
		return estado;
	}

	public void setEstado(EstadoPrenda estado) {
		this.estado = estado;
	}

	public Colada getColada() {
		return colada;
	}
}