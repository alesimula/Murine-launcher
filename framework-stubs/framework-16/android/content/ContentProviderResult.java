package android.content;

public class ContentProviderResult implements android.os.Parcelable {
    @android.annotation.Nullable
    public final android.net.Uri uri = null;
    @android.annotation.Nullable
    public final java.lang.Integer count = null;
    @android.annotation.Nullable
    public final android.os.Bundle extras = null;
    @android.annotation.Nullable
    public final java.lang.Throwable exception = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.ContentProviderResult> CREATOR = null;
    public ContentProviderResult(android.net.Uri p0) {}
    public ContentProviderResult(int p0) {}
    public ContentProviderResult(android.os.Bundle p0) {}
    public ContentProviderResult(java.lang.Throwable p0) {}
    public ContentProviderResult(android.net.Uri p0, java.lang.Integer p1, android.os.Bundle p2, java.lang.Throwable p3) {}
    public ContentProviderResult(android.os.Parcel p0) {}
    public ContentProviderResult(android.content.ContentProviderResult p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
}
