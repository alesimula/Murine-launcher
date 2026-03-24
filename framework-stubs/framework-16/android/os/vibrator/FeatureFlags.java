package android.os.vibrator;

public interface FeatureFlags {
    public boolean adaptiveHapticsEnabled();
    public boolean hapticFeedbackInputSourceCustomizationEnabled();
    public boolean hapticFeedbackWithCustomUsage();
    public boolean hapticsScaleV2Enabled();
    public boolean loadHapticFeedbackVibrationCustomizationFromResources();
    public boolean normalizedPwleEffects();
    public boolean primitiveCompositionAbsoluteDelay();
    public boolean removeHidlSupport();
    public boolean throttleVibrationParamsRequests();
    public boolean vendorVibrationEffects();
    public boolean vibrationAttributeImeUsageApi();
    public boolean vibrationPipelineFixEnabled();
    public boolean vibrationThreadHandlingHalFailure();
    public boolean vibrationXmlApis();
}
