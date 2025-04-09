package ej1.puntoB;

import java.util.List;

public class VoorheesExporter {
    private JsonAdaptee adaptee;

    public VoorheesExporter(){
        adaptee = new JsonAdaptee();
    }

    public String exportar(List<Socio> socios){
        socios.forEach(socio -> adaptee.addSocio(socio));
        return adaptee.toString();
    }
}
