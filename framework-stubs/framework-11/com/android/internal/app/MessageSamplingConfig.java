package com.android.internal.app;

public final class MessageSamplingConfig implements android.os.Parcelable {
    private final int mSampledOpCode = 0;
    private final int mAcceptableLeftDistance = 0;
    private final long mExpirationTimeSinceBootMillis = 0L;
    public static final android.os.Parcelable.Creator<com.android.internal.app.MessageSamplingConfig> CREATOR = null;
    public MessageSamplingConfig(int p0, int p1, long p2) {}
    public int getSampledOpCode() { return 0; }
    public int getAcceptableLeftDistance() { return 0; }
    public long getExpirationTimeSinceBootMillis() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    MessageSamplingConfig(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
}
