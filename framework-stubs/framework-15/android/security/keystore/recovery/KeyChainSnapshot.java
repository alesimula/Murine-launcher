package android.security.keystore.recovery;

@android.annotation.SystemApi
public final class KeyChainSnapshot implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.security.keystore.recovery.KeyChainSnapshot> CREATOR = null;
    public int getSnapshotVersion() { return 0; }
    public int getMaxAttempts() { return 0; }
    public long getCounterId() { return 0L; }
    @android.annotation.NonNull
    public byte[] getServerParams() { return null; }
    @android.annotation.NonNull
    public java.security.cert.CertPath getTrustedHardwareCertPath() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> getKeyChainProtectionParams() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.security.keystore.recovery.WrappedApplicationKey> getWrappedApplicationKeys() { return null; }
    @android.annotation.NonNull
    public byte[] getEncryptedRecoveryKeyBlob() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected KeyChainSnapshot(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setSnapshotVersion(int p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setMaxAttempts(int p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setCounterId(long p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setServerParams(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setTrustedHardwareCertPath(java.security.cert.CertPath p0) throws java.security.cert.CertificateException { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setKeyChainProtectionParams(java.util.List<android.security.keystore.recovery.KeyChainProtectionParams> p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setWrappedApplicationKeys(java.util.List<android.security.keystore.recovery.WrappedApplicationKey> p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot.Builder setEncryptedRecoveryKeyBlob(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.security.keystore.recovery.KeyChainSnapshot build() { return null; }
    }
}
