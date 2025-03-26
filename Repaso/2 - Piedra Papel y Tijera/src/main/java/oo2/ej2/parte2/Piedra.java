package oo2.ej2.parte2;

public class Piedra extends Elemento {
    public Piedra() {
        super("Piedra");
    }

    @Override
    public String jugarContraPapel() {
        return "Perdiste";
    }

    @Override
    public String jugarContraTijera() {
        return "Ganaste";
    }

    @Override
    public String jugarContraPiedra() {
        return "Empate";
    }

    @Override
    public String jugarContraLagarto() {
        return "Ganaste";
    }

    @Override
    public String jugarContraSpock() {
        return "Perdiste";
    }

    @Override
    public String jugarContra(Elemento elemento) {
        return elemento.jugarContraPiedra();
    }
}
