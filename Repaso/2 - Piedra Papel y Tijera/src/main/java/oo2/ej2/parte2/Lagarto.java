package oo2.ej2.parte2;

public class Lagarto extends Elemento {
    public Lagarto() {
        super("Lagarto");
    }

    @Override
    public String jugarContraPapel() {
        return "Ganaste";
    }

    @Override
    public String jugarContraTijera() {
        return "Perdiste";
    }

    @Override
    public String jugarContraPiedra() {
        return "Perdiste";
    }

    @Override
    public String jugarContraLagarto() {
        return "Empate";
    }

    @Override
    public String jugarContraSpock() {
        return "Ganaste";
    }

    @Override
    public String jugarContra(Elemento elemento) {
        return elemento.jugarContraLagarto();
    }
}
