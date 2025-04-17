package ej6;

public abstract class Estado {

    public String mostrarInformacion(Excursion excursion) {
        return excursion.getNombre() + " " + excursion.getCosto() + " " + excursion.getFechaInicio() + " " + excursion.getFechaFin() + " " + excursion.getPuntoEncuentro() + mostrarInformacionExtra(excursion);
    }

    protected abstract String mostrarInformacionExtra(Excursion excursion);
}
