package oo2.ej2.parteA.punto1;

public class User {
    private boolean authenticated;

    public User(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean isAuthenticated(){
        return this.authenticated;
    }
}
