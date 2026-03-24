package android.net;

@java.lang.Deprecated
@android.annotation.SystemApi
public class RssiCurve implements android.os.Parcelable {
    public final int start = 0;
    public final int bucketWidth = 0;
    public final byte[] rssiBuckets = null;
    public final int activeNetworkRssiBoost = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.RssiCurve> CREATOR = null;
    public RssiCurve(int p0, int p1, byte[] p2) {}
    public RssiCurve(int p0, int p1, byte[] p2, int p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public byte lookupScore(int p0) { return 0; }
    public byte lookupScore(int p0, boolean p1) { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}
