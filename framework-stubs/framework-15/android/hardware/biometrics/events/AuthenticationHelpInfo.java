package android.hardware.biometrics.events;

public final class AuthenticationHelpInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.events.AuthenticationHelpInfo> CREATOR = null;
    AuthenticationHelpInfo(android.hardware.biometrics.BiometricSourceType p0, int p1, java.lang.String p2, int p3) {}
    @android.annotation.NonNull
    public android.hardware.biometrics.BiometricSourceType getBiometricSourceType() { return null; }
    public int getRequestReason() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getHelpString() { return null; }
    public int getHelpCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AuthenticationHelpInfo(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(android.hardware.biometrics.BiometricSourceType p0, int p1, java.lang.String p2, int p3) {}
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationHelpInfo.Builder setBiometricSourceType(android.hardware.biometrics.BiometricSourceType p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationHelpInfo.Builder setRequestReason(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationHelpInfo.Builder setHelpString(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationHelpInfo.Builder setHelpCode(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationHelpInfo build() { return null; }
    }
}
