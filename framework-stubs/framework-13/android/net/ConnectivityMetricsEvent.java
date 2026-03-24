package android.net;

public final class ConnectivityMetricsEvent implements android.os.Parcelable {
    public long timestamp;
    public long transports;
    public int netId;
    public java.lang.String ifname;
    public android.os.Parcelable data;
    public static final android.os.Parcelable.Creator<android.net.ConnectivityMetricsEvent> CREATOR = null;
    public ConnectivityMetricsEvent() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
