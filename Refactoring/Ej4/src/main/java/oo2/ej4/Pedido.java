package oo2.ej4;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private FormaPago formaPago;

    public Pedido(Cliente cliente, List<Producto> productos, FormaPago formaPago) {
        this.cliente = cliente;
        this.productos = productos;
        this.formaPago = formaPago;
    }

    public double getCostoTotal() {
        double costoProductos = costoTotalProductos();
        double extraFormaPago = formaPago.sumarExtra(costoProductos);
        return costoExtraPorAntiguedad(costoProductos, extraFormaPago);
    }

    private double costoExtraPorAntiguedad(double costoProductos, double extraFormaPago) {
        int añosDesdeFechaAlta = cliente.getAñosDesdeFechaAlta();
        // Aplicar descuento del 10% si el cliente tiene más de 5 años de antiguedad
        if (añosDesdeFechaAlta > 5) {
            return costoPedido(costoProductos, extraFormaPago) * 0.9;
        }
        return costoPedido(costoProductos, extraFormaPago);
    }

    private double costoPedido(double costoProductos, double extraFormaPago){
        return costoProductos + extraFormaPago;
    }


    private double costoTotalProductos() {
        return this.productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
    }
}