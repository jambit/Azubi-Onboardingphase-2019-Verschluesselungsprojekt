public class Decrypter {
    public String decrypt(String messageToBeEncrypted, int offset) {
        char[] charArray = messageToBeEncrypted.toCharArray();
        char[] newArray = new char[charArray.length];
        String encryptedMessage = "";
        for (int i = 0; i < charArray.length; i++) {
            int charSetIndex = Constants.CHARACTER_SET.indexOf(charArray[i]);
            if (charSetIndex < offset) {
                charSetIndex -= offset;
                charSetIndex += Constants.CHARACTER_SET.length();
                newArray[i] = Constants.CHARACTER_SET.charAt(charSetIndex);
            } else {
                newArray[i] = Constants.CHARACTER_SET.charAt(Constants.CHARACTER_SET.indexOf(charArray[i]) - offset);
            }
        }
        for (int j = 0; j < charArray.length; j++) {
            encryptedMessage += newArray[j];
        }
        return encryptedMessage;
    }

}
