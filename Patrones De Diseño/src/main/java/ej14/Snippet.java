package ej14;

import java.time.LocalDate;

public class Snippet {
    public static void main(String[] args) {
        Prestamo prestamoAlquileres = new PrestamoAlquileres(LocalDate.of(2024, 3, 1), LocalDate.now(), 5000);
        Prestamo prestamoAutomoviles = new PrestamoAutomoviles(2020, 100000, 10000);
        PrestamoCombinado prestamo = new PrestamoCombinado();
        prestamo.agregarPrestamo(prestamoAlquileres);
        prestamo.agregarPrestamo(prestamoAutomoviles);
        System.out.println("Valor Prendario" + prestamo.valorPrendario());
    }
}
