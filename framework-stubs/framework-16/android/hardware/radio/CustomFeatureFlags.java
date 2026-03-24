package android.hardware.radio;

public class CustomFeatureFlags implements android.hardware.radio.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.hardware.radio.FeatureFlags>> p0) {}
    public boolean hdRadioEmergencyAlertSystem() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.hardware.radio.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
