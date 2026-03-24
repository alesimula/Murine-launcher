package android.net.wifi.aware;

public final class PublishConfig implements android.os.Parcelable {
    public static final int PUBLISH_TYPE_UNSOLICITED = 0;
    public static final int PUBLISH_TYPE_SOLICITED = 1;
    public final byte[] mServiceName = null;
    public final byte[] mServiceSpecificInfo = null;
    public final byte[] mMatchFilter = null;
    public final int mPublishType = 0;
    public final int mTtlSec = 0;
    public final boolean mEnableTerminateNotification = false;
    public final boolean mEnableRanging = false;
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.PublishConfig> CREATOR = null;
    public PublishConfig(byte[] p0, byte[] p1, byte[] p2, int p3, int p4, boolean p5, boolean p6) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void assertValid(android.net.wifi.aware.Characteristics p0, boolean p1) throws java.lang.IllegalArgumentException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PublishTypes {
    }

    public static final class Builder {
        private byte[] mServiceName;
        private byte[] mServiceSpecificInfo;
        private byte[] mMatchFilter;
        private int mPublishType;
        private int mTtlSec;
        private boolean mEnableTerminateNotification;
        private boolean mEnableRanging;
        public Builder() {}
        public android.net.wifi.aware.PublishConfig.Builder setServiceName(java.lang.String p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setServiceSpecificInfo(byte[] p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setMatchFilter(java.util.List<byte[]> p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setPublishType(int p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setTtlSec(int p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setTerminateNotificationEnabled(boolean p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setRangingEnabled(boolean p0) { return null; }
        public android.net.wifi.aware.PublishConfig build() { return null; }
    }
}
