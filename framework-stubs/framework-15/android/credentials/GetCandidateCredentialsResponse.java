package android.credentials;

@android.annotation.Hide
public final class GetCandidateCredentialsResponse implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.credentials.GetCandidateCredentialsResponse> CREATOR = null;
    @android.annotation.Hide
    public GetCandidateCredentialsResponse(java.util.List<android.credentials.selection.GetCredentialProviderData> p0, android.content.Intent p1, android.content.ComponentName p2) {}
    public java.util.List<android.credentials.selection.GetCredentialProviderData> getCandidateProviderDataList() { return null; }
    @android.annotation.Nullable
    public android.content.ComponentName getPrimaryProviderComponentName() { return null; }
    @android.annotation.NonNull
    public android.content.Intent getIntent() { return null; }
    protected GetCandidateCredentialsResponse(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
}
