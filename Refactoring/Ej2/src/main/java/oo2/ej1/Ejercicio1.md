# Ejercicio 2.1

## Codigo
### EmpleadoTemporario
```java
public class EmpleadoTemporario {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public double horasTrabajadas = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico + (this.horasTrabajadas * 500) + (this.cantidadHijos * 1000) - (this.sueldoBasico * 0.13);
    }
}
```

### EmpleadoPasante
```java
public class EmpleadoPlanta {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    public int cantidadHijos = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico + (this.cantidadHijos * 2000) - (this.sueldoBasico * 0.13);
    }
}
```

### EmpleadoPlanta
```java
public class EmpleadoPasante {
    public String nombre;
    public String apellido;
    public double sueldoBasico = 0;
    // ......
    
    public double sueldo() {
        return this.sueldoBasico - (this.sueldoBasico * 0.13);
    }
}
```

# Malos Olores

## Duplicate Code
En todas las clases del ejercicio se repite mucho codigo, donde se repiten los mensajes y variables de instancia de las clases de empleados.
**Solucion**: Extract Method, Extract Superclass, Pull Up Field y Pull Up Method, creando una clase abstracta `Empleado`

## No usar constructor para inicializar variables de instancia
En la clase abstacta `Empleado` no se provee de un constructor para inicializar las variables `nombre` y `apellido`.
**Solucion**: Crear un constructor en la clase `Empleado` que inicialice las variables `nombre` y `apellido`.

## Duplicate Code
En las clases `EmpleadoPlanta` y `EmpleadoPasante` se posee de la variable de instacia `int cantidadHijos` por lo tanto se esta repitiendo la misma variable de instancia en 2 Clases
**Solucion**: Extract Method, Extract Superclass y Pull up Field, creando una clase abstracta `EmpleadoConHijos` que extienda a `Empleado` creando asi una doble herencia.

