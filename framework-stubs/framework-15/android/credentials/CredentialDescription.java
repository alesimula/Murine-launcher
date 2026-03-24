package android.credentials;

public final class CredentialDescription implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.CredentialDescription> CREATOR = null;
    public CredentialDescription(java.lang.String p0, java.util.Set<java.lang.String> p1, java.util.List<android.service.credentials.CredentialEntry> p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String getType() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getSupportedElementKeys() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.service.credentials.CredentialEntry> getCredentialEntries() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
