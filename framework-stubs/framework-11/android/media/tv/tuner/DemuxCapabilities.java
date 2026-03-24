package android.media.tv.tuner;

@android.annotation.SystemApi
public class DemuxCapabilities {
    private final int mDemuxCount = 0;
    private final int mRecordCount = 0;
    private final int mPlaybackCount = 0;
    private final int mTsFilterCount = 0;
    private final int mSectionFilterCount = 0;
    private final int mAudioFilterCount = 0;
    private final int mVideoFilterCount = 0;
    private final int mPesFilterCount = 0;
    private final int mPcrFilterCount = 0;
    private final long mSectionFilterLength = 0L;
    private final int mFilterCaps = 0;
    private final int[] mLinkCaps = null;
    private final boolean mSupportTimeFilter = false;
    private DemuxCapabilities(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, long p9, int p10, int[] p11, boolean p12) {}
    public int getDemuxCount() { return 0; }
    public int getRecordCount() { return 0; }
    public int getPlaybackCount() { return 0; }
    public int getTsFilterCount() { return 0; }
    public int getSectionFilterCount() { return 0; }
    public int getAudioFilterCount() { return 0; }
    public int getVideoFilterCount() { return 0; }
    public int getPesFilterCount() { return 0; }
    public int getPcrFilterCount() { return 0; }
    public long getSectionFilterLength() { return 0L; }
    public int getFilterCapabilities() { return 0; }
    public int[] getLinkCapabilities() { return null; }
    public boolean isTimeFilterSupported() { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FilterCapabilities {
    }
}
