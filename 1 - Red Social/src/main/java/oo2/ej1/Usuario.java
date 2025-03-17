package oo2.ej1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String screenName;
    private List<Tweet> tweets;

    public Usuario(String screenName) {
        this.screenName = screenName;
        this.tweets = new ArrayList<Tweet>();
    }

    public void realizarTweet(Tweet tweet) {
        if (verificarLongitud(tweet.getTexto())) {
            this.tweets.add(tweet);
        }
    }

    public void eliminarTweets() {
        this.tweets.clear();
    }

    public void retweet(Tweet origen, String texto) {
        this.tweets.add(new Retweet(origen, texto));
    }

    private boolean verificarLongitud(String texto) {
        return !texto.isEmpty() && texto.length() <= 280;
    }

    public String getScreenName() {
        return this.screenName;
    }

    public boolean tieneNombre(String screenName){
        return this.screenName.equals(screenName);
    }

    public List<Tweet> getTweets() {
        return new ArrayList<>(this.tweets);
    }
}
