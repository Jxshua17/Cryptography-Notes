import CaesarCipher.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherTest {

    @Test
    public void encryptionTest(){

        String plainText = "hello";
        int key = 1;

        assertEquals("ifmmp", CaesarCipher.encryption(plainText, key));
    }
    @Test
    public void encryptionTest1(){

        String plainText = "codecademy is awesome";
        int key = 1;

        assertEquals("dpefdbefnz jt bxftpnf", CaesarCipher.encryption(plainText, key));
    }

    @Test
    public void encryptionTest3(){

        String plainText = "cryptonomicon";
        int key = 2;

        assertEquals("etarvqpqokeqp", CaesarCipher.encryption(plainText, key));
    }

}