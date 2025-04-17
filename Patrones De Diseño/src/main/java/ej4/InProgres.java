package ej4;

import java.time.LocalDateTime;

public class InProgres extends State{
    public InProgres(toDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    protected void start() {
    }

    @Override
    protected void pause() {
        this.getToDoItem().setState(new Paused(this.getToDoItem()));
    }

    @Override
    protected void finish() {
        this.getToDoItem().setState(new Finished(getToDoItem()));
        this.getToDoItem().setDateEnd(LocalDateTime.now());
    }
}
