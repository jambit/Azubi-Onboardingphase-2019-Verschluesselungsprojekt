import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    Encrypter encrypter = new Encrypter();
    Scanner sc = new Scanner(System.in);
    public int key;
    //TODO: Write UserInput that doesn't allow Input you dont want
    //TODO: Test the UserInput and make it wihout crashes we know the problems with scanners XD

    public void input() {
        while (true) {
            System.out.println("gebe q zum beenden ein");
            System.out.println("gebe key zum einstellen des keys ein");
            String iinput = sc.next();
            switch (iinput) {
                case "q":
                    System.exit(0);
                    break;
                case "key":
                    keyInput();
                    break;
                default:
                    System.out.println("Please type in which method you want to use");
                    break;
            }
        }
    }

    public void keyInput() {
        System.out.println("enter the decryption key:");
        int tryKey = sc.nextInt();
        if (1 < tryKey && tryKey < 94) {
            key = tryKey;

            // encrypter.encrypt();
        } else {
            System.out.println("der Key muss zwischen 1 und 94 liegen");
        }
    }

    public void littleTest(int offset, String text) {
        if (offset < 1 || offset > 94){
            System.out.println("error ");

        }else{
            encrypter.encrypt(offset,text);
        }

    }

}


