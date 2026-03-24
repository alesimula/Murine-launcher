package android.security;

public class SystemKeyStore {
    private static final java.lang.String SYSTEM_KEYSTORE_DIRECTORY = "misc/systemkeys";
    private static final java.lang.String KEY_FILE_EXTENSION = ".sks";
    private static android.security.SystemKeyStore mInstance;
    private SystemKeyStore() {}
    public static android.security.SystemKeyStore getInstance() { return null; }
    public static java.lang.String toHexString(byte[] p0) { return null; }
    public java.lang.String generateNewKeyHexString(int p0, java.lang.String p1, java.lang.String p2) throws java.security.NoSuchAlgorithmException { return null; }
    public byte[] generateNewKey(int p0, java.lang.String p1, java.lang.String p2) throws java.security.NoSuchAlgorithmException { return null; }
    private java.io.File getKeyFile(java.lang.String p0) { return null; }
    public java.lang.String retrieveKeyHexString(java.lang.String p0) throws java.io.IOException { return null; }
    public byte[] retrieveKey(java.lang.String p0) throws java.io.IOException { return null; }
    public void deleteKey(java.lang.String p0) {}
}
