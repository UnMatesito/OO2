package oo2.ej3.puntoB.example;

import oo2.ej3.puntoB.model.*;

public class SimpleGame {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.add(new Robot("Twonky", new Caterpillar(), new NuclearPlant(), new BombsSystem()));
        board.add(new Robot("Hammer Bot", new Overcraft(), new NuclearPlant(), new LasersSystem()));
        board.runForCicles(5);
    }
}
