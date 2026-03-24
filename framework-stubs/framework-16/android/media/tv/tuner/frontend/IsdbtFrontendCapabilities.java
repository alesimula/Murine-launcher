package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class IsdbtFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    public int getModeCapability() { return 0; }
    public int getBandwidthCapability() { return 0; }
    public int getModulationCapability() { return 0; }
    public int getCodeRateCapability() { return 0; }
    public int getGuardIntervalCapability() { return 0; }
    public int getTimeInterleaveModeCapability() { return 0; }
    public boolean isSegmentAutoSupported() { return false; }
    public boolean isFullSegmentSupported() { return false; }
}
