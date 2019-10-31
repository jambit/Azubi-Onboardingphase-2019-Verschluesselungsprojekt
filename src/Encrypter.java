public class Encrypter {
    public String encrypt(String messageToBeEncrypted, int offset) {
        char[] charArray = messageToBeEncrypted.toCharArray();
        char[] newArray = new char[charArray.length];
        String encryptedMessage = "";
        for (int i = 0; i < charArray.length; i++) {

            newArray[i] = Constants.CHARACTER_SET.charAt(Constants.CHARACTER_SET.indexOf(charArray[i])-offset);


        }
        for (int j = 0; j < charArray.length; j++) {
            encryptedMessage += newArray[j];

        }
        return encryptedMessage;  }
}
