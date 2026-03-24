package android.app.search;

@android.annotation.SystemApi
public final class SearchContext implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.search.SearchContext> CREATOR = null;
    public SearchContext(int p0, int p1) {}
    public SearchContext(int p0, int p1, android.os.Bundle p2) {}
    @android.annotation.Nullable
    public java.lang.String getPackageName() { return null; }
    void setPackageName(java.lang.String p0) {}
    @android.annotation.NonNull
    public int getTimeoutMillis() { return 0; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.NonNull
    public int getResultTypes() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
