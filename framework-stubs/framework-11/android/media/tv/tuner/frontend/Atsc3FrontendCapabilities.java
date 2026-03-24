package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class Atsc3FrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    private final int mBandwidthCap = 0;
    private final int mModulationCap = 0;
    private final int mTimeInterleaveModeCap = 0;
    private final int mCodeRateCap = 0;
    private final int mFecCap = 0;
    private final int mDemodOutputFormatCap = 0;
    private Atsc3FrontendCapabilities(int p0, int p1, int p2, int p3, int p4, int p5) { super(); }
    public int getBandwidthCapability() { return 0; }
    public int getModulationCapability() { return 0; }
    public int getTimeInterleaveModeCapability() { return 0; }
    public int getPlpCodeRateCapability() { return 0; }
    public int getFecCapability() { return 0; }
    public int getDemodOutputFormatCapability() { return 0; }
}
