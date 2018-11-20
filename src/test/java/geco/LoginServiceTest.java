package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {

    private LoginService login;
    private String[] loginsExistants;

    @Before
    public void setUp() {
        loginsExistants = new String[]{"toto", "tutu"};
        login = new LoginService(loginsExistants);
    }

    @Test
    public void testLoginExistsTrue() {
        // given: un service de login contenant toto et tutu
        // given by setUp
        // when: vérifier si toto est connu par le service de login
        boolean exists = login.loginExists("toto");
        // then: exists est vrai
        assertTrue(exists);
    }

    @Test
    public void testLoginExistsFalse() {
        // given: un service de login contenant toto et tutu
        // given by setUp
        // when: vérifier si tata est connu par le service de login
        boolean exists = login.loginExists("tata");
        // then: exists est faux
        assertFalse(exists);
    }

    @Test
    public void testAddLogin() {
        // given: un service de login contenant toto et tutu
        // given by setUp
        // when: ajoute "tata" à la liste des logins
        login.addLogin("tata");
        // then: "tata" est maintenant dans la liste des logins
        assertTrue(login.loginExists("tata"));
    }

    @Test
    public void testFindAllLoginsStartingWith() {
        // given: un service de login contenant toto et tutu
        // given by setUp
        // when: récupère la liste des logins commençant par to
        List<String> logins = login.findAllLoginsStartingWith("to");
        // then: toto est dans la liste des logins récupéré
        assertEquals("toto", logins.get(0));
    }

    @Test
    public void testFindAllLogins() {
        // given: un service de login contenant toto et tutu
        // given by setUp
        // when: récupère la liste de tous les logins
        List<String> logins = login.findAllLogins();
        // then: la liste des logins contient toto et tutu uniquement
        assertArrayEquals(loginsExistants, logins.toArray());
    }

}