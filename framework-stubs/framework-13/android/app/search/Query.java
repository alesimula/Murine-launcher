package android.app.search;

@android.annotation.SystemApi
public final class Query implements android.os.Parcelable {
    public static final java.lang.String EXTRA_IME_HEIGHT = "android.app.search.extra.IME_HEIGHT";
    public static final android.os.Parcelable.Creator<android.app.search.Query> CREATOR = null;
    public Query(java.lang.String p0, long p1, android.os.Bundle p2) {}
    public Query(java.lang.String p0, long p1) {}
    public java.lang.String getInput() { return null; }
    @java.lang.Deprecated
    public long getTimestamp() { return 0L; }
    public long getTimestampMillis() { return 0L; }
    public android.os.Bundle getExtras() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
