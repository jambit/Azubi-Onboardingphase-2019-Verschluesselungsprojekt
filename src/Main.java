import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //UserInput userInput = new UserInput();
        //userInput.input();
        //Scanner sc = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        int key = sc.nextInt();

        Decrypter decrypter = new Decrypter();
        decrypter.decrypt(message, key);

    }
}
