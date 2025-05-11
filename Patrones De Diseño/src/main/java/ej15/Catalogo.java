package ej15;

import java.util.List;

public class Catalogo {
    private static Catalogo instance;
    private List<Componente> componentes;

    private Catalogo(List<Componente> componentes){
        this.componentes = componentes;
    }

    public Componente getComponente(String descripcion){
        return componentes.stream().filter(componente -> componente.mismaDescripcion(descripcion)).findFirst().orElse(null);
    }

    public void agregarComponente(Componente componente){
        this.componentes.add(componente);
    }

    public static Catalogo getInstance(List<Componente> componentes){
        if( instance == null ){
            instance = new Catalogo(componentes);
        }
        return instance;
    }
}
