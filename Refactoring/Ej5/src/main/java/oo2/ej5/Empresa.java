package oo2.ej5;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private List<Cliente> clientes = new ArrayList<>();
	private List<Llamada> llamadas = new ArrayList<>();
	private GestorNumerosDisponibles guia = new GestorNumerosDisponibles();


	public boolean agregarNumeroTelefono(String str) {
		return guia.agregarNumeroDisponible(str);
	}

	public String obtenerNumeroLibre() {
		return guia.obtenerNumeroLibre();
	}

	public Cliente registrarUsuarioFisico(String dni, String nombre) {
		Cliente var = new ClienteFisico(nombre, guia.obtenerNumeroLibre(), dni);
		clientes.add(var);
		return var;
	}

	public Cliente registrarUsuarioJuridico(String cuit, String nombre) {
		Cliente var = new ClienteJuridico(nombre, guia.obtenerNumeroLibre(), cuit);
		clientes.add(var);
		return var;
	}

	public Llamada registrarLlamada(Cliente origen, Cliente destino, TipoLlamada t, int duracion) {
		Llamada llamada = new Llamada(t, origen.getNumeroTelefono(), destino.getNumeroTelefono(), duracion);
		llamadas.add(llamada);
		origen.llamadas.add(llamada);
		return llamada;
	}

	public double calcularMontoTotalLlamadas(Cliente cliente) {
		return cliente.getLlamadas().stream().mapToDouble(llamada -> llamada.getPrecioLlamada() - (llamada.getPrecioLlamada() * cliente.getDescuento())).sum();
	}

	public int cantidadDeUsuarios() {
		return clientes.size();
	}

	public boolean existeUsuario(Cliente persona) {
		return clientes.contains(persona);
	}

	public GestorNumerosDisponibles getGestorNumeros() {
		return this.guia;
	}
}
