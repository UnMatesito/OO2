# Ejercicio 3

# Punto 1 y 2
## Code Smells
1. *Romper Encapsulamiento*

En la variable de instancia `List<String> words` no posee un tipo de acceso asi que todas las clases de un paquete tienen acceso a esa variable de instancia.

**Solucion**: Encapsulate Field, convirtiendo la varaible de instancia `List<String> words` en privada.

2. *Duplicated Code*

En los metodos `characterCount()` y `calculateAvg()` se esta repetiendo codigo para el recorrido de la coleccion de `words`

**Solucion**: Utilizar el metodo `cahracterCount()` en el metodo `calculateAvg()` para delegar responsabilidades.

3. *Temporary Variable*

En los metodos `characterCount()` y `calculateAvg()` se tiene de las variables temporales `count` y `avgLength` que no son necesarias 

**Solucion**: Replace temp with query eliminando dichas varaibles de instancia y dejando solo las operaciones importantes (en `calculateAvg()` se debe mapear a `long` para solucionarlo)

# Punto 3
En el codigo presentado se genera un error al calcular el promedio de palabras de un documento, debido a que si la coleccion `words` no tiene ningun elemento, el promedio sera `0` y no se lanzara una excepcion. Esto puede ser un error de logica en el programa, ya que el promedio de palabras no puede ser `0` si no hay palabras en la coleccion. Al realizar los refactorings el error sigue existiendo, por lo tanto es un problema en la logica y los test implementados cuando se realizo el codigo original.