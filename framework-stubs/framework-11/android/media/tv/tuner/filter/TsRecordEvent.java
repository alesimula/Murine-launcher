package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class TsRecordEvent extends android.media.tv.tuner.filter.FilterEvent {
    private final int mPid = 0;
    private final int mTsIndexMask = 0;
    private final int mScIndexMask = 0;
    private final long mDataLength = 0L;
    private TsRecordEvent(int p0, int p1, int p2, long p3) { super(); }
    public int getPacketId() { return 0; }
    public int getTsIndexMask() { return 0; }
    public int getScIndexMask() { return 0; }
    public long getDataLength() { return 0L; }
}
