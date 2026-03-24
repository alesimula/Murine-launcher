package android.hardware.fingerprint;

public final class FingerprintAuthenticateOptions implements android.hardware.biometrics.AuthenticateOptions, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.fingerprint.FingerprintAuthenticateOptions> CREATOR = null;
    FingerprintAuthenticateOptions(int p0, int p1, boolean p2, int p3, java.lang.String p4, java.lang.String p5, android.hardware.biometrics.common.AuthenticateReason.Vendor p6) {}
    public int getUserId() { return 0; }
    public int getSensorId() { return 0; }
    public boolean isIgnoreEnrollmentState() { return false; }
    public int getDisplayState() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getOpPackageName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getAttributionTag() { return null; }
    @android.annotation.Nullable
    public android.hardware.biometrics.common.AuthenticateReason.Vendor getVendorReason() { return null; }
    @android.annotation.NonNull
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setSensorId(int p0) { return null; }
    @android.annotation.NonNull
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setOpPackageName(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setAttributionTag(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public android.hardware.fingerprint.FingerprintAuthenticateOptions setVendorReason(android.hardware.biometrics.common.AuthenticateReason.Vendor p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    FingerprintAuthenticateOptions(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setUserId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setSensorId(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setIgnoreEnrollmentState(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setDisplayState(int p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setOpPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setAttributionTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.fingerprint.FingerprintAuthenticateOptions.Builder setVendorReason(android.hardware.biometrics.common.AuthenticateReason.Vendor p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.fingerprint.FingerprintAuthenticateOptions build() { return null; }
    }
}
