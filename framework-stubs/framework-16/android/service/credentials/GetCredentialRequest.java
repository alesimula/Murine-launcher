package android.service.credentials;

public final class GetCredentialRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.credentials.GetCredentialRequest> CREATOR = null;
    public GetCredentialRequest(android.service.credentials.CallingAppInfo p0, java.util.List<android.credentials.CredentialOption> p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public android.service.credentials.CallingAppInfo getCallingAppInfo() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.credentials.CredentialOption> getCredentialOptions() { return null; }
}
