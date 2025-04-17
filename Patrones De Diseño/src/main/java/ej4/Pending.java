package ej4;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends State {
    public Pending(toDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    protected void start() {
        this.getToDoItem().setState(new InProgres(this.getToDoItem()));
        this.getToDoItem().setDateStart(LocalDateTime.now());
    }

    @Override
    protected void finish() {
    }

    @Override
    protected void pause(){
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    protected Duration workedTime() {
        throw new RuntimeException("Error: Th task never started");
    }
}
