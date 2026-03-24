package android.security.attestationverification;

public final class VerificationToken implements android.os.Parcelable {
    static com.android.internal.util.Parcelling<java.time.Instant> sParcellingForVerificationTime;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.security.attestationverification.VerificationToken> CREATOR = null;
    VerificationToken(android.security.attestationverification.AttestationProfile p0, int p1, android.os.Bundle p2, int p3, java.time.Instant p4, byte[] p5, int p6) {}
    @android.annotation.NonNull
    public android.security.attestationverification.AttestationProfile getAttestationProfile() { return null; }
    public int getLocalBindingType() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getRequirements() { return null; }
    public int getVerificationResult() { return 0; }
    @android.annotation.NonNull
    public java.time.Instant getVerificationTime() { return null; }
    @android.annotation.NonNull
    public byte[] getHmac() { return null; }
    public int getUid() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    VerificationToken(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(android.security.attestationverification.AttestationProfile p0, int p1, android.os.Bundle p2, int p3, java.time.Instant p4, byte[] p5, int p6) {}
        @android.annotation.NonNull
        public android.security.attestationverification.VerificationToken.Builder setAttestationProfile(android.security.attestationverification.AttestationProfile p0) { return null; }
        @android.annotation.NonNull
        public android.security.attestationverification.VerificationToken.Builder setLocalBindingType(int p0) { return null; }
        @android.annotation.NonNull
        public android.security.attestationverification.VerificationToken.Builder setRequirements(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.security.attestationverification.VerificationToken.Builder setVerificationResult(int p0) { return null; }
        @android.annotation.NonNull
        public android.security.attestationverification.VerificationToken.Builder setVerificationTime(java.time.Instant p0) { return null; }
        @android.annotation.NonNull
        public android.security.attestationverification.VerificationToken.Builder setHmac(byte... p0) { return null; }
        @android.annotation.NonNull
        public android.security.attestationverification.VerificationToken.Builder setUid(int p0) { return null; }
        @android.annotation.NonNull
        public android.security.attestationverification.VerificationToken build() { return null; }
    }
}
