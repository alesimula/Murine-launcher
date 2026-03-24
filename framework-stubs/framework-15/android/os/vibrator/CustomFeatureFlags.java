package android.os.vibrator;

public class CustomFeatureFlags implements android.os.vibrator.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.os.vibrator.FeatureFlags>> p0) {}
    public boolean adaptiveHapticsEnabled() { return false; }
    public boolean hapticFeedbackVibrationOemCustomizationEnabled() { return false; }
    public boolean keyboardCategoryEnabled() { return false; }
    public boolean useVibratorHapticFeedback() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.os.vibrator.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
