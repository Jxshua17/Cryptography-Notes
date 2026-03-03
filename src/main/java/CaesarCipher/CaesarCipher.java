package CaesarCipher;

import java.util.HashMap;

public class CaesarCipher {

    public static String encryption(String plaintext, int key){
        StringBuilder cipherText = new StringBuilder();
        //i could use an array instead of a hashmap.

        HashMap<String, Integer> alphabets = new HashMap<>();
        alphabets.put("a", 0);
        alphabets.put("b", 1);
        alphabets.put("c", 2);
        alphabets.put("d", 3);
        alphabets.put("e", 4);
        alphabets.put("f", 5);
        alphabets.put("g", 6);
        alphabets.put("h", 7);
        alphabets.put("i", 8);
        alphabets.put("j", 9);
        alphabets.put("k", 10);
        alphabets.put("l", 11);
        alphabets.put("m", 12);
        alphabets.put("n", 13);
        alphabets.put("o", 14);
        alphabets.put("p", 15);
        alphabets.put("q", 16);
        alphabets.put("r", 17);
        alphabets.put("s", 18);
        alphabets.put("t", 19);
        alphabets.put("u", 20);
        alphabets.put("v", 21);
        alphabets.put("w", 22);
        alphabets.put("x", 23);
        alphabets.put("y", 24);
        alphabets.put("z", 25);

        //hello -> ifmmp

        char [] alphabets1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int lengthOfPlainText = plaintext.length();

        for (int i=0;i<lengthOfPlainText;i++){
            if (plaintext.charAt(i) == ' '){
                cipherText.append(' ');
            } else {
                String a = String.valueOf(plaintext.charAt(i));
                int key1 = alphabets.get(a);
                int newKey = key1 + key;
                newKey = newKey%26;
                char character = alphabets1[newKey];

                cipherText.append(character);
            }
        }


        return cipherText.toString();
    }

    public static String decryption(String ciphertext, int key){
        StringBuilder plaintext = new StringBuilder();

        HashMap<String, Integer> alphabets = new HashMap<>();
        alphabets.put("a", 0);
        alphabets.put("b", 1);
        alphabets.put("c", 2);
        alphabets.put("d", 3);
        alphabets.put("e", 4);
        alphabets.put("f", 5);
        alphabets.put("g", 6);
        alphabets.put("h", 7);
        alphabets.put("i", 8);
        alphabets.put("j", 9);
        alphabets.put("k", 10);
        alphabets.put("l", 11);
        alphabets.put("m", 12);
        alphabets.put("n", 13);
        alphabets.put("o", 14);
        alphabets.put("p", 15);
        alphabets.put("q", 16);
        alphabets.put("r", 17);
        alphabets.put("s", 18);
        alphabets.put("t", 19);
        alphabets.put("u", 20);
        alphabets.put("v", 21);
        alphabets.put("w", 22);
        alphabets.put("x", 23);
        alphabets.put("y", 24);
        alphabets.put("z", 25);


        char [] alphabets1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int lengthOfCiphertext = ciphertext.length();

        for (int i=0;i<lengthOfCiphertext;i++){
            if (ciphertext.charAt(i) == ' '){
                plaintext.append(' ');
            } else {
                String a = String.valueOf(ciphertext.charAt(i));
                int key1 = alphabets.get(a);
                int newKey = key1 - key;

                if (newKey<0){
                    newKey = newKey + 26;
                }

                newKey = newKey%26;
                char character = alphabets1[newKey];

                plaintext.append(character);
            }
        }

        return plaintext.toString();
    }

    public static void main(String[] args) {
        String o = decryption("ifmmp", 1);
        String o1 = decryption("rkbbc", 2);
        System.out.println(o);
        System.out.println(o1);
        System.out.println(encryption("pizza", 2));
    }
}
