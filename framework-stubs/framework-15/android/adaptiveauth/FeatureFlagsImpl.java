package android.adaptiveauth;

public final class FeatureFlagsImpl implements android.adaptiveauth.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean enableAdaptiveAuth() { return false; }
    public boolean reportBiometricAuthAttempts() { return false; }
}
