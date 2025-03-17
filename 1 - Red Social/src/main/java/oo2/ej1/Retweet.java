package oo2.ej1;

public class Retweet extends Tweet{
    private Tweet origen;

    public Retweet(Tweet origen, String texto) {
        super(texto);
        this.origen = origen;
    }
}
