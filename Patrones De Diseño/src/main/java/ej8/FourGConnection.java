package ej8;

public class FourGConnection{
    private String symb;
    private MobileConn mobileConn;

    public FourGConnection(String symb, MobileConn connection) {
        this.symb = symb;
        this.mobileConn = connection;
    }

    public String getSymb() {
        return symb;
    }

    public String transmit(String data, long crc){
        return this.mobileConn.sendData(data, crc);
    }
}
