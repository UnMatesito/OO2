package ej10;

public abstract class Cifrado {
    private String key;

    public Cifrado(String key){
        this.key = key;
    }

    public abstract String cifrar(String mensaje, String key);

    public abstract String descifrar(String mensaje, String key);

    public String getKey() {
        return this.key;
    }
}
