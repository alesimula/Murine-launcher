package android.net;

public final class DataUsageRequest implements android.os.Parcelable {
    public static final java.lang.String PARCELABLE_KEY = "DataUsageRequest";
    public static final int REQUEST_ID_UNSET = 0;
    public final int requestId = 0;
    public final android.net.NetworkTemplate template = null;
    public final long thresholdInBytes = 0L;
    public static final android.os.Parcelable.Creator<android.net.DataUsageRequest> CREATOR = null;
    public DataUsageRequest(int p0, android.net.NetworkTemplate p1, long p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
