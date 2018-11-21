package geco;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGenerationTest {

    @Test
    public void testGetRandomPassword() {
        PasswordGeneration passwordGeneration = new PasswordGeneration();
        String password = passwordGeneration.getRandomPassword();
        assertEquals(8, password.length());
    }
}