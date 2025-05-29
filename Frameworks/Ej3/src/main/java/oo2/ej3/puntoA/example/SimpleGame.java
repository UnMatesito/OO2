package oo2.ej3.puntoA.example;

import oo2.ej3.puntoA.model.GameBoard;
import oo2.ej3.puntoA.model.NuclearCaterpillarRobotWithBombs;
import oo2.ej3.puntoA.model.NuclearOvercraftRobotWithLasers;

public class SimpleGame {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        board.add(new NuclearCaterpillarRobotWithBombs("Twonky"));
        board.add(new NuclearOvercraftRobotWithLasers("Hammer Bot"));
        board.runForCicles(5);
    }
}
