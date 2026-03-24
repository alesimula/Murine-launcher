package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public final class DtmbFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    private final int mModulationCap = 0;
    private final int mTransmissionModeCap = 0;
    private final int mGuardIntervalCap = 0;
    private final int mTimeInterleaveModeCap = 0;
    private final int mCodeRateCap = 0;
    private final int mBandwidthCap = 0;
    private DtmbFrontendCapabilities(int p0, int p1, int p2, int p3, int p4, int p5) { super(); }
    public int getModulationCapability() { return 0; }
    public int getTransmissionModeCapability() { return 0; }
    public int getGuardIntervalCapability() { return 0; }
    public int getTimeInterleaveModeCapability() { return 0; }
    public int getCodeRateCapability() { return 0; }
    public int getBandwidthCapability() { return 0; }
}
