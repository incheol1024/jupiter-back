package cantata.jupiter.config;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JasyptConfigTest {
    @Autowired
    @Qualifier("encryptorBean")
    private StringEncryptor stringEncryptor;

    @Test
    public void pwdEncrypt(){
        String encrypt = stringEncryptor.encrypt("password");
        System.out.println(encrypt);
        String decrypt = stringEncryptor.decrypt(encrypt);
        System.out.println(decrypt);
    }
}