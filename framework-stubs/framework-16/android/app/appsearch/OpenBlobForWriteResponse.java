package android.app.appsearch;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_blob_store")
public final class OpenBlobForWriteResponse implements java.io.Closeable, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.OpenBlobForWriteResponse> CREATOR = null;
    public OpenBlobForWriteResponse(android.app.appsearch.AppSearchBatchResult<android.app.appsearch.AppSearchBlobHandle, android.os.ParcelFileDescriptor> p0) {}
    public void close() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.app.appsearch.AppSearchBatchResult<android.app.appsearch.AppSearchBlobHandle, android.os.ParcelFileDescriptor> getResult() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
