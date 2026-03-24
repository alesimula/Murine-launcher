package com.android.internal.hidden_from_bootclasspath.android.os.vibrator;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.os.vibrator.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.os.vibrator.FeatureFlags>> p0) {}
    public boolean adaptiveHapticsEnabled() { return false; }
    public boolean hapticFeedbackInputSourceCustomizationEnabled() { return false; }
    public boolean hapticFeedbackWithCustomUsage() { return false; }
    public boolean hapticsScaleV2Enabled() { return false; }
    public boolean loadHapticFeedbackVibrationCustomizationFromResources() { return false; }
    public boolean normalizedPwleEffects() { return false; }
    public boolean primitiveCompositionAbsoluteDelay() { return false; }
    public boolean removeHidlSupport() { return false; }
    public boolean throttleVibrationParamsRequests() { return false; }
    public boolean vendorVibrationEffects() { return false; }
    public boolean vibrationAttributeImeUsageApi() { return false; }
    public boolean vibrationPipelineFixEnabled() { return false; }
    public boolean vibrationThreadHandlingHalFailure() { return false; }
    public boolean vibrationXmlApis() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.os.vibrator.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
