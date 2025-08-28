/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Jacob Lowe
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        // TODO: Complete the decryptOne() function.

        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char letter = encrypted.charAt(i);

            // Check if character is uppercase
            if (Character.isUpperCase(letter)) {

                // Shifts the uppercase letter forward by 9 in the alphabet
                char shiftedLetter = (char) ((encrypted.charAt(i) - 'A' + 9) % 26 + 'A');
                decrypted += shiftedLetter;
            }

            // Check if the character is lowercase
            else if (Character.isLowerCase(letter)) {

                // Shifts the lowercase letter forward by 9 in the alphabet
                char shiftedLetter = (char) ((encrypted.charAt(i) - 'a' + 9) % 26 + 'a');
                decrypted += shiftedLetter;
            } else {
                // Keep the spaces, periods, etc the same
                decrypted += letter;
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        // TODO: Complete the decryptTwo() function.

        String decrypted = "";

        // Used to store ASCII values
        String number = "";
        for (int i = 0; i < encrypted.length(); i++) {
            if (encrypted.charAt(i) != ' ') {
                // Collect the ASCII values associated with the number
                number += encrypted.charAt(i);
            } else {
                if (!number.isEmpty()) {
                    // Convert the string version of the numbmer to an integer

                    // Then convert the ASCII value of the integer to the ASCII
                    // value associated with that number and add the letter to
                    // the string
                    int asciiValue = Integer.parseInt(number);
                    char letter = (char) asciiValue;
                    decrypted += letter;
                    number = "";
                }
            }
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        // TODO: Complete the decryptThree() function.

        String decrypted = "";
        String binaryNumber = "";
        for (int i = 0; i < (encrypted.length()) - 8; i+=8) {

            // Take groups of 8 numbers from the long binary string
            binaryNumber += encrypted.substring(i, i + 8);

            // Convert the binary string to an integer and then to a character
            char letter = (char)Integer.parseInt(binaryNumber, 2);
            decrypted += letter;
            binaryNumber = "";
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        // TODO: Complete the decryptFour() function.

        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char emoji = encrypted.charAt(i);
            int unicodeDecimal = (int)emoji;
            int asciiValue = unicodeDecimal-9919;
            decrypted += (char)asciiValue;
        }
        return decrypted;
    }
}
