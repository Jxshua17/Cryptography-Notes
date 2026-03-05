package SubstitutionCipher;

import java.io.CharArrayReader;
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
        alphabets.put('i', 24); //this value id for either i/j
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
