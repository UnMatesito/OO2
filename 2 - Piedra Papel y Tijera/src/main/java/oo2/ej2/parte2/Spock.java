package oo2.ej2.parte2;

public class Spock extends Elemento {
    public Spock() {
        super("Spock");
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
        return "Ganaste";
    }

    @Override
    public String jugarContraLagarto() {
        return "Perdiste";
    }

    @Override
    public String jugarContraSpock() {
        return "Empate";
    }

    @Override
    public String jugarContra(Elemento elemento) {
        return elemento.jugarContraSpock();
    }
}
