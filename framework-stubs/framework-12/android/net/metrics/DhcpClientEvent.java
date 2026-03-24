package android.net.metrics;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class DhcpClientEvent implements android.net.metrics.IpConnectivityLog.Event {
    public final java.lang.String msg = null;
    public final int durationMs = 0;
    public static final android.os.Parcelable.Creator<android.net.metrics.DhcpClientEvent> CREATOR = null;
    private DhcpClientEvent(java.lang.String p0, int p1) {}
    private DhcpClientEvent(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        private java.lang.String mMsg;
        private int mDurationMs;
        public Builder() {}
        public android.net.metrics.DhcpClientEvent.Builder setMsg(java.lang.String p0) { return null; }
        public android.net.metrics.DhcpClientEvent.Builder setDurationMs(int p0) { return null; }
        public android.net.metrics.DhcpClientEvent build() { return null; }
    }
}
