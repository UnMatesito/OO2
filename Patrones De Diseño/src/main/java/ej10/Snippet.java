package ej10;

public class Snippet {
    public static void main(String[] args) {
        Mensajero mensajero = new Mensajero();
        Cifrado cifrado = new FeistelAdapter("asfjasdkjhfasdjhfkjshd", new FeistelCipher("asfjasdkjhfasdjhfkjshd"));

        mensajero.setCifrado(cifrado);
        System.out.println(mensajero.enviar("Hola mundo"));
        System.out.println(mensajero.recibir("Hola mundo"));

        mensajero.setCifrado(new RC4Adapter("asfjasdkjhfasdjhfkjshd", new RC4()));

        System.out.println(mensajero.enviar("Hola mundo"));
        System.out.println(mensajero.recibir("Hola mundo"));
    }
}
