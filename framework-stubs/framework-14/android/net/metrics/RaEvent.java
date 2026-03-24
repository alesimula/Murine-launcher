package android.net.metrics;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class RaEvent implements android.net.metrics.IpConnectivityLog.Event {
    public final long routerLifetime = 0L;
    public final long prefixValidLifetime = 0L;
    public final long prefixPreferredLifetime = 0L;
    public final long routeInfoLifetime = 0L;
    public final long rdnssLifetime = 0L;
    public final long dnsslLifetime = 0L;
    public static final android.os.Parcelable.Creator<android.net.metrics.RaEvent> CREATOR = null;
    public RaEvent(long p0, long p1, long p2, long p3, long p4, long p5) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        long routerLifetime;
        long prefixValidLifetime;
        long prefixPreferredLifetime;
        long routeInfoLifetime;
        long rdnssLifetime;
        long dnsslLifetime;
        public Builder() {}
        public android.net.metrics.RaEvent build() { return null; }
        public android.net.metrics.RaEvent.Builder updateRouterLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updatePrefixValidLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updatePrefixPreferredLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updateRouteInfoLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updateRdnssLifetime(long p0) { return null; }
        public android.net.metrics.RaEvent.Builder updateDnsslLifetime(long p0) { return null; }
    }
}
