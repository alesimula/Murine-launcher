package android.telephony.data;

@android.annotation.SystemApi
public final class ThrottleStatus implements android.os.Parcelable {
    public static final int THROTTLE_TYPE_NONE = 1;
    public static final int THROTTLE_TYPE_ELAPSED_TIME = 2;
    public static final int RETRY_TYPE_NONE = 1;
    public static final int RETRY_TYPE_NEW_CONNECTION = 2;
    public static final int RETRY_TYPE_HANDOVER = 3;
    private final int mSlotIndex = 0;
    private final int mTransportType = 0;
    private final int mApnType = 0;
    private final long mThrottleExpiryTimeMillis = 0L;
    @android.telephony.data.ThrottleStatus.RetryType
    private final int mRetryType = 0;
    @android.telephony.data.ThrottleStatus.ThrottleType
    private final int mThrottleType = 0;
    public static final android.os.Parcelable.Creator<android.telephony.data.ThrottleStatus> CREATOR = null;
    public int getSlotIndex() { return 0; }
    public int getTransportType() { return 0; }
    public int getApnType() { return 0; }
    @android.telephony.data.ThrottleStatus.ThrottleType
    public int getThrottleType() { return 0; }
    @android.telephony.data.ThrottleStatus.RetryType
    public int getRetryType() { return 0; }
    public long getThrottleExpiryTimeMillis() { return 0L; }
    private ThrottleStatus(int p0, int p1, int p2, int p3, long p4, int p5) {}
    private ThrottleStatus(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mSlotIndex;
        private int mTransportType;
        private int mApnType;
        private long mThrottleExpiryTimeMillis;
        @android.telephony.data.ThrottleStatus.RetryType
        private int mRetryType;
        @android.telephony.data.ThrottleStatus.ThrottleType
        private int mThrottleType;
        public static final long NO_THROTTLE_EXPIRY_TIME = -1L;
        public Builder() {}
        public android.telephony.data.ThrottleStatus.Builder setSlotIndex(int p0) { return null; }
        public android.telephony.data.ThrottleStatus.Builder setTransportType(int p0) { return null; }
        public android.telephony.data.ThrottleStatus.Builder setApnType(int p0) { return null; }
        public android.telephony.data.ThrottleStatus.Builder setThrottleExpiryTimeMillis(long p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.telephony.data.ThrottleStatus.Builder setNoThrottle() { return null; }
        public android.telephony.data.ThrottleStatus.Builder setRetryType(int p0) { return null; }
        public android.telephony.data.ThrottleStatus build() { return null; }
    }

    public static @interface RetryType {
    }

    public static @interface ThrottleType {
    }
}
