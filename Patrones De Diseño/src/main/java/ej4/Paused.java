package ej4;

import java.time.LocalDateTime;

public class Paused extends State {
    public Paused(toDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    protected void start() {
    }

    @Override
    protected void pause() {
        this.getToDoItem().setState(new InProgres(this.getToDoItem()));
    }

    @Override
    protected void finish() {
        this.getToDoItem().setState(new Finished(this.getToDoItem()));
        this.getToDoItem().setDateEnd(LocalDateTime.now());
    }
}
