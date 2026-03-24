package android.telephony;

@android.annotation.SystemApi
public final class DataThrottlingRequest implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final int DATA_THROTTLING_ACTION_NO_DATA_THROTTLING = 0;
    @android.annotation.SystemApi
    public static final int DATA_THROTTLING_ACTION_THROTTLE_SECONDARY_CARRIER = 1;
    @android.annotation.SystemApi
    public static final int DATA_THROTTLING_ACTION_THROTTLE_PRIMARY_CARRIER = 2;
    @android.annotation.SystemApi
    public static final int DATA_THROTTLING_ACTION_HOLD = 3;
    public static final android.os.Parcelable.Creator<android.telephony.DataThrottlingRequest> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public int getDataThrottlingAction() { return 0; }
    public long getCompletionDurationMillis() { return 0L; }

    @android.annotation.SystemApi
    public static final class Builder {
        public Builder() {}
        public android.telephony.DataThrottlingRequest.Builder setDataThrottlingAction(int p0) { return null; }
        public android.telephony.DataThrottlingRequest.Builder setCompletionDurationMillis(long p0) { return null; }
        public android.telephony.DataThrottlingRequest build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DataThrottlingAction {
    }
}
