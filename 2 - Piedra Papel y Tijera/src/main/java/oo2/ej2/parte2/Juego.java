package oo2.ej2.parte2;

import oo2.ej2.parte1.Elemento;

public class Juego {
    private Elemento jugador;
    private Elemento contrincante;

    public Juego(Elemento jugador, Elemento contrincante) {
        this.jugador = jugador;
        this.contrincante = contrincante;
    }

    public String jugar(){
        if (this.jugador.ganaA(this.contrincante)){
            return jugador.getNombre();
        } else if (this.contrincante.ganaA(this.jugador)){
            return contrincante.getNombre();
        } else {
            return "Empate";
        }
    }
}
