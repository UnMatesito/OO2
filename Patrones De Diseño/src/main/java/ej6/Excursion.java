package ej6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private List<Usuario> usuarios;
    private Estado estado;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.usuarios = new ArrayList<>();
        this.estado = new EstadoProvisorio();
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String obtenerInformacion() {
        return this.estado.mostrarInformacion(this);
    }

    public void inscribirUsuario(Usuario unUsuario) {
        if ((this.usuarios.size() + 1) == cupoMinimo){
            this.setEstado(new EstadoDefinitivo());
        }
        if (cupoMinimo + 1 == cupoMaximo) {
            this.setEstado(new EstadoLleno());
        }
        this.usuarios.add(unUsuario);
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public double getCosto() {
        return costo;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Estado getEstado() {
        return estado;
    }
}
