package ej11.puntoA;

import java.util.ArrayList;
import java.util.List;

public class Mixta extends Topologia{
    private List<Topologia> topologia;

    public Mixta(Topologia topologia1, Topologia topologia2, Topologia topologia3, Topologia topologia4){
        this.topologia = List.of(topologia1, topologia2, topologia3, topologia4);
    }

    public List<Topologia> getTopologia() {
        return new ArrayList<>(this.topologia);
    }

    @Override
    public double proporcionAgua(){
        return this.topologia.stream().mapToDouble(topologia -> topologia.proporcionAgua()).sum()/this.topologia.size();
    }

    @Override
    public boolean esigual(Topologia topologia) {
        return this.proporcionAgua() == topologia.proporcionAgua();
    }
}
