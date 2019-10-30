public class Decrypter {
    public String decrypterrrrr(String messageToBeEncrypted, int offset){
        String encryptedMessage;
char[] charArray = messageToBeEncrypted.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char[] newArray = new char[charArray.length];
            int deferal = (charArray[i] + offset)%95;

        }
        return encryptedMessage;
    }

}
