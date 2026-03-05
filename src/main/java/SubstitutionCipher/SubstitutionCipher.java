package SubstitutionCipher;

import java.io.CharArrayReader;
import java.io.StringReader;
import java.util.HashMap;

public class SubstitutionCipher {
    /*i might need to use a linked list to store the alphabets and the addresses because the time complexity(in the worst case scenario) for searching is o(n).
    but with linked lists, it is o(1).*/
    public static String encryption(String plaintext) {
        //according to my notes, you need a key but from what i can see of my understanding of
        StringBuilder ciphertext = new StringBuilder();

        //a 5x5 array
        /*char[] alphabets1 = {'A', 'B', 'C', 'D', 'E'};
        char[] alphabets2 = {'F', 'G', 'H', 'I', 'K'};
        char[] alphabets3 = {'L', 'M', 'N', 'O', 'P'};
        char[] alphabets4 = {'Q', 'R', 'S', 'T', 'U'};
        char[] alphabets5 = {'V', 'W', 'X', 'Y', 'Z'};

        char[][] alphabets = {alphabets1, alphabets2, alphabets3, alphabets4, alphabets5};*/


        //so after much thought, i have decided to use a hashmap instead of using an array for performance issues. it'll take time to fetch the indices of a letter.

        HashMap<Character, Integer> alphabets = new HashMap<>();
        alphabets.put('a', 11);
        alphabets.put('b', 12);
        alphabets.put('c', 13);
        alphabets.put('d', 14);
        alphabets.put('e', 15);
        alphabets.put('f', 21);
        alphabets.put('g', 22);
        alphabets.put('h', 23);
        alphabets.put('i', 24); //this value is for either i or j
        alphabets.put('k', 25);
        alphabets.put('l', 31);
        alphabets.put('m', 32);
        alphabets.put('n', 33);
        alphabets.put('o', 34);
        alphabets.put('p', 35);
        alphabets.put('q', 41);
        alphabets.put('r', 42);
        alphabets.put('s', 43);
        alphabets.put('t', 44);
        alphabets.put('u', 45);
        alphabets.put('v', 51);
        alphabets.put('w', 52);
        alphabets.put('x', 53);
        alphabets.put('y', 54);
        alphabets.put('z', 55);

        int lengthOfPlaintext = plaintext.length();

        for (int i=0;i<lengthOfPlaintext;i++){
            if (plaintext.charAt(i) == ' '){
                ciphertext.append(' ');
            } else if (plaintext.charAt(i) == 'j') {
                ciphertext.append(alphabets.get('i'));
            } else {
                ciphertext.append(alphabets.get(plaintext.charAt(i)));
            }
        }



        return ciphertext.toString();
    }

    public static String decryption(String ciphertext){
        StringBuilder plaintext = new StringBuilder();
        StringBuilder number = new StringBuilder();

        HashMap<Integer, Character> decrypt = new HashMap<>();
        decrypt.put(11, 'a');
        decrypt.put(12, 'b');
        decrypt.put(13, 'c');
        decrypt.put(14, 'd');
        decrypt.put(15, 'e');
        decrypt.put(21, 'f');
        decrypt.put(22, 'g');
        decrypt.put(23, 'h');
        decrypt.put(24, 'i'); //this key-value pair also uses j. decrypting can be funny because you might see a j where you expect an i.
        decrypt.put(25, 'k');
        decrypt.put(31, 'l');
        decrypt.put(32, 'm');
        decrypt.put(33, 'n');
        decrypt.put(34, 'o');
        decrypt.put(35, 'p');
        decrypt.put(41, 'q');
        decrypt.put(42, 'r');
        decrypt.put(43, 's');
        decrypt.put(44, 't');
        decrypt.put(45, 'u');
        decrypt.put(51, 'v');
        decrypt.put(52, 'w');
        decrypt.put(53, 'x');
        decrypt.put(54, 'y');
        decrypt.put(55, 'z');

        for (int i=0;i<ciphertext.length();i++){
            if (ciphertext.charAt(i) == ' '){
                plaintext.append(' ');
            } else {
                number.append(ciphertext.charAt(i));
                number.append(ciphertext.charAt(i+1));
                plaintext.append(decrypt.get(Integer.parseInt(String.valueOf(number))));
                number.delete(0, 2);
                i++;
            }
        }


        return plaintext.toString();
    }

    public static void main(String[] args) {
        char[] alphabets1 = {'A', 'B', 'C', 'D', 'E'};
        char[] alphabets2 = {'F', 'G', 'H', 'I', 'K'};
        char[] alphabets3 = {'L', 'M', 'N', 'O', 'P'};
        char[] alphabets4 = {'Q', 'R', 'S', 'T', 'U'};
        char[] alphabets5 = {'V', 'W', 'X', 'Y', 'Z'};

        char[][] alphabets = {alphabets1, alphabets2, alphabets3, alphabets4, alphabets5};

        int length = alphabets1.length + alphabets2.length + alphabets3.length + alphabets4.length + alphabets5.length;

        System.out.println("the total number of elements in the array is " + length);
        System.out.println(alphabets1.length);

        for (char i : alphabets1) {
            if (i == 'A') {
                System.out.println("found it");
            }
        }
        char letter = 'F';
        boolean found = false;
        while (!found){
            int index = 0;

            char [] arrayToSearchThrough = alphabets[index];

            for (int i=0;i<5;i++){
                if (arrayToSearchThrough[i] == letter) {
                    found = true;
                    break;
                }
            }

            if (!found){
                index++;
            }
        }

        System.out.println(found);

        System.out.println(alphabets[4][4]);
    }
}
