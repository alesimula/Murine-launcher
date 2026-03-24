package com.android.internal.hidden_from_bootclasspath.android.hardware.biometrics;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.android.hardware.biometrics.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.hardware.biometrics.FeatureFlags>> p0) {}
    public boolean addFallback() { return false; }
    public boolean addKeyAgreementCryptoObject() { return false; }
    public boolean bpFallbackOptions() { return false; }
    public boolean customBiometricPrompt() { return false; }
    public boolean effectiveUserBp() { return false; }
    public boolean getOpIdCryptoObject() { return false; }
    public boolean identityCheckAllSurfaces() { return false; }
    public boolean identityCheckApi() { return false; }
    public boolean identityCheckTestApi() { return false; }
    public boolean identityCheckWatch() { return false; }
    public boolean moveFmApiToBm() { return false; }
    public boolean privateSpaceBp() { return false; }
    public boolean screenOffUnlockUdfps() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.android.hardware.biometrics.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
