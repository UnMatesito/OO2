package ej4;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class toDoItem {
    private String name;
    private List<String> comments;
    private State state;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;

    /**
     * Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
     */
    public toDoItem(String name){
        this.name = name;
        this.state = new Pending(this);
        this.comments = new ArrayList<>();
    }

    public List<String> getComments() {
        return new ArrayList<>(comments);
    }

    public void setDateStart(LocalDateTime dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(LocalDateTime dateEnd) {
        this.dateEnd = dateEnd;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
     * pending. Si se encuentra en otro estado, no hace nada.
     */
    public void start(){
        this.state.start();
    }

    /**
     * Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
     * estado es paused. Caso contrario (pending o finished) genera un error
     * informando la causa específica del mismo.
     */
    public void togglePause(){
        this.state.pause();
    }

    /**
     * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea
     * in-progress o paused. Si se encuentra en otro estado, no hace nada.
     */
    public void finish(){
        this.state.finish();
    }

    /**
     * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
     * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
     * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
     * genera un error informando la causa específica del mismo.
     */
    public Duration workedTime(){
        return this.state.workedTime();
    }

    /**
     * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
     * contrario no hace nada.
     */
    public void addComment(String comment){
        this.state.comment(comment);
    }
}
