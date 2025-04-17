package ej8;

public class Dispositivo {
    private Connection connection;
    private Display display;
    private Ringer ringer;
    private CRC_Calculator crcCalculator;

    public Dispositivo(Connection connection, Display display, Ringer ringer, CRC_Calculator crcCalculator) {
        this.connection = connection;
        this.display = display;
        this.ringer = ringer;
        this.crcCalculator = crcCalculator;
    }

    public String send(String data){
        long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, crc);
    }

    public void setCRC(CRC_Calculator crcCalculator){
        this.crcCalculator = crcCalculator;
    }

    public CRC_Calculator getCrcCalculator() {
        return crcCalculator;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }
}
