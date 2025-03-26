package oo2.ej2.parte1;

public class Piedra extends Elemento {
    public Piedra() {
        super("Piedra");
    }

    @Override
    public String jugarContraPiedra() {
        return "Empate";
    }

    @Override
    public String jugarContraTijera() {
        return "Ganaste";
    }

    @Override
    public String jugarContraPapel() {
        return "Perdiste";
    }

    @Override
    public String jugarContra(Elemento elemento) {
        return elemento.jugarContraPiedra();
    }
}
