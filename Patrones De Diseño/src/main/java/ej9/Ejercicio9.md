# Ejercicio 9 - Alquiler de automóviles
## UML
<p>
    <img src="UML%20Reservas.png" alt="UML Reservas">
</p>

Para este enunciado se utilizo el patron **Strategy** para la creacion de las politicas de cancelacion de los autos en alquiler, creando la estrategia interfaz `PoliticaCancelacion` y las estrategias concretas `PoliticaFlexible`, `PoliticaModerada` y `PoliticaEstricta`

## Roles
**ConcreteStrategy** (`PoliticaFlexible`, `PoliticaModerada` y `PoliticaEstricta`): Determina los diferentes tipos de politicas de cancelacion, pueden agregarse mas a futuro
**Strategy** (interfaz `PoliticaCancelacion`): Interfaz a implementar por cada estategia concreta.
**Context** (`Reserva`, `Usuario` y `AutoEnAlquiler`): Implementacion del servicio anterior, adaptada para llevar las politicas de cancelacion


