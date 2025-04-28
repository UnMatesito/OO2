package ej10;

public class RC4Adapter extends Cifrado{
    private RC4 rc4;

    public RC4Adapter(String key, RC4 rc4){
        super(key);
        this.rc4 = rc4;
    }

    @Override
    public String cifrar(String mensaje, String key) {
        return rc4.encriptar(mensaje, key);
    }

    @Override
    public String descifrar(String mensaje, String key) {
        return rc4.desencriptar(mensaje, key);
    }
}
