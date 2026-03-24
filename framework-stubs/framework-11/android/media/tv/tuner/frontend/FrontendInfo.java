package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class FrontendInfo {
    private final int mId = 0;
    private final int mType = 0;
    private final android.util.Range<java.lang.Integer> mFrequencyRange = null;
    private final android.util.Range<java.lang.Integer> mSymbolRateRange = null;
    private final int mAcquireRange = 0;
    private final int mExclusiveGroupId = 0;
    private final int[] mStatusCaps = null;
    private final android.media.tv.tuner.frontend.FrontendCapabilities mFrontendCap = null;
    private FrontendInfo(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int[] p8, android.media.tv.tuner.frontend.FrontendCapabilities p9) {}
    public int getId() { return 0; }
    public int getType() { return 0; }
    public android.util.Range<java.lang.Integer> getFrequencyRange() { return null; }
    public android.util.Range<java.lang.Integer> getSymbolRateRange() { return null; }
    public int getAcquireRange() { return 0; }
    public int getExclusiveGroupId() { return 0; }
    public int[] getStatusCapabilities() { return null; }
    public android.media.tv.tuner.frontend.FrontendCapabilities getFrontendCapabilities() { return null; }
}
