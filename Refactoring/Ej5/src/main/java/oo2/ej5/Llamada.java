package oo2.ej5;

public class Llamada {
	private TipoLlamada tipoDeLlamada;
	private String origen;
	private String destino;
	private int duracion;

	public Llamada(TipoLlamada tipoLlamada, String origen, String destino, int duracion) {
		this.tipoDeLlamada = tipoLlamada;
		this.origen= origen;
		this.destino= destino;
		this.duracion = duracion;
	}

	public TipoLlamada getTipoDeLlamada() {
		return tipoDeLlamada;
	}

	public String getRemitente() {
		return destino;
	}

	public int getDuracion() {
		return this.duracion;
	}

	public String getOrigen() {
		return origen;
	}

	public double getPrecioLlamada() {
		return this.duracion * this.tipoDeLlamada.getPrecioLlamada() + (this.duracion * this.tipoDeLlamada.getPrecioLlamada() * this.getIVA()) + this.tipoDeLlamada.getAdicional();
	}

	private double getIVA() {
		return 0.21;
	}
}
