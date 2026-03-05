package SubstitutionCipher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstitutionCipherTest {

    @Test
    void encryption() {
        assertEquals("243443234511", SubstitutionCipher.encryption("joshua"));
    }
    @Test
    void encryption0() {
        assertEquals("13425435443433343224133433", SubstitutionCipher.encryption("cryptonomicon"));
    }
    @Test
    void encryption1() {
        assertEquals("24 52113344 543445", SubstitutionCipher.encryption("i want you"));
        //this was the example that i used in my notes. it passed. lol. of course, it did.
    }

    @Test
    void decryption(){
        assertEquals("cryptonomicon", SubstitutionCipher.decryption("13425435443433343224133433"));
    }
    @Test
    void decryption1(){
        assertEquals("i want you", SubstitutionCipher.decryption("24 52113344 543445"));
    }
    @Test
    void decryption2(){
        assertEquals("joshua", SubstitutionCipher.decryption("243443234511"));
        //this test doesn't pass but is correct all the same because the actual is ioshua and that is because of the i reps j also.
    }
}