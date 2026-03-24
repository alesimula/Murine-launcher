package android.net.wifi.aware;

public final class SubscribeConfig implements android.os.Parcelable {
    public static final int SUBSCRIBE_TYPE_PASSIVE = 0;
    public static final int SUBSCRIBE_TYPE_ACTIVE = 1;
    public final byte[] mServiceName = null;
    public final byte[] mServiceSpecificInfo = null;
    public final byte[] mMatchFilter = null;
    public final int mSubscribeType = 0;
    public final int mTtlSec = 0;
    public final boolean mEnableTerminateNotification = false;
    public final boolean mMinDistanceMmSet = false;
    public final int mMinDistanceMm = 0;
    public final boolean mMaxDistanceMmSet = false;
    public final int mMaxDistanceMm = 0;
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.SubscribeConfig> CREATOR = null;
    public SubscribeConfig(byte[] p0, byte[] p1, byte[] p2, int p3, int p4, boolean p5, boolean p6, int p7, boolean p8, int p9) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void assertValid(android.net.wifi.aware.Characteristics p0, boolean p1) throws java.lang.IllegalArgumentException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubscribeTypes {
    }

    public static final class Builder {
        private byte[] mServiceName;
        private byte[] mServiceSpecificInfo;
        private byte[] mMatchFilter;
        private int mSubscribeType;
        private int mTtlSec;
        private boolean mEnableTerminateNotification;
        private boolean mMinDistanceMmSet;
        private int mMinDistanceMm;
        private boolean mMaxDistanceMmSet;
        private int mMaxDistanceMm;
        public Builder() {}
        public android.net.wifi.aware.SubscribeConfig.Builder setServiceName(java.lang.String p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setServiceSpecificInfo(byte[] p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMatchFilter(java.util.List<byte[]> p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setSubscribeType(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setTtlSec(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setTerminateNotificationEnabled(boolean p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMinDistanceMm(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMaxDistanceMm(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig build() { return null; }
    }
}
