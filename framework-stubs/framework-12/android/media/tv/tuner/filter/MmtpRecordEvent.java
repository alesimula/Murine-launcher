package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class MmtpRecordEvent extends android.media.tv.tuner.filter.FilterEvent {
    private final int mScHevcIndexMask = 0;
    private final long mDataLength = 0L;
    private final int mMpuSequenceNumber = 0;
    private final long mPts = 0L;
    private final int mFirstMbInSlice = 0;
    private final int mTsIndexMask = 0;
    private MmtpRecordEvent(int p0, long p1, int p2, long p3, int p4, int p5) { super(); }
    public int getScHevcIndexMask() { return 0; }
    public long getDataLength() { return 0L; }
    public int getMpuSequenceNumber() { return 0; }
    public long getPts() { return 0L; }
    public int getFirstMacroblockInSlice() { return 0; }
    public int getTsIndexMask() { return 0; }
}
