public class EncryptionExercise {
    public static void main(String[] args) {
        DecryptedString original = new DecryptedString("Secret message of unbelievable importance");
        Encrypter encrypter = (String input) -> {
            char[] chars = input.toCharArray();
            char[] reversed = reverse(chars);
            return new String(reversed).getBytes();
        };
        EncryptedString encrypted = original.encrypt(encrypter);

        Decrypter decrypter = (byte[] input) -> {
            char[] encryptedChars = new String(input).toCharArray();
            char[] reversedBack = reverse(encryptedChars);
            return new String(reversedBack);
        };
        DecryptedString decrypted = encrypted.decrypt(decrypter);

        System.out.println(decrypted.getUnencryted());
    }
}
