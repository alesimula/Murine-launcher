package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbcFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    public int getModulationCapability() { return 0; }
    @java.lang.Deprecated
    public int getFecCapability() { return 0; }
    public long getCodeRateCapability() { return 0L; }
    public int getAnnexCapability() { return 0; }
}
