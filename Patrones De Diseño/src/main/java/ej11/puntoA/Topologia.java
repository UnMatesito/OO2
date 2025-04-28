package ej11.puntoA;

public abstract class Topologia {

    public abstract double proporcionAgua();

    public boolean esigual(Topologia topologia){
        return this.proporcionAgua() == topologia.proporcionAgua();
    }

    @Override
    public boolean equals(Object object) {
        return this.esigual((Topologia)object);
    }

    public Object getTopologia(){
        return this;
    }

}
