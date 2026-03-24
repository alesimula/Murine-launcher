package android.hardware.biometrics.events;

public final class AuthenticationSucceededInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.events.AuthenticationSucceededInfo> CREATOR = null;
    AuthenticationSucceededInfo(android.hardware.biometrics.BiometricSourceType p0, int p1, boolean p2, int p3) {}
    @android.annotation.NonNull
    public android.hardware.biometrics.BiometricSourceType getBiometricSourceType() { return null; }
    public int getRequestReason() { return 0; }
    public boolean isIsStrongBiometric() { return false; }
    public int getUserId() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    AuthenticationSucceededInfo(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(android.hardware.biometrics.BiometricSourceType p0, int p1, boolean p2, int p3) {}
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationSucceededInfo.Builder setBiometricSourceType(android.hardware.biometrics.BiometricSourceType p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationSucceededInfo.Builder setRequestReason(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationSucceededInfo.Builder setIsStrongBiometric(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationSucceededInfo.Builder setUserId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.events.AuthenticationSucceededInfo build() { return null; }
    }
}
