package com.android.internal.telephony.cat;

public class Duration implements android.os.Parcelable {
    public int timeInterval;
    public com.android.internal.telephony.cat.Duration.TimeUnit timeUnit;
    public static final android.os.Parcelable.Creator<com.android.internal.telephony.cat.Duration> CREATOR = null;
    public Duration(int p0, com.android.internal.telephony.cat.Duration.TimeUnit p1) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static enum TimeUnit {
        MINUTE,
        SECOND,
        TENTH_SECOND;
        public int value() { return 0; }
    }
}
