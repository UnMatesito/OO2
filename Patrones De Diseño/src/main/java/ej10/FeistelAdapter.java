package ej10;

public class FeistelAdapter extends Cifrado{
    private FeistelCipher feistelCipher;

    public FeistelAdapter(String key, FeistelCipher feistelCipher) {
        super(key);
        this.feistelCipher = feistelCipher;
    }

    @Override
    public String cifrar(String mensaje, String key) {
        feistelCipher = new FeistelCipher(key);
        return feistelCipher.encode(mensaje);
    }

    @Override
    public String descifrar(String mensaje, String key) {
        feistelCipher = new FeistelCipher(key);
        return feistelCipher.encode(mensaje);
    }
}
