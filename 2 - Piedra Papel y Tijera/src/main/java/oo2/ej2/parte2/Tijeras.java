package oo2.ej2.parte2;

public class Tijeras extends Elemento {
    public Tijeras() {
        super("Tijeras");
    }

    @Override
    public String jugarContraPapel() {
        return "Ganaste";
    }

    @Override
    public String jugarContraTijera() {
        return "Empate";
    }

    @Override
    public String jugarContraPiedra() {
        return "Perdiste";
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
        return elemento.jugarContraTijera();
    }
}
