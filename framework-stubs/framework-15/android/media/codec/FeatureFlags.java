package android.media.codec;

public interface FeatureFlags {
    public boolean aidlHalInputSurface();
    public boolean dynamicColorAspects();
    public boolean hlgEditing();
    public boolean inProcessSwAudioCodec();
    public boolean inProcessSwAudioCodecSupport();
    public boolean inputSurfaceThrottle();
    public boolean largeAudioFrameFinish();
    public boolean nativeCapabilites();
    public boolean nullOutputSurface();
    public boolean nullOutputSurfaceSupport();
    public boolean regionOfInterest();
    public boolean regionOfInterestSupport();
    public boolean setCallbackStall();
    public boolean setStateEarly();
    public boolean stopHalBeforeSurface();
    public boolean teamfood();
}
