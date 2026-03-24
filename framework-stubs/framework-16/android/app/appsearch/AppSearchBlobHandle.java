package android.app.appsearch;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
public final class AppSearchBlobHandle implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.AppSearchBlobHandle> CREATOR = null;
    AppSearchBlobHandle() {}
    @android.annotation.NonNull
    public static android.app.appsearch.AppSearchBlobHandle createWithSha256(byte[] p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getDatabaseName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getNamespace() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public byte[] getSha256Digest() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
