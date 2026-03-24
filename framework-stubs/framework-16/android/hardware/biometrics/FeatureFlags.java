package android.hardware.biometrics;

public interface FeatureFlags {
    public boolean addFallback();
    public boolean addKeyAgreementCryptoObject();
    public boolean bpFallbackOptions();
    public boolean customBiometricPrompt();
    public boolean effectiveUserBp();
    public boolean getOpIdCryptoObject();
    public boolean identityCheckAllSurfaces();
    public boolean identityCheckApi();
    public boolean identityCheckTestApi();
    public boolean identityCheckWatch();
    public boolean moveFmApiToBm();
    public boolean privateSpaceBp();
    public boolean screenOffUnlockUdfps();
}
