package android.hardware.biometrics.events;

public final class AuthenticationErrorInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.events.AuthenticationErrorInfo> CREATOR = null;
    AuthenticationErrorInfo(android.hardware.biometrics.BiometricSourceType p0, int p1, java.lang.String p2, int p3) {}
    @android.annotation.NonNull
    public android.hardware.biometrics.BiometricSourceType getBiometricSourceType() { return null; }
    public int getRequestReason() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getErrString() { return null; }
    public int getErrCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AuthenticationErrorInfo(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(android.hardware.biometrics.BiometricSourceType p0, int p1, java.lang.String p2, int p3) {}
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationErrorInfo.Builder setBiometricSourceType(android.hardware.biometrics.BiometricSourceType p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationErrorInfo.Builder setRequestReason(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationErrorInfo.Builder setErrString(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationErrorInfo.Builder setErrCode(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationErrorInfo build() { return null; }
    }
}
