package android.hardware.biometrics;

public final class Flags {
    public static final java.lang.String FLAG_ADD_KEY_AGREEMENT_CRYPTO_OBJECT = "android.hardware.biometrics.add_key_agreement_crypto_object";
    public static final java.lang.String FLAG_CUSTOM_BIOMETRIC_PROMPT = "android.hardware.biometrics.custom_biometric_prompt";
    public static final java.lang.String FLAG_GET_OP_ID_CRYPTO_OBJECT = "android.hardware.biometrics.get_op_id_crypto_object";
    public static final java.lang.String FLAG_LAST_AUTHENTICATION_TIME = "android.hardware.biometrics.last_authentication_time";
    public static final java.lang.String FLAG_MANDATORY_BIOMETRICS = "android.hardware.biometrics.mandatory_biometrics";
    public Flags() {}
    public static boolean addKeyAgreementCryptoObject() { return false; }
    public static boolean customBiometricPrompt() { return false; }
    public static boolean getOpIdCryptoObject() { return false; }
    public static boolean lastAuthenticationTime() { return false; }
    public static boolean mandatoryBiometrics() { return false; }
}
