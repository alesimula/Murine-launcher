package android.security.keystore.recovery;

@android.annotation.SystemApi
public final class WrappedApplicationKey implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.security.keystore.recovery.WrappedApplicationKey> CREATOR = null;
    @java.lang.Deprecated
    public WrappedApplicationKey(java.lang.String p0, byte[] p1) {}
    @android.annotation.NonNull
    public java.lang.String getAlias() { return null; }
    @android.annotation.NonNull
    public byte[] getEncryptedKeyMaterial() { return null; }
    @android.annotation.Nullable
    public byte[] getMetadata() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected WrappedApplicationKey(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.security.keystore.recovery.WrappedApplicationKey.Builder setAlias(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.WrappedApplicationKey.Builder setEncryptedKeyMaterial(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.WrappedApplicationKey.Builder setMetadata(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.WrappedApplicationKey build() { return null; }
    }
}
