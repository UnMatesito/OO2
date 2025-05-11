package ej17;

public class User {
    private boolean authenticated;

    public User(boolean authenticated) {
        this.authenticated = authenticated;
    }

    public boolean isAuthenticated(){
        return this.authenticated;
    }
}
