package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class AnalogFrontendCapabilities extends android.media.tv.tuner.frontend.FrontendCapabilities {
    private final int mTypeCap = 0;
    private final int mSifStandardCap = 0;
    private AnalogFrontendCapabilities(int p0, int p1) { super(); }
    public int getSignalTypeCapability() { return 0; }
    public int getSifStandardCapability() { return 0; }
}
