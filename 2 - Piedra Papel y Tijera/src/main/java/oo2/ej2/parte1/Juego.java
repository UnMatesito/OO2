package oo2.ej2.parte1;

public class Juego {
    private Elemento jugador;
    private Elemento contricante;

    public Juego(Elemento jugador, Elemento contricante){
        this.jugador = jugador;
        this.contricante = contricante;
    }

    public String jugar(){
        if (this.jugador.ganaA(this.contricante)){
            return jugador.getNombre();
        } else if (this.contricante.ganaA(this.jugador)){
            return contricante.getNombre();
        } else {
            return "Empate";
        }
    }
}
