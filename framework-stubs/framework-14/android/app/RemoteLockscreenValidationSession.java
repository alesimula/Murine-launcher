package android.app;

@android.annotation.SystemApi
public final class RemoteLockscreenValidationSession implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.RemoteLockscreenValidationSession> CREATOR = null;
    @android.app.KeyguardManager.LockTypes
    public int getLockType() { return 0; }
    public byte[] getSourcePublicKey() { return null; }
    public int getRemainingAttempts() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.app.RemoteLockscreenValidationSession.Builder setLockType(int p0) { return null; }
        public android.app.RemoteLockscreenValidationSession.Builder setSourcePublicKey(byte[] p0) { return null; }
        public android.app.RemoteLockscreenValidationSession.Builder setRemainingAttempts(int p0) { return null; }
        public android.app.RemoteLockscreenValidationSession build() { return null; }
    }
}
