package ej4;

import java.time.Duration;

public abstract class State {
    private toDoItem toDoItem;

    public State(toDoItem toDoItem) {
        this.toDoItem = toDoItem;
    }

    protected abstract void start();
    protected abstract void pause();
    protected abstract void finish();

    protected Duration workedTime(){
        return Duration.between(toDoItem.getDateStart(), toDoItem.getDateEnd());
    }

    protected void comment(String comment){
        this.toDoItem.getComments().add(comment);
    };

    public toDoItem getToDoItem() {
        return toDoItem;
    }
}
