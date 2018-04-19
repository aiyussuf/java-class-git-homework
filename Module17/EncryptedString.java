
class EncryptedString {
  private byte[] encrypted;

  public EncryptedString(byte[] encrypted) {
  this.encrypted = encrypted;
  }

  public DecryptedString decrypt(Decrypter decrypter) {
  return new DecryptedString(decrypter.decrypt(encrypted));
  }
}
