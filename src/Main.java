public class Main {
    public static void main(String[] args) {
        UserInput user = new UserInput();
        Encrypter decrypter = new Encrypter();
        Decrypter encrypter = new Decrypter();
        user.askForMode();
        user.getUserInput();
        if (Constants.mode == 0) {
            System.out.println(decrypter.encrypt(Constants.text, Constants.offSet));
        } else if (Constants.mode == 1) {
            System.out.println(encrypter.decrypt(Constants.text, Constants.offSet));
        }
    }
}
