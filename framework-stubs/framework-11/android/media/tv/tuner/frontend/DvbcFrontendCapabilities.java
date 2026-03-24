package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbcFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    private final int mModulationCap = 0;
    private final int mFecCap = 0;
    private final int mAnnexCap = 0;
    private DvbcFrontendCapabilities(int p0, int p1, int p2) { super(); }
    public int getModulationCapability() { return 0; }
    public int getFecCapability() { return 0; }
    public int getAnnexCapability() { return 0; }
}
