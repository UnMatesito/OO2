package oo2.ej2.parte2;

public class Papel extends Elemento {
    public Papel() {
        super("Papel");
    }

    @Override
    public String jugarContraPapel() {
        return "Empate";
    }

    @Override
    public String jugarContraTijera() {
        return "Perdiste";
    }

    @Override
    public String jugarContraPiedra() {
        return "Ganaste";
    }

    @Override
    public String jugarContraLagarto() {
        return "Perdiste";
    }

    @Override
    public String jugarContraSpock() {
        return "Ganaste";
    }

    @Override
    public String jugarContra(Elemento elemento) {
        return elemento.jugarContraPapel();
    }
}
