package ej8;

public class MobileConn implements Connection {
    private FourGConnection fourGConnection;

    public MobileConn(String symb) {
        fourGConnection = new FourGConnection(symb, this);
    }

    public FourGConnection getFourGConnection() {
        return fourGConnection;
    }

    public void setFourGConnection(FourGConnection fourGConnection) {
        this.fourGConnection = fourGConnection;
    }

    @Override
    public String sendData(String data, long crc) {
        return data+crc;
    }

    @Override
    public String pict() {
        return fourGConnection.getSymb();
    }
}
