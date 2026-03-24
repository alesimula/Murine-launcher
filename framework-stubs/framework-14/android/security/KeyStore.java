package android.security;

public class KeyStore {
    public static final int NO_ERROR = 1;
    public static final int UID_SELF = -1;
    public KeyStore() {}
    public static android.security.KeyStore getInstance() { return null; }
    public android.security.KeyStore.State state(int p0) { return null; }
    public android.security.KeyStore.State state() { return null; }
    public byte[] get(java.lang.String p0) { return null; }
    public boolean delete(java.lang.String p0) { return false; }
    public int[] listUidsOfAuthBoundKeys() { return null; }
    public boolean unlock(java.lang.String p0) { return false; }
    public boolean isEmpty() { return false; }
    public int addAuthToken(byte[] p0) { return 0; }
    public void onDeviceOffBody() {}
    public static android.security.KeyStoreException getKeyStoreException(int p0) { return null; }

    public static enum State {
        UNLOCKED,
        LOCKED,
        UNINITIALIZED;
    }
}
