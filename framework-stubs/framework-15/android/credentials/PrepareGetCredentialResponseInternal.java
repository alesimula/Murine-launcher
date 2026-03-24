package android.credentials;

public final class PrepareGetCredentialResponseInternal implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.credentials.PrepareGetCredentialResponseInternal> CREATOR = null;
    @android.annotation.Nullable
    public android.app.PendingIntent getPendingIntent() { return null; }
    @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public boolean hasCredentialResults(java.lang.String p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public boolean hasAuthenticationResults() { return false; }
    @android.annotation.RequiresPermission("android.permission.CREDENTIAL_MANAGER_QUERY_CANDIDATE_CREDENTIALS")
    public boolean hasRemoteResults() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public PrepareGetCredentialResponseInternal(boolean p0, java.util.Set<java.lang.String> p1, boolean p2, boolean p3, android.app.PendingIntent p4) {}
}
