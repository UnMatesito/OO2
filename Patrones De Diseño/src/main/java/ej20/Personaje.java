package ej20;

public class Personaje {
    private String nombre;
    private int vida = 100;
    private Armadura armadura;
    private Arma arma;
    private String habilidad;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public void enfrentarPersonaje(Personaje personaje) {
        if (vidaSuficiente(personaje)){
            this.calcularNuevaVida(personaje.getArma().dañoContra(this.armadura));
            personaje.calcularNuevaVida(this.getArma().dañoContra(personaje.getArmadura()));
        }
    }

    private boolean vidaSuficiente(Personaje personaje) {
        return (this.vida - personaje.getArma().dañoContra(this.armadura) < 0) || (personaje.getVida() - this.arma.dañoContra(personaje.getArmadura()) < 0);
    }

    public void calcularNuevaVida(int daño) {
        this.vida -= this.getVida() - daño;
    }
}
