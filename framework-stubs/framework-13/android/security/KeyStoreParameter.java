package android.security;

@java.lang.Deprecated
public final class KeyStoreParameter implements java.security.KeyStore.ProtectionParameter {
    public int getFlags() { return 0; }
    @java.lang.Deprecated
    public boolean isEncryptionRequired() { return false; }

    @java.lang.Deprecated
    public static final class Builder {
        public Builder(android.content.Context p0) {}
        public android.security.KeyStoreParameter.Builder setEncryptionRequired(boolean p0) { return null; }
        public android.security.KeyStoreParameter build() { return null; }
    }
}
