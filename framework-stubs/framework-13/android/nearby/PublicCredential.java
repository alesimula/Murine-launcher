package android.nearby;

public final class PublicCredential extends android.nearby.PresenceCredential implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nearby.PublicCredential> CREATOR = null;
    @android.annotation.NonNull
    public byte[] getPublicKey() { return null; }
    @android.annotation.NonNull
    public byte[] getEncryptedMetadata() { return null; }
    @android.annotation.NonNull
    public byte[] getEncryptedMetadataKeyTag() { return null; }
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(byte[] p0, byte[] p1, byte[] p2, byte[] p3, byte[] p4) {}
        @android.annotation.NonNull
        public android.nearby.PublicCredential.Builder setIdentityType(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PublicCredential.Builder addCredentialElement(android.nearby.CredentialElement p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PublicCredential build() { return null; }
    }
}
