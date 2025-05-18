# Ejercicio 5

## UML de la solución anterior

<p>
    <img src="UML%20Solucion%20Vieja.png" alt="UML Solución vieja"> 
</p>

## Refactorings a realizar
1. *Switch statements*
En la clase `GestorNumerosDisponibles` en el método `obtenerNumeroLibre()` para manejar la logica se utiliza un switch statement haciendo que el metodo sea largo y si a futuro se implementan nuevos tipos de generacion de telefonos el codigo se sigue extendiendo.

**Solución**: **Extract Method**, **Move Method** y **Replace conditional with polymorphism** Creando una interfaz `TipoGeneracion` y las clases `Ultimo`, `Primero` y `Random`. Ademas debemos cambiar el tipo de la variable de instancia tipoGenerador para que utilice la interfaz `TipoGenerador` y poder utilizar el método `obtenerNumero()`

2. *Duplicated Code*
En la clase `Empresa` en el método `registrarUsuario()` se repite el código para la creación tanto de un cliente de tipo **fisico** como un tipo **juridico** al setear nombre y numero de telefono

**Solución**: Dejar solo en los `if` los datos que son distintos del cliente y los datos repetidos sacarlos del condicional, dejando asi un codigo mas limpio.

3. *Comments*
En la clase `Empresa` en el método `calcularMontoTotalLlamadas()` se escribieron el código comentarios para el calculo de los tipos de llamadas y su IVA

**Solución**: **Extract Method** creando metodos privados para obtenter el Iva y otros valores para el calculo.

4. *Primitive Obsession y Switch Statements*
En la clase `Empresa` en el método `getPrecioLlamadas()` para determinar el tipo de llamada se utiliza un String lo cual no es la solucion correcta si a futuro se tiene que expandir mas tipos de llamadas

**Solución**: **Pull up Field**, **Pull up Method** y **Replace Conditional with Polymorphism** creando la interfaz `TipoLlamada` y las clases que implementen la interfaz `LlamadaNacional` y `LlamadaInternacional` implementando el metodo `getPrecioLlamada()` y trayendo a la clase `Llamada` los metodos de `getIVA()` y `getPrecioLlamadas()`.

5. *Switch Statements*
En la clase `Empresa` en el metodo `registrarUsuario()` y `calcularMontoTotalLlamadas()` se tiene de `if`s anidados para el seteo de identificadores de la clase `Cliente` (CUIT o DNI) y si a futuro se piden más alternativas la logica del codigo va a ser muy larga.

**Solución**: **Replace Conditional with Polymorphism** creando 2 subclases `ClienteFisico` y `ClienteJuridico` que poseen como variables de instancia sus identificadores y su descuento también (eliminando las variables estaticas de `Empresa`) y creando 2 metodos para registrar clientes fisicos y juridicos, además eliminando la variable de instancia _tipo_. y en el metodo `calcularMontoTotalLlamadas()` cambiar la logica para obtener el descuento del cliente en cuestion.

6. *Romper Encapsulamiento*
En la clase `Cliente` se tiene de muchos setters que podrian romper encapsulamiento de las variables de instancias y como ya se poseen de constructores no son necesarios.

**Solución**: Eliminar los setters que no son necesarios.

7. *Reinventar la rueda*
En la clase `Empresa` en el método `calcularMontoTotalLlamadas()` para recorrer las llamadas de los clientes se utiliza un loop for-each, sabiendo que se pueden utilizar streams para recorrer las colecciones

**Solución**: **Replace loop with pipeline** cambiando toda la logica de como recorrer las llamadas con `stream()`

8. *Switch Statements*
En la clase `Empresa` en el método `agregarNumeroTelefono()` se tiene de `if`s anidados para agregar un numero de telefono en un `SortedSet` lo cual es inutil debido a que los valores de los `SortedSet` no pueden ser repetidos, lo cual hace la logica para buscar numeros repetidos inutil.

**Solución**: **Extract Method** y **Pull up Method** a la clase `GestorNumerosDisponibles` eliminando asi logica inesaria que ya el `SortedSet` posee implmentada para los repetidos.

## UML de la nueva solución

<p>
    <img src="UML%20Nuevo.png" alt="Solución nueva">
</p>


