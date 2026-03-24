package android.os;

public final class StatsLogEventWrapper implements android.os.Parcelable {
    static final boolean DEBUG = false;
    static final java.lang.String TAG = "StatsLogEventWrapper";
    private static final int EVENT_TYPE_UNKNOWN = 0;
    private static final int EVENT_TYPE_INT = 1;
    private static final int EVENT_TYPE_LONG = 2;
    private static final int EVENT_TYPE_FLOAT = 3;
    private static final int EVENT_TYPE_DOUBLE = 4;
    private static final int EVENT_TYPE_STRING = 5;
    private static final int EVENT_TYPE_STORAGE = 6;
    java.util.List<java.lang.Integer> mTypes;
    java.util.List<java.lang.Object> mValues;
    int mTag;
    long mElapsedTimeNs;
    long mWallClockTimeNs;
    android.os.WorkSource mWorkSource;
    public static final android.os.Parcelable.Creator<android.os.StatsLogEventWrapper> CREATOR = null;
    public StatsLogEventWrapper(int p0, long p1, long p2) {}
    private StatsLogEventWrapper(android.os.Parcel p0) {}
    public void setWorkSource(android.os.WorkSource p0) {}
    public void writeInt(int p0) {}
    public void writeLong(long p0) {}
    public void writeString(java.lang.String p0) {}
    public void writeFloat(float p0) {}
    public void writeStorage(byte[] p0) {}
    public void writeBoolean(boolean p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
