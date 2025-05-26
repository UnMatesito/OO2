# Ejercicio 1

## Punto 1
Se realiza en la clase `SingleThreadTCPServer`

## Punto 2
Evaluando las alternativas propuestas se llega a la siguiente conclusión

**a.** La variable que se implementa en el método main de `SingleThreadTCPServer` es la solución mas facil de 
implementar pero se le esta permitiendo al cliente hacer cosas que se supone que no deberia realizar (configuracion 
de servidor)

**b.** El método hook que retorna un booleano es una buena solución porque toda la lógica se realiza dentro del 
servidor como es debido pero como puede ser cualquier tipo de condición se puede realizar de cualquier manera 
posible, es decir es muy bueno si se quiere realizar de diferentes implementaciones para checkeear condiciones pero es 
tambien riesgoso debido a que puede ser cualquier cosa que puede afectar al servidor.

**c.** El método hook que retorna un String que es la palabra de término de la sesión es la mejor solucion porque 
toda la lógica se realiza en el servidor y además le estás forzando al que implementa el framework que solo utilice 
un String para verificar el mensaje de fin de sesión. 

**d.** Una jerarquía de Strategies solución los problemas del punto **b.** pero es muy costoso de implementar en el 
framework, lo cual no la hace la mejor solución.

## Punto 3 y 4
Implementado en las clases `PasswordServer` y `RepeatServer`
