package android.hardware.biometrics;

public class CustomFeatureFlags implements android.hardware.biometrics.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.hardware.biometrics.FeatureFlags>> p0) {}
    public boolean addKeyAgreementCryptoObject() { return false; }
    public boolean customBiometricPrompt() { return false; }
    public boolean getOpIdCryptoObject() { return false; }
    public boolean lastAuthenticationTime() { return false; }
    public boolean mandatoryBiometrics() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.hardware.biometrics.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
