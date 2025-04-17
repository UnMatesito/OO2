package ej6;

import java.util.List;
import java.util.stream.Collectors;

public class EstadoDefinitivo extends Estado{
    @Override
    public String mostrarInformacionExtra(Excursion excursion) {
        return getMailsUsuarios(excursion) + " " + getCuposFaltantes(excursion);
    }

    private int getCuposFaltantes(Excursion excursion) {
        return excursion.getCupoMaximo() - excursion.getUsuarios().size();
    }

    private List<String> getMailsUsuarios(Excursion excursion) {
        return excursion.getUsuarios().stream().map(usuario -> usuario.getEmail()).collect(Collectors.toList());
    }
}
