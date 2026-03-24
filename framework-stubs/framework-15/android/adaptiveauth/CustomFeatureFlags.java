package android.adaptiveauth;

public class CustomFeatureFlags implements android.adaptiveauth.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.adaptiveauth.FeatureFlags>> p0) {}
    public boolean enableAdaptiveAuth() { return false; }
    public boolean reportBiometricAuthAttempts() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.adaptiveauth.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
