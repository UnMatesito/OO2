# Ejercicio 6

## UML Solución vieja

<p>
    <img src="UML%20Solucion%20Vieja.png" alt="UML Solución vieja">
</p>

## Refactorings a realizar

1. Se realiza un **Extract Method** para crear un método privado llamado `verificarHijoIzquierdo()` para delegar responsabilidades.
2. Se realiza un **Extract Method** para crear un método privado llamado `verificarHijoDerecho()` para delegar responsabilidades.
3. Se realiza un **Pull up Method** para crear una interfaz `Recorrido` que posee 3 clases llamadas `RecorridoPreOrden`, `RecorridoInorden` y `RecorridoPostorden`
4. Se realiza un **Introduce Null Object** para crear la interfaz `Arbol` y la clase que implementa `ArbolNull` y `ArbolBinario`, además se agrega un metodo llamado `esNulo()` para controlar el uso de si es un objeto Nulo o no.

## UML Nueva solución

<p>
    <img src="UML%20Arbol%20Nuevo.png" alt="UML Solución Nueva">
</p>