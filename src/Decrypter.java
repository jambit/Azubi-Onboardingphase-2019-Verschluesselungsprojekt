import java.util.Scanner;

public class Decrypter {

    public void decrypt(String message, int key) {
        char[] singleCharacters = message.toCharArray();
        System.out.println("Definiere den Offset");
        for (int i = 0; i < singleCharacters.length ; i++) {
            int s = singleCharacters[i];
            int offset = Constants.CHARACTER_SET.indexOf((singleCharacters[i])) + key;
            System.out.println(offset);
            System.out.println(Constants.CHARACTER_SET.charAt(offset));
        }
    }
}
