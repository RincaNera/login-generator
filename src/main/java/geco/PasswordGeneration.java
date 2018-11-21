package geco;

import javax.xml.crypto.dsig.DigestMethod;
import java.security.MessageDigest;

/**
 * Classe représentant un générateur de mot de passe.
 */
public class PasswordGeneration {
    /**
     * Génére un mot de passe aléatoire de 8 caractères.
     *
     * @return Un mot de passe aléatoire de 8 caractères
     */
    public String getRandomPassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++)
            password.append((char) (Math.random() * (127 - 33)));
        return password.toString();
    }
}
