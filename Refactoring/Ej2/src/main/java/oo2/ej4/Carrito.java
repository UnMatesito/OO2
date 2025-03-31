package oo2.ej4;

import java.util.List;

public class Carrito {
    private List<Producto> productos;

    public double total() {
        return this.productos.stream().mapToDouble(producto -> producto.getPrecio() * producto.getCantidad()).sum();
    }
}
