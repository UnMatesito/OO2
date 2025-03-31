package oo2.ej5;

import java.text.MessageFormat;

public class Supermercado {
    public void notificarPedido(Pedido pedido, Cliente cliente) {
        String notificacion = generarNotificacion(pedido.getNroPedido(), cliente.getDireccion());
        imprimirPedido(notificacion);
    }

    private String generarNotificacion(long nroPedido, String direccion) {
        return MessageFormat.format(
                "Estimado cliente, se le informa que hemos recibido su pedido con número {0}, el cual será enviado a la dirección {1}",
                nroPedido, direccion
        );
    }

    private void imprimirPedido(String notificacion) {
        System.out.println(notificacion);
    }
}
