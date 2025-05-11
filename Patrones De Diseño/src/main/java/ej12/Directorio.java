package ej12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio extends Elemento{
    private List<Elemento> elementos;

    public Directorio(String nombre, LocalDate fechaCreacion) {
        super(nombre, fechaCreacion, 32);
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento){
        elementos.add(elemento);
    }

    public List<Elemento> getElementos() {
        return new ArrayList<>(elementos);
    }

    @Override
    public String getNombre() {
        return "/" + super.getNombre() + elementos.stream().map(elemento -> elemento.getNombre()).collect(Collectors.joining("/"));
    }

    @Override
    public int getTamañoBytes(){
        return super.getTamañoBytes() + this.elementos.stream().mapToInt(elemento -> elemento.getTamañoBytes()).sum();
    }

    @Override
    public boolean esIgual(String nombre) {
        return super.getNombre().equals(nombre) || this.elementos.stream().anyMatch(elemento -> elemento.esIgual(nombre));
    }
}
