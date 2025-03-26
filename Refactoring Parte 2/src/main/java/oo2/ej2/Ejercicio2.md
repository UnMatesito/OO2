# Ejercicio 2.2
## Codigo
### Juego
```java
public class Juego {
    // ......
    
    public void incrementar(Jugador j) {
        j.puntuacion = j.puntuacion + 100;
    }
    
    public void decrementar(Jugador j) {
        j.puntuacion = j.puntuacion - 50;
    }
}
```
### Jugador
```java
public class Jugador {
    public String nombre;
    public String apellido;
    public int puntuacion = 0;
}
```

## Malos Olores
## Nombres Poco Explicativos
Los metodos `incrementar()` y `decrementar()` podemos ver que los nombres son cortos y poco explicativos, es decir que al enviar un mensaje no se va a entender que se va a incrementar o decrementar

**Solucion**: Rename de los métodos para que sean más autoexplicativos

## Feature Envy
En los metodos `incrementar()` y `decrementar()` podemos detectar que las operaciones de suma y resta de puntos se realizan dentro `Juego`

**Solucion**: Move Method de la clase `Juego` a la clase `Jugador`

## Data Class
Podemos detectar que la clase `Jugador` es una clase de datos que no posee comportamiento alguno

**Solucion**: Move Method y Extract Method de la clase Juego que tiene mas sentido en cuanto a las reponsabilidades que en la clase donde se encuentra (`Juego`)

## Falta de Constructor
En la clase `Jugador` no se posee del constructor para instanciar la clase

**Solucion**: Crear un construccion para `Jugador` con `nombre` y `apellido`, asumiendo que la puntuacion siempre empieza en 0