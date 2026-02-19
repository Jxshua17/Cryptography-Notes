package BlockTranspositionCipher;

import java.util.ArrayList;

public class BlockCipherTranspositionCipher {

    //TODO -> work on a method for finding what the prime factors of a number are.
    //i know the plan was to generate prime factors but the below method would do. it generates the factors of the argument given.
    public static ArrayList<Integer> factorization(int number){
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i=2;i<number;i++){
            if (number % i == 0){
                factors.add(i);
            }
        }

        return factors;
    }

    //TODO -> work on a special configuration using the prime factors method to find the rxc for the matrix in the encryption method.

    public static String encryption(String plainText){
        StringBuilder cipherText = new StringBuilder();
        int matrixRows;
        int matrixColumns;

        /*Hmmmmmm! I just figured out a way to generate the perfect number of rows and columns for the matrix.
        so after finding the length of the plainText, the next thing to do is to find the prime factors of the number...
        ...using that, if the numbers are in an array, just pick the last two values in the array.
        take for example, 20. 2,2,5
        so if there are duplicate numbers, you find the product of the square of the duplicate and any other number in the array.*/

        int lengthOfPlainText = plainText.length();

        if (lengthOfPlainText % 2 != 0) {
            lengthOfPlainText++;
            plainText = plainText + " ";
        }

        ArrayList<Integer> tempArray = new ArrayList<>(factorization(lengthOfPlainText));
        int tempArrSize = tempArray.size()/2; //dividing by two to use the two actual numbers in the factors array whose product is the size.

        matrixRows = tempArray.get(tempArrSize);
        matrixColumns = tempArray.get(tempArrSize - 1);


        char [][]block = new char[matrixRows][matrixColumns];

        int k=0;
        while (k<lengthOfPlainText){
            for (int i=0;i<matrixRows;i++){
                for (int j=0;j<matrixColumns;j++){
                    block[i][j] = plainText.charAt(k);
                    k++;
                }
            }
        }

        for (int j=0;j<matrixColumns;j++){
            for (int i=0;i<matrixRows;i++){
                cipherText.append(block[i][j]);
            }
        }

        return cipherText.toString();
    }

    public static String decryption(String cipherText){
        StringBuilder plainText = new StringBuilder();

        int lengthOfCiphertext = cipherText.length();
        ArrayList<Integer> factors = new ArrayList<>(factorization(lengthOfCiphertext));

        int tempNo = factors.size() / 2;

        int matrixRows = factors.get(tempNo);
        int matrixColumns = factors.get(tempNo - 1);


        char [][]block = new char[matrixColumns][matrixRows];

        int k = 0;
        while (k<lengthOfCiphertext){
            for (int i=0;i<matrixColumns;i++){
                for (int j=0;j<matrixRows;j++){
                    block[i][j] = cipherText.charAt(k);
                    k++;
                }
            }
        }

        for (int j=0;j<matrixRows;j++){
            for (int i=0;i<matrixColumns;i++){
                plainText.append(block[i][j]);
            }
        }


        return plainText.toString();
    }

    public static void main(String[] args) {
        int [][] nums = new int[2][2];
        System.out.println(nums[0][1]);
        nums[0][1] = 45;
        System.out.println(nums[0][1]);
        System.out.println(factorization(22));
        System.out.println(factorization(20));
        System.out.println(factorization(34));
        System.out.println(factorization(45));
        System.out.println(factorization(48));
        System.out.println(factorization(51));
        System.out.println(factorization(112));
        System.out.println(factorization(1000));
        System.out.println(encryption("just lemme love you."));
        System.out.println(encryption("Six Degrees of Freedom is my favourite book at the moment."));
        System.out.println(encryption("Nicolas Dickner is such a fantastic writer."));
        System.out.println(encryption("I actually do love programming"));
        System.out.println(encryption("are you fucking with me?"));



        ArrayList<Integer> numbers = new ArrayList<>(factorization(45));
        int x = numbers.size();
        System.out.println(numbers.getLast());
        System.out.println(numbers.get(x-1));
        System.out.println(numbers.get(x-2));


        System.out.println("...........Decryption time..........");
        System.out.println(decryption("Iu orm advomaloegicl  rntylpag"));
        System.out.println(decryption("NlDniuantweiaiesc tirrcscr hfaci.o k s as t "));
        System.out.println(decryption("SxDgeso reo sm aort oka h oeti ere fFedmi yfvuiebo ttemmn."));
        System.out.println(decryption("j moyulevose eutml ."));
        System.out.println(decryption("ayfiw rounimeucgte  k h?"));
    }
}
