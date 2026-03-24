package android.media.codec;

public interface FeatureFlags {
    public boolean aidlHalInputSurface();
    public boolean appCodecUsageMetrics();
    public boolean apvSupport();
    public boolean audioMixPresentationSupport();
    public boolean codecAvailability();
    public boolean codecAvailabilityMetrics();
    public boolean codecAvailabilitySupport();
    public boolean codecBufferStateCleanup();
    public boolean dataspaceV0Partial();
    public boolean dynamicColorAspects();
    public boolean hlgEditing();
    public boolean inProcessSwAudioCodec();
    public boolean inProcessSwAudioCodecSupport();
    public boolean inputSurfaceThrottle();
    public boolean largeAudioFrameFinish();
    public boolean nativeCapabilites();
    public boolean nullOutputSurface();
    public boolean nullOutputSurfaceSupport();
    public boolean numInputSlots();
    public boolean p210FormatSupport();
    public boolean regionOfInterest();
    public boolean regionOfInterestSupport();
    public boolean removeArraymodeForLinearOutputBuffers();
    public boolean renderingDepthRemoval();
    public boolean secureCodecsRequireCrypto();
    public boolean setCallbackStall();
    public boolean setStateEarly();
    public boolean stopHalBeforeSurface();
    public boolean subsessionMetrics();
    public boolean teamfood();
    public boolean thumbnailBlockModel();
    public boolean traceCodecActivity();
}
