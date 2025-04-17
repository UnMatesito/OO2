# Ejercicio 5 - Decodificador de películas 

## UML
<p>
    <img align="center" src="UML%20Decodificador.png" alt="UML Decodificador">
</p>

Para este ejercicio se utilizó el patron de diseño **Strategy** donde se se tiene una estrategia para casa metodo de sugerencia de peliculas conectado al decodificador que conoce las peliculas vistas y la grilla total de peliculas.

#### Actores
- **Context** (`Decodificador` y `Pelicula`): El contexto mantiene una relacion con la estrategia del decodificador para sugerir peliculas.
- **Strategy** (`Sugerencia`): Una interfaz que posee el metodo `sugerir()` que puede ser implementado de cualquier manera, dependiendo de las estrategias concretas
- **ConcreteStrategies** (`SugerenciaNueva`, `SugerenciaSimilar`, `SugerenciaPuntaje`): Las estrategias concretas que implementan el metodo de la interfaz `Sugerencia`