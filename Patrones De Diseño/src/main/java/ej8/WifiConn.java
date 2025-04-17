package ej8;

public class WifiConn implements Connection{
    private String pict;

    @Override
    public String sendData(String data, long crc) {
        return data+crc;
    }

    @Override
    public String pict() {
        return pict;
    }
}
