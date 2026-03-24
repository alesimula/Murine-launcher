package android.hardware.biometrics;

public interface FeatureFlags {
    public boolean addKeyAgreementCryptoObject();
    public boolean customBiometricPrompt();
    public boolean getOpIdCryptoObject();
    public boolean lastAuthenticationTime();
    public boolean mandatoryBiometrics();
}
