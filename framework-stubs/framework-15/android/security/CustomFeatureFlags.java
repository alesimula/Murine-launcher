package android.security;

public class CustomFeatureFlags implements android.security.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.security.FeatureFlags>> p0) {}
    public boolean asmOptSystemIntoEnforcement() { return false; }
    public boolean asmRestrictionsEnabled() { return false; }
    public boolean asmToastsEnabled() { return false; }
    public boolean binaryTransparencySepolicyHash() { return false; }
    public boolean blockNullActionIntents() { return false; }
    public boolean certificateTransparencyConfiguration() { return false; }
    public boolean contentUriPermissionApis() { return false; }
    public boolean deprecateFsvSig() { return false; }
    public boolean dumpAttestationVerifications() { return false; }
    public boolean enforceIntentFilterMatch() { return false; }
    public boolean extendEcmToAllSettings() { return false; }
    public boolean extendVbChainToUpdatedApk() { return false; }
    public boolean fixUnlockedDeviceRequiredKeysV2() { return false; }
    public boolean frpEnforcement() { return false; }
    public boolean fsverityApi() { return false; }
    public boolean keyinfoUnlockedDeviceRequired() { return false; }
    public boolean mgf1DigestSetterV2() { return false; }
    public boolean reportPrimaryAuthAttempts() { return false; }
    public boolean significantPlaces() { return false; }
    public boolean unlockedStorageApi() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.security.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
