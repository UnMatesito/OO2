package oo2.ej5;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {
	public List<Llamada> llamadas = new ArrayList<>();
	private String nombre;
	private String numeroTelefono;

	public Cliente(String nombre, String numeroTelefono) {
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public List<Llamada> getLlamadas() {
		return new ArrayList<>(this.llamadas);
	}

	public abstract void setId(String id);
	public abstract String getId();
	public abstract double getDescuento();
}
