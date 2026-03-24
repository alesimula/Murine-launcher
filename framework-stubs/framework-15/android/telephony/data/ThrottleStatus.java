package android.telephony.data;

@android.annotation.SystemApi
public final class ThrottleStatus implements android.os.Parcelable {
    public static final int THROTTLE_TYPE_NONE = 1;
    public static final int THROTTLE_TYPE_ELAPSED_TIME = 2;
    public static final int RETRY_TYPE_NONE = 1;
    public static final int RETRY_TYPE_NEW_CONNECTION = 2;
    public static final int RETRY_TYPE_HANDOVER = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.telephony.data.ThrottleStatus> CREATOR = null;
    public int getSlotIndex() { return 0; }
    public int getTransportType() { return 0; }
    public int getApnType() { return 0; }
    public int getThrottleType() { return 0; }
    public int getRetryType() { return 0; }
    public long getThrottleExpiryTimeMillis() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public static final long NO_THROTTLE_EXPIRY_TIME = -1L;
        public Builder() {}
        @android.annotation.NonNull
        public android.telephony.data.ThrottleStatus.Builder setSlotIndex(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.ThrottleStatus.Builder setTransportType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.ThrottleStatus.Builder setApnType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.ThrottleStatus.Builder setThrottleExpiryTimeMillis(long p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        @android.annotation.NonNull
        public android.telephony.data.ThrottleStatus.Builder setNoThrottle() { return null; }
        @android.annotation.NonNull
        public android.telephony.data.ThrottleStatus.Builder setRetryType(int p0) { return null; }
        @android.annotation.NonNull
        public android.telephony.data.ThrottleStatus build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RetryType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ThrottleType {
    }
}
