package oo2.ej1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
    private Usuario usuario1;
    private Tweet tweet1;
    private Tweet tweet2;

    @BeforeEach
    void setUp() {
        usuario1 = new Usuario("pepe_Argento");
        tweet1 = new Tweet("Hola, soy pepe");
        tweet2 = new Tweet("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris ut justo dictum, blandit mauris quis, rhoncus sem. Integer fringilla felis at magna facilisis, vel tempus urna dapibus. Suspendisse potenti. Etiam tincidunt massa et neque tincidunt tincidunt. Pellentesque in convallis lectus. Aliquam erat volutpat. Sed vel placerat urna. Duis vitae nisl pretium, finibus orci in, interdum elit. Aliquam ac ligula tortor. Vivamus at nunc sapien. Maecenas a faucibus leo, ut varius lectus. Praesent id volutpat tortor, sit amet dapibus erat. Nulla sagittis turpis eget urna finibus, vel accumsan nunc vehicula.\n" +
                "\n" +
                "Praesent felis quam, blandit sed nisi at, molestie tristique nisl. Proin eget turpis mauris. Quisque hendrerit ante lacus, sit amet convallis mi porttitor a. Quisque in est ornare, pretium justo sed, hendrerit nibh. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut lobortis arcu quis diam porttitor dignissim. Proin scelerisque justo nunc, laoreet consequat eros tincidunt vel. Donec sollicitudin nibh sem, in placerat elit convallis eget. Aenean eget congue ex. Nunc vitae vestibulum quam. Sed vitae felis elementum, auctor urna in, auctor libero. Aliquam justo ligula, luctus sit amet commodo sed, facilisis quis odio. Praesent sed lacus magna. Vestibulum pellentesque dapibus diam, quis maximus magna sagittis nec.\n" +
                "\n" +
                "Nam condimentum tellus et lorem tristique, sit amet venenatis mauris congue. Aliquam tempus, magna eu semper suscipit, risus neque pellentesque tellus, ac maximus neque dui eu justo. Ut vitae lectus nec purus elementum gravida nec ut enim. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Etiam eget gravida justo, a eleifend ex. Ut vitae velit nunc. Morbi condimentum diam sit amet sapien commodo consectetur. Morbi viverra felis quis arcu posuere luctus. Integer eget tempus tellus. Sed sollicitudin nunc ipsum, eu faucibus velit tristique id.");
    }

    @Test
    void testAgregarTweetConLongitudAceptada(){
        usuario1.realizarTweet(tweet1);
        assertEquals(1, usuario1.getTweets().size());
    }

    @Test
    void testAgregarTweetConLongitudNoAceptada(){
        usuario1.realizarTweet(tweet2);
        assertEquals(0, usuario1.getTweets().size());
    }

    @Test
    void testRetweetear(){
        usuario1.realizarTweet(tweet1);
        usuario1.retweet(tweet1, "Hola, soy pepe pero malefico");
    }
}
