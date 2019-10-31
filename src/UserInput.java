import java.util.Scanner;

public class UserInput {
    Scanner sc = new Scanner(System.in);

    public void getUserInput() {
        System.out.println("Please type in the offset you want");
        Constants.offSet = sc.nextInt();
        System.out.println("Now please type in the text you want to use");
        Constants.text = sc.next();
    }

    public void askForMode() {
        System.out.println("Please tell me if you want to decrypt (0) or encrypt (1)");
        Constants.mode = sc.nextInt();
    }
}

