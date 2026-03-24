package android.media.metrics;

public final class NetworkEvent extends android.media.metrics.Event implements android.os.Parcelable {
    public static final int NETWORK_TYPE_UNKNOWN = 0;
    public static final int NETWORK_TYPE_OTHER = 1;
    public static final int NETWORK_TYPE_WIFI = 2;
    public static final int NETWORK_TYPE_ETHERNET = 3;
    public static final int NETWORK_TYPE_2G = 4;
    public static final int NETWORK_TYPE_3G = 5;
    public static final int NETWORK_TYPE_4G = 6;
    public static final int NETWORK_TYPE_5G_NSA = 7;
    public static final int NETWORK_TYPE_5G_SA = 8;
    public static final int NETWORK_TYPE_OFFLINE = 9;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.metrics.NetworkEvent> CREATOR = null;
    public static java.lang.String networkTypeToString(int p0) { return null; }
    public int getNetworkType() { return 0; }
    public long getTimeSinceCreatedMillis() { return 0L; }
    @android.annotation.NonNull
    public android.os.Bundle getMetricsBundle() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.metrics.NetworkEvent.Builder setNetworkType(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.NetworkEvent.Builder setTimeSinceCreatedMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.NetworkEvent.Builder setMetricsBundle(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.media.metrics.NetworkEvent build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkType {
    }
}
