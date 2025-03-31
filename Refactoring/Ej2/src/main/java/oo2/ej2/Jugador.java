package oo2.ej2;

public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;

    public Jugador(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void incrementarPuntuacion(){
        puntuacion = puntuacion + 100;
    }

    public void decrementarPuntuacion(){
        puntuacion = puntuacion - 50;
    }
}
