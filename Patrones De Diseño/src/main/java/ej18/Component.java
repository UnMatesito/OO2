package ej18;

import java.time.LocalDate;

public interface Component {
    String getNombre();
    String getExtension();
    int getTamaño();
    LocalDate getFechaCreacion();
    LocalDate getFechaModificacion();
    String getPermisos();

    String prettyPrint();
}
