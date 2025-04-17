package ej6;

public class EstadoProvisorio extends Estado{
    @Override
    public String mostrarInformacionExtra(Excursion excursion) {
        return String.valueOf(getCuposFaltantes(excursion));
    }

    private int getCuposFaltantes(Excursion excursion) {
        return excursion.getCupoMinimo() - excursion.getUsuarios().size();
    }
}
