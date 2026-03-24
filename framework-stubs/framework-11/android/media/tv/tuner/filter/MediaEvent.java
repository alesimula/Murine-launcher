package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class MediaEvent extends android.media.tv.tuner.filter.FilterEvent {
    private long mNativeContext;
    private boolean mReleased;
    private final java.lang.Object mLock = null;
    private final int mStreamId = 0;
    private final boolean mIsPtsPresent = false;
    private final long mPts = 0L;
    private final long mDataLength = 0L;
    private final long mOffset = 0L;
    private android.media.MediaCodec.LinearBlock mLinearBlock;
    private final boolean mIsSecureMemory = false;
    private final long mDataId = 0L;
    private final int mMpuSequenceNumber = 0;
    private final boolean mIsPrivateData = false;
    private final android.media.tv.tuner.filter.AudioDescriptor mExtraMetaData = null;
    private native java.lang.Long nativeGetAudioHandle();
    private native android.media.MediaCodec.LinearBlock nativeGetLinearBlock();
    private native void nativeFinalize();
    private MediaEvent(int p0, boolean p1, long p2, long p3, long p4, android.media.MediaCodec.LinearBlock p5, boolean p6, long p7, int p8, boolean p9, android.media.tv.tuner.filter.AudioDescriptor p10) { super(); }
    public int getStreamId() { return 0; }
    public boolean isPtsPresent() { return false; }
    public long getPts() { return 0L; }
    public long getDataLength() { return 0L; }
    public long getOffset() { return 0L; }
    public android.media.MediaCodec.LinearBlock getLinearBlock() { return null; }
    public boolean isSecureMemory() { return false; }
    public long getAvDataId() { return 0L; }
    public long getAudioHandle() { return 0L; }
    public int getMpuSequenceNumber() { return 0; }
    public boolean isPrivateData() { return false; }
    public android.media.tv.tuner.filter.AudioDescriptor getExtraMetaData() { return null; }
    protected void finalize() {}
    public void release() {}
}
