package android.media.codec;

public class CustomFeatureFlags implements android.media.codec.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.media.codec.FeatureFlags>> p0) {}
    public boolean aidlHalInputSurface() { return false; }
    public boolean appCodecUsageMetrics() { return false; }
    public boolean apvSupport() { return false; }
    public boolean audioMixPresentationSupport() { return false; }
    public boolean codecAvailability() { return false; }
    public boolean codecAvailabilityMetrics() { return false; }
    public boolean codecAvailabilitySupport() { return false; }
    public boolean codecBufferStateCleanup() { return false; }
    public boolean dataspaceV0Partial() { return false; }
    public boolean dynamicColorAspects() { return false; }
    public boolean hlgEditing() { return false; }
    public boolean inProcessSwAudioCodec() { return false; }
    public boolean inProcessSwAudioCodecSupport() { return false; }
    public boolean inputSurfaceThrottle() { return false; }
    public boolean largeAudioFrameFinish() { return false; }
    public boolean nativeCapabilites() { return false; }
    public boolean nullOutputSurface() { return false; }
    public boolean nullOutputSurfaceSupport() { return false; }
    public boolean numInputSlots() { return false; }
    public boolean p210FormatSupport() { return false; }
    public boolean regionOfInterest() { return false; }
    public boolean regionOfInterestSupport() { return false; }
    public boolean removeArraymodeForLinearOutputBuffers() { return false; }
    public boolean renderingDepthRemoval() { return false; }
    public boolean secureCodecsRequireCrypto() { return false; }
    public boolean setCallbackStall() { return false; }
    public boolean setStateEarly() { return false; }
    public boolean stopHalBeforeSurface() { return false; }
    public boolean subsessionMetrics() { return false; }
    public boolean teamfood() { return false; }
    public boolean thumbnailBlockModel() { return false; }
    public boolean traceCodecActivity() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.media.codec.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
