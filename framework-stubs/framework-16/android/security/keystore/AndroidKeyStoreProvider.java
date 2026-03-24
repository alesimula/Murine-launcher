package android.security.keystore;

@android.annotation.SystemApi
public class AndroidKeyStoreProvider extends java.security.Provider {
    public AndroidKeyStoreProvider(java.lang.String p0) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null); }
    public static long getKeyStoreOperationHandle(java.lang.Object p0) { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public static java.security.KeyStore getKeyStoreForUid(int p0) throws java.security.KeyStoreException, java.security.NoSuchProviderException { return null; }
}
