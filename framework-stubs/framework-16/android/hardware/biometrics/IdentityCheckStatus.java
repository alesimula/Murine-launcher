package android.hardware.biometrics;

@android.annotation.FlaggedApi("android.hardware.biometrics.identity_check_test_api")
public final class IdentityCheckStatus implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.IdentityCheckStatus> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isIdentityCheckValueForTestAvailable() { return false; }
    public boolean isIdentityCheckActive() { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.biometrics.IdentityCheckStatus.Builder setIdentityCheckActive(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.IdentityCheckStatus.Builder setIdentityCheckValueForTestAvailable(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.IdentityCheckStatus build() { return null; }
    }
}
