package ej4;

public class Finished extends State {
    public Finished(toDoItem toDoItem) {
        super(toDoItem);
    }

    @Override
    protected void start() {
    }

    @Override
    protected void pause() {
        throw new RuntimeException("El objeto ToDoItem no se encuentra en pause o in-progress");
    }

    @Override
    protected void finish() {
    }

    @Override
    protected void comment(String comment) {
    }
}
