package android.net.metrics;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class ValidationProbeEvent implements android.net.metrics.IpConnectivityLog.Event {
    public static final int PROBE_DNS = 0;
    public static final int PROBE_HTTP = 1;
    public static final int PROBE_HTTPS = 2;
    public static final int PROBE_PAC = 3;
    public static final int PROBE_FALLBACK = 4;
    public static final int PROBE_PRIVDNS = 5;
    public static final int DNS_FAILURE = 0;
    public static final int DNS_SUCCESS = 1;
    private static final int FIRST_VALIDATION = 256;
    private static final int REVALIDATION = 512;
    public final long durationMs = 0L;
    public final int probeType = 0;
    public final int returnCode = 0;
    public static final android.os.Parcelable.Creator<android.net.metrics.ValidationProbeEvent> CREATOR = null;
    private ValidationProbeEvent(long p0, int p1, int p2) {}
    private ValidationProbeEvent(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    private static int makeProbeType(int p0, boolean p1) { return 0; }
    public static java.lang.String getProbeName(int p0) { return null; }
    private static java.lang.String getValidationStage(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        private long mDurationMs;
        private int mProbeType;
        private int mReturnCode;
        public Builder() {}
        public android.net.metrics.ValidationProbeEvent.Builder setDurationMs(long p0) { return null; }
        public android.net.metrics.ValidationProbeEvent.Builder setProbeType(int p0, boolean p1) { return null; }
        public android.net.metrics.ValidationProbeEvent.Builder setReturnCode(int p0) { return null; }
        public android.net.metrics.ValidationProbeEvent build() { return null; }
    }

    static final class Decoder {
        static final android.util.SparseArray<java.lang.String> constants = null;
        Decoder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReturnCode {
    }
}
