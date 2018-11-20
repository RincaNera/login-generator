package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {

    private LoginGenerator loginGenerator;
    private LoginService loginService;
    private String[] logins;

    @Before
    public void setUp() {
        logins = new String[] {"JROL", "BPER", "CGUR", "JDU", "JRAL", "JRAL1"};
        loginService = new LoginService(logins);
        loginGenerator = new LoginGenerator(loginService);
    }

    @Test
    public void testGenerateLoginForNomPrenomPDUR() {
        String login = loginGenerator.generateLoginForNomAndPrenom("Durand", "Paul");
        assertEquals("PDUR", login);
    }

    @Test
    public void testGenerateLoginForNomPrenomJRAL2() {
        String login = loginGenerator.generateLoginForNomAndPrenom("Ralling", "John");
        assertEquals("JRAL2", login);
    }

    @Test
    public void testGenerateLoginForNomPrenomJROL1() {
        String login = loginGenerator.generateLoginForNomAndPrenom("Rolling", "Jean");
        assertEquals("JROL1", login);
    }

    @Test
    public void testGenerateLoginForNomPrenomPaulDurandAccent() {
        String login = loginGenerator.generateLoginForNomAndPrenom("Dùrand", "Paul");
        assertEquals("PDUR", login);
    }
}