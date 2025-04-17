# Ejercicio 8 - Dispositivo móvil y conexiones

## UML
<p>
    <img src="UML%20Dispositivo%20Mobil.png" alt="UML Dispositivo Mobil">
</p>

Para este ejercicio se utilizaron los patrones **Strategy** para la calculadora CRC y **Adapter** para adaptar la clase `4GConnection`

## Roles
**Strategy**
- **ConcreteStrategy** (`CRC16_Calculator` y `CRC32_Calculator`): Se encargan de realizar el calculo de CRC implementando la interfaz `CRC_Calculator`
- **Strategy** (`CRC_Calculator`): Define un método en común a implementar para obtener el `crc`
- **Context** (`Dispositivo`): Posee de atributo la interfaz estrategia

**Adapter**
- **Client** (`Dispositivo`): Colabora con la conformacion de objetos de la interfaz Target
- **Target** (`Connection`): Define la interfaz especifica del dominio del cliente
- **Adapter** (`MobileConn`): Adapta la interfaz de Adaptee a la de Target
- **Adaptee** (`4GConnection`): Objeto con una interfaz que necesita ser adaptada
