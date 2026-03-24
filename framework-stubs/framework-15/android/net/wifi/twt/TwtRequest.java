package android.net.wifi.twt;

public final class TwtRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.twt.TwtRequest> CREATOR = null;
    TwtRequest() {}
    public int describeContents() { return 0; }
    public int getLinkId() { return 0; }
    public int getMaxWakeDurationMicros() { return 0; }
    public long getMaxWakeIntervalMicros() { return 0L; }
    public int getMinWakeDurationMicros() { return 0; }
    public long getMinWakeIntervalMicros() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1, long p2, long p3) {}
        @android.annotation.NonNull
        public android.net.wifi.twt.TwtRequest build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.twt.TwtRequest.Builder setLinkId(int p0) { return null; }
    }
}
