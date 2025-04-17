package ej9;

import java.time.LocalDate;

public class Snippet {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("UnMatesito");
        PoliticaCancelacion politicaCancelacion = new PoliticaFlexible();
        AutoEnAlquiler auto = new AutoEnAlquiler(300, 3,"Ford", politicaCancelacion);
        usuario.addAuto(auto);
        Reserva reserva = new Reserva(5, LocalDate.of(2025,3,6), usuario, auto);
        System.out.println(reserva.montoARembolsar(LocalDate.of(2025,3,10)));
        politicaCancelacion.pasarAPoliticaModerada(auto);
        System.out.println(reserva.montoARembolsar(LocalDate.of(2025,3,3)));
    }
}
