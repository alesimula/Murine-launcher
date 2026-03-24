package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbtFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    public int getTransmissionModeCapability() { return 0; }
    public int getBandwidthCapability() { return 0; }
    public int getConstellationCapability() { return 0; }
    public int getCodeRateCapability() { return 0; }
    public int getHierarchyCapability() { return 0; }
    public int getGuardIntervalCapability() { return 0; }
    public boolean isT2Supported() { return false; }
    public boolean isMisoSupported() { return false; }
}
