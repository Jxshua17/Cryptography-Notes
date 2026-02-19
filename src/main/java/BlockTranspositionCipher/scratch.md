<h1>Notes on Cryptography</h1>
so i think i might be roaming around in circles. Not really understanding what this algorithm entails. 
I just don't know. 
<br>
so here i am attempting to really break down te algorithm into individual pieces before doing then going
on to implement or refactor as the case may be. DECOMPOSITION, BABY!

<br>
for the factorization method. 
<br>
1. find the factors of the number. (i already know how oto do this)
<br> <i>what i want basically with the encryption method is to not have to use 2 except where absolutely necessary.</i>
<br>so i want two numbers returned in the factorisation method. that is all.
<br><br>
<h3>Logs</h3>
14:28PM-I have managed to take the code back to the way it was. i needed to simplify that shit.
so i just need to work forward from this point.<br>
14:33PM-So i am already thinking. the way it is now, i just need to create a variable which i will
divide by two and then use that as the index so no matter of the array, i'll get something close to the middle rather than using two.
so even though it is two, it will still work.
<br>
14:48PM-Just finished implementing and testing the idea that i came up with in th previous log. 
and it worked which makes me really happy. Next now is implementing the decryption algorithm then i'll
move on to something else but first, i gotta commmit.

<br>14:57PM: let's see if i can finish the decryption algorithm before going home.
<br>15:00PM: so the initial algorithm was;<br>
1. take in the plaintext.
2. create a 2d array called block with a specified number of rows and columns.
3. put the plaintext into array
4. change directions and append each letter to a different array called cipherText.
5. return ciphertext.

so what would the reverse be for the decryption method?
1. take in the ciphertext argument.
2. calculate the length of the ciphertext.
3. call the factorisation method and look for the factors.
4. get the consecutive numbers in the array from 3 whose product is the length.
5. assign each of these numbers to the matrix rows and columns.
6. create a 2d array.
7. change direction and append each letter to the empty plaintext array.
8. return the plaintext string.

15:48PM: i was having issues with the method that i had written. i just kept on getting the array out of bounds error.
so i said lemme listen to a bit of music to see if it would help and th first sog wasn't even 
done before i realised my mistake. i copied the line that creates the character array for the block
but i didn't change the size. that was what caused the issue. 

