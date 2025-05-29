# Ejercicio 3

## Punto 1
**a.** Si aparce una nueva fuente de energia se deberia crear una clase abstracta llamada `SolarPanelRobot` y ese 
robot debe implementar todos los tipos de locomoción que puede tener y todos los tipos de armas que un robot puede 
tener.

Se deberían agregar las siguientes clases para la implementación

### Clases Abstractas de locomoción
- `SolarPanelCaterpillarRobot`
- `SolarPanelOvercraftRobot`

### Clases concretas
- `SolarPanelCaterpillarRobotWithLasers`
- `SolarPanelCaterpillarRobotWithBombs`
- `SolarPanelOvercraftRobotWithLasers`
- `SolarPanelOvercraftRobotWithBombs`

**b.** No, no puedo cambiar el sistema de armas de un Robot sin tener que instanciar un robot nuevo, debido a que no 
se tiene de una forma de hacerlo.

**c.** El nivel de carga de energia lo guardaria como variable de instancia de la clase abstracta `SolarPanelRobot`. 
Si se realiza esta solución se deberia proveer de un metodo en la clase llamado `suficienteEnergiaParaDisparar()` 
retornando si el robot posee suficiente bateria para satisfacer el consumo del arma.

## Punto 2
**a.** Si aparece un nuevo tipo de locomoción, en este caso, tracción 4x4 solo se deberia crear la clase 
`FourXFourTraction` que hereda la clase abstracta `LocomotionSystem`

**b.** En este modelo si se puede cambiar en ejecucion el tipo de armas que el robot puede utilizar sin la necesidad 
de instanciar un nuevo robot.

**c.** Se deberia almacenar el nivel de bateria en la clase `SolarWithBaterry` y crear un metodo public para 
comprobar si se pueden utilizar las armas con el nivel de bateria actual, al tener como parametro el mismo robot, el 
metodo es mas sencillo de implementar. 

## Punto 3
Las desventajas principales entre los 2 modelos es que con herencia si se quiere implementar un nuevo tipo de 
elemento para el robot, se deberían implementar todas las clases correspondientes, generando duplicación de código y 
un diagrama UML de muchas clases, mientras que con composición al ser más restrictivo en cuanto a que se puede hacer 
y que no la implementación de funcionalidades dependiendo el robot en cuestión es más costosa debido a que los 
mensajes se mueven de un lado para el otro.

Con respecto a las ventajas, la composición provee una estructura mucho más fácil de mantener si se siguen agregando 
nuevos elementos y en cuanto a la herencia, tiene como ventaja que al poseer una implementación exacta del robot es 
más fácil de introducir nuevos comportamientos al robot en cuestión.