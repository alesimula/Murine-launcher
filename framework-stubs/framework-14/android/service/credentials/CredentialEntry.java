package android.service.credentials;

public final class CredentialEntry implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.credentials.CredentialEntry> CREATOR = null;
    public CredentialEntry(java.lang.String p0, java.lang.String p1, android.app.slice.Slice p2) {}
    public CredentialEntry(android.service.credentials.BeginGetCredentialOption p0, android.app.slice.Slice p1) {}
    public CredentialEntry(java.lang.String p0, android.app.slice.Slice p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getBeginGetCredentialOptionId() { return null; }
    public java.lang.String getType() { return null; }
    public android.app.slice.Slice getSlice() { return null; }
}
