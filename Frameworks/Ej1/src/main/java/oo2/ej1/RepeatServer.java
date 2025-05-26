package oo2.ej1;

import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer{
    private String[] args;

    @Override
    public void handleMessage(String message, PrintWriter out) {

    }

    public static void main(String[] args) {

        new RepeatServer().startLoop(args);

    }
}
