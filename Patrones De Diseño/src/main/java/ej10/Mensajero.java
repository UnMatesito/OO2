package ej10;

public class Mensajero {
    private Cifrado cifrado;

    public String enviar(String mensaje){
        return cifrado.cifrar(mensaje, cifrado.getKey());
    }

    public String recibir(String mensaje){
        return cifrado.descifrar(mensaje, cifrado.getKey());
    }

    public void setCifrado(Cifrado cifrado) {
        this.cifrado = cifrado;
    }
}
