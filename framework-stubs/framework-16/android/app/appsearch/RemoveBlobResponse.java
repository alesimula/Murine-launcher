package android.app.appsearch;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
public final class RemoveBlobResponse implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.RemoveBlobResponse> CREATOR = null;
    public RemoveBlobResponse(android.app.appsearch.AppSearchBatchResult<android.app.appsearch.AppSearchBlobHandle, java.lang.Void> p0) {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.app.appsearch.AppSearchBatchResult<android.app.appsearch.AppSearchBlobHandle, java.lang.Void> getResult() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
