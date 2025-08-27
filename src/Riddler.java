/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: YOUR NAME HERE
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        // TODO: Complete the decryptOne() function.

        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++) {
            char letter = encrypted.charAt(i);
            if (Character.isUpperCase(letter)) {
                char shiftedLetter = (char) ((encrypted.charAt(i) - 'A' + 9) % 26 + 'A');
                decrypted += shiftedLetter;
            } else if (Character.isLowerCase(letter)) {
                char shiftedLetter = (char) ((encrypted.charAt(i) - 'a' + 9) % 26 + 'a');
                decrypted += shiftedLetter;
            } else {
                decrypted += letter;
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        // TODO: Complete the decryptTwo() function.

        String decrypted = "";
        String number = "";
        for (int i = 0; i < encrypted.length(); i++) {
            if (encrypted.charAt(i) != ' ') {
                number += encrypted.charAt(i);
            } else {
                if (!number.isEmpty()) {
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
            binaryNumber += encrypted.substring(i, i + 8);
            char letter = (char)Integer.parseInt(binaryNumber, 2);
            decrypted += letter;
            binaryNumber = "";
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
