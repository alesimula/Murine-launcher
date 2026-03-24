package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbtFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    private final int mTransmissionModeCap = 0;
    private final int mBandwidthCap = 0;
    private final int mConstellationCap = 0;
    private final int mCodeRateCap = 0;
    private final int mHierarchyCap = 0;
    private final int mGuardIntervalCap = 0;
    private final boolean mIsT2Supported = false;
    private final boolean mIsMisoSupported = false;
    private DvbtFrontendCapabilities(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7) { super(); }
    public int getTransmissionModeCapability() { return 0; }
    public int getBandwidthCapability() { return 0; }
    public int getConstellationCapability() { return 0; }
    public int getCodeRateCapability() { return 0; }
    public int getHierarchyCapability() { return 0; }
    public int getGuardIntervalCapability() { return 0; }
    public boolean isT2Supported() { return false; }
    public boolean isMisoSupported() { return false; }
}
