package oo2.ej5;

import java.util.TreeSet;
import java.util.SortedSet;

public class GestorNumerosDisponibles {
	private SortedSet<String> lineas = new TreeSet<>();
	private TipoGenerador tipoGenerador = new GeneradorUltimo();

	public SortedSet<String> getLineas() {
		return lineas;
	}

	public String obtenerNumeroLibre() {
		return tipoGenerador.obtenerNumero(lineas);
	}

	public boolean agregarNumeroDisponible(String str) {
		return this.lineas.add(str);
	}

	public void cambiarTipoGenerador(TipoGenerador tipo) {
		this.tipoGenerador = tipo;
	}
}
