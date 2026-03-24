package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class IsdbtFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    private final int mModeCap = 0;
    private final int mBandwidthCap = 0;
    private final int mModulationCap = 0;
    private final int mCodeRateCap = 0;
    private final int mGuardIntervalCap = 0;
    private IsdbtFrontendCapabilities(int p0, int p1, int p2, int p3, int p4) { super(); }
    public int getModeCapability() { return 0; }
    public int getBandwidthCapability() { return 0; }
    public int getModulationCapability() { return 0; }
    public int getCodeRateCapability() { return 0; }
    public int getGuardIntervalCapability() { return 0; }
}
