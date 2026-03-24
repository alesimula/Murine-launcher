package android.net.metrics;

@java.lang.Deprecated
@android.annotation.SystemApi
public final class ApfProgramEvent implements android.net.metrics.IpConnectivityLog.Event {
    public static final int FLAG_MULTICAST_FILTER_ON = 0;
    public static final int FLAG_HAS_IPV4_ADDRESS = 1;
    public final long lifetime = 0L;
    public final long actualLifetime = 0L;
    public final int filteredRas = 0;
    public final int currentRas = 0;
    public final int programLength = 0;
    public final int flags = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.metrics.ApfProgramEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public static int flagsFor(boolean p0, boolean p1) { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.metrics.ApfProgramEvent.Builder setLifetime(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.metrics.ApfProgramEvent.Builder setActualLifetime(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.metrics.ApfProgramEvent.Builder setFilteredRas(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.metrics.ApfProgramEvent.Builder setCurrentRas(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.metrics.ApfProgramEvent.Builder setProgramLength(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.metrics.ApfProgramEvent.Builder setFlags(boolean p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.net.metrics.ApfProgramEvent build() { return null; }
    }

    static final class Decoder {
        static final android.util.SparseArray<java.lang.String> constants = null;
        Decoder() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
