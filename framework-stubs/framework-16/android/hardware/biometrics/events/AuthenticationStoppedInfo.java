package android.hardware.biometrics.events;

public final class AuthenticationStoppedInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.events.AuthenticationStoppedInfo> CREATOR = null;
    AuthenticationStoppedInfo(android.hardware.biometrics.BiometricSourceType p0, int p1) {}
    @android.annotation.NonNull
    public android.hardware.biometrics.BiometricSourceType getBiometricSourceType() { return null; }
    public int getRequestReason() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AuthenticationStoppedInfo(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(android.hardware.biometrics.BiometricSourceType p0, int p1) {}
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationStoppedInfo.Builder setBiometricSourceType(android.hardware.biometrics.BiometricSourceType p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationStoppedInfo.Builder setRequestReason(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationStoppedInfo build() { return null; }
    }
}
