package ej12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileSystem {
    private List<Elemento> elementos;

    public FileSystem() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(Elemento elemento){
        elementos.add(elemento);
    }

    /**
     * Retorna el espacio total ocupado, incluyendo todo su contenido.
     */
    public int tamañoTotalOcupado(){
        return elementos.stream().mapToInt(elemento -> elemento.getTamañoBytes()).sum();
    }

    /**
     * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del
     * filesystem
     */
    public Archivo archivoMasGrande(){
        return elementos.stream()
                .filter(elemento -> elemento instanceof Archivo)
                .map(elemento -> (Archivo) elemento).max((a1, a2) -> Integer.compare(a1.getTamañoBytes(), a2.getTamañoBytes()))
                .orElse(null);
    }

    /**
     * Retorna el archivo con fecha de creación más reciente en cualquier nivel
     * del filesystem
     */
    public Archivo archivoMasNuevo(){
        return elementos.stream()
                .filter(elemento -> elemento instanceof Archivo)
                .map(elemento -> (Archivo) elemento).max((a1, a2) -> a1.getFechaCreacion().compareTo(a2.getFechaCreacion()))
                .orElse(null);
    }

    /**
     * Retorna el primer elemento con el nombre solicitado contenido en cualquier
     * nivel del filesystem
     */
    public Elemento buscar(String nombre){
        return elementos.stream().filter(elemento -> elemento.esIgual(nombre)).findFirst().orElse(null);
    }

    /**
     * Retorna la lista con los elementos que coinciden con el nombre solicitado
     * contenido en cualquier nivel del filesystem
     */
    public List<Elemento> buscarTodos(String nombre) {
        return elementos.stream().filter(elemento -> elemento.esIgual(nombre)).collect(Collectors.toList());
    }

    /**
     * Retorna un String con los nombres de los elementos contenidos en todos los
     * niveles del filesystem. De cada elemento debe retornar el path completo
     * (similar al comando pwd de linux) siguiendo el modelo presentado a
     * continuación:<br>
         /Directorio A<br>
         /Directorio A/Directorio A.1<br>
         /Directorio A/Directorio A.1/Directorio A.1.1<br>
         /Directorio A/Directorio A.1/Directorio A.1.2<br>
         /Directorio A/Directorio A.2<br>
         /Directorio B<br>
     */
    public String listadoDeContenido() {
        return elementos.stream()
                .filter(elemento -> elemento instanceof Directorio)
                .map(elemento -> elemento.getNombre())
                .collect(Collectors.joining("\n"));
    }
    //TODO: Preguntar si esta implementacion es correcta
}

