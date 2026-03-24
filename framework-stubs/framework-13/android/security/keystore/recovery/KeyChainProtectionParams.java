package android.security.keystore.recovery;

@android.annotation.SystemApi
public final class KeyChainProtectionParams implements android.os.Parcelable {
    public static final int TYPE_LOCKSCREEN = 100;
    public static final int UI_FORMAT_PIN = 1;
    public static final int UI_FORMAT_PASSWORD = 2;
    public static final int UI_FORMAT_PATTERN = 3;
    public static final android.os.Parcelable.Creator<android.security.keystore.recovery.KeyChainProtectionParams> CREATOR = null;
    public int getUserSecretType() { return 0; }
    public int getLockScreenUiFormat() { return 0; }
    public android.security.keystore.recovery.KeyDerivationParams getKeyDerivationParams() { return null; }
    public byte[] getSecret() { return null; }
    public void clearSecret() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected KeyChainProtectionParams(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class Builder {
        public Builder() {}
        public android.security.keystore.recovery.KeyChainProtectionParams.Builder setUserSecretType(int p0) { return null; }
        public android.security.keystore.recovery.KeyChainProtectionParams.Builder setLockScreenUiFormat(int p0) { return null; }
        public android.security.keystore.recovery.KeyChainProtectionParams.Builder setKeyDerivationParams(android.security.keystore.recovery.KeyDerivationParams p0) { return null; }
        public android.security.keystore.recovery.KeyChainProtectionParams.Builder setSecret(byte[] p0) { return null; }
        public android.security.keystore.recovery.KeyChainProtectionParams build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LockScreenUiFormat {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UserSecretType {
    }
}
