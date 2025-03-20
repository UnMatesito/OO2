package oo2.ej2.parte1;

public class Papel extends Elemento{
    public Papel() {
        super("Papel");
    }

    @Override
    public String juegarContraPiedra() {
        return "Ganaste";
    }

    @Override
    public String juegarContraTijera() {
        return "Perdiste";
    }

    @Override
    public String juegarContraPapel() {
        return "Empate";
    }

    @Override
    public String jugarContra(Elemento elemento) {
        return elemento.jugarContraPapel();
    }
}
