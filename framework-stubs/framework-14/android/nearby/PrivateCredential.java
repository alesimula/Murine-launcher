package android.nearby;

public final class PrivateCredential extends android.nearby.PresenceCredential implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nearby.PrivateCredential> CREATOR = null;
    PrivateCredential() { super(); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public byte[] getMetadataEncryptionKey() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDeviceName() { return null; }

    public static final class Builder {
        public Builder(byte[] p0, byte[] p1, byte[] p2, java.lang.String p3) {}
        @android.annotation.NonNull
        public android.nearby.PrivateCredential.Builder setIdentityType(int p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PrivateCredential.Builder addCredentialElement(android.nearby.CredentialElement p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.PrivateCredential build() { return null; }
    }
}
