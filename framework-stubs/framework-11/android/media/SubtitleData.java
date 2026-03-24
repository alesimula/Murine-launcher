package android.media;

public final class SubtitleData {
    private static final java.lang.String TAG = "SubtitleData";
    private int mTrackIndex;
    private long mStartTimeUs;
    private long mDurationUs;
    private byte[] mData;
    public SubtitleData(android.os.Parcel p0) {}
    public SubtitleData(int p0, long p1, long p2, byte[] p3) {}
    public int getTrackIndex() { return 0; }
    public long getStartTimeUs() { return 0L; }
    public long getDurationUs() { return 0L; }
    public byte[] getData() { return null; }
    private boolean parseParcel(android.os.Parcel p0) { return false; }
}
