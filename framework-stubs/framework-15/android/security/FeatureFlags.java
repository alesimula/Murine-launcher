package android.security;

public interface FeatureFlags {
    public boolean asmOptSystemIntoEnforcement();
    public boolean asmRestrictionsEnabled();
    public boolean asmToastsEnabled();
    public boolean binaryTransparencySepolicyHash();
    public boolean blockNullActionIntents();
    public boolean certificateTransparencyConfiguration();
    public boolean contentUriPermissionApis();
    public boolean deprecateFsvSig();
    public boolean dumpAttestationVerifications();
    public boolean enforceIntentFilterMatch();
    public boolean extendEcmToAllSettings();
    public boolean extendVbChainToUpdatedApk();
    public boolean fixUnlockedDeviceRequiredKeysV2();
    public boolean frpEnforcement();
    public boolean fsverityApi();
    public boolean keyinfoUnlockedDeviceRequired();
    public boolean mgf1DigestSetterV2();
    public boolean reportPrimaryAuthAttempts();
    public boolean significantPlaces();
    public boolean unlockedStorageApi();
}
