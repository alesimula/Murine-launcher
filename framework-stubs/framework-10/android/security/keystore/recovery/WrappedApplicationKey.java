package android.security.keystore.recovery;

@android.annotation.SystemApi
public final class WrappedApplicationKey implements android.os.Parcelable {
    private java.lang.String mAlias;
    private byte[] mEncryptedKeyMaterial;
    private byte[] mMetadata;
    public static final android.os.Parcelable.Creator<android.security.keystore.recovery.WrappedApplicationKey> CREATOR = null;
    private WrappedApplicationKey() {}
    @java.lang.Deprecated
    public WrappedApplicationKey(java.lang.String p0, byte[] p1) {}
    public java.lang.String getAlias() { return null; }
    public byte[] getEncryptedKeyMaterial() { return null; }
    public byte[] getMetadata() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected WrappedApplicationKey(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class Builder {
        private android.security.keystore.recovery.WrappedApplicationKey mInstance;
        public Builder() {}
        public android.security.keystore.recovery.WrappedApplicationKey.Builder setAlias(java.lang.String p0) { return null; }
        public android.security.keystore.recovery.WrappedApplicationKey.Builder setEncryptedKeyMaterial(byte[] p0) { return null; }
        public android.security.keystore.recovery.WrappedApplicationKey.Builder setMetadata(byte[] p0) { return null; }
        public android.security.keystore.recovery.WrappedApplicationKey build() { return null; }
    }
}
