class DecryptedString {
  private String unencryted;

  public DecryptedString(String unencryted) {
  this.unencryted = unencryted;
  }

  public String getUnencryted() {
  return unencryted;
  }

  public EncryptedString encrypt(Encrypter encrypter) {
  return new EncryptedString(encrypter.encrypt(unencryted));
  }
}
