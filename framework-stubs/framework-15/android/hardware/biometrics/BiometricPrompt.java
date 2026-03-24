package android.hardware.biometrics;

public class BiometricPrompt implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricConstants {
    static final int MAX_LOGO_DESCRIPTION_CHARACTER_NUMBER = 30;
    public static final int HIDE_DIALOG_DELAY = 2000;
    public static final int DISMISSED_REASON_BIOMETRIC_CONFIRMED = 1;
    public static final int DISMISSED_REASON_NEGATIVE = 2;
    public static final int DISMISSED_REASON_USER_CANCEL = 3;
    public static final int DISMISSED_REASON_BIOMETRIC_CONFIRM_NOT_REQUIRED = 4;
    public static final int DISMISSED_REASON_ERROR = 5;
    public static final int DISMISSED_REASON_SERVER_REQUESTED = 6;
    public static final int DISMISSED_REASON_CREDENTIAL_CONFIRMED = 7;
    public static final int DISMISSED_REASON_CONTENT_VIEW_MORE_OPTIONS = 8;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    @android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
    @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
    public int getLogoRes() { return 0; }
    @android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
    @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
    @android.annotation.Nullable
    public android.graphics.Bitmap getLogoBitmap() { return null; }
    @android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
    @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
    @android.annotation.Nullable
    public java.lang.String getLogoDescription() { return null; }
    @android.annotation.NonNull
    public java.lang.CharSequence getTitle() { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean shouldUseDefaultTitle() { return false; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSubtitle() { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean shouldUseDefaultSubtitle() { return false; }
    @android.annotation.Nullable
    public java.lang.CharSequence getDescription() { return null; }
    @android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
    @android.annotation.Nullable
    public android.hardware.biometrics.PromptContentView getContentView() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getNegativeButtonText() { return null; }
    public boolean isConfirmationRequired() { return false; }
    @android.annotation.Nullable
    public int getAllowedAuthenticators() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getAllowedSensorIds() { return null; }
    public boolean isAllowBackgroundAuthentication() { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void authenticateUser(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2, int p3) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
    public long authenticateForOperation(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2, long p3) { return 0L; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
    public void authenticate(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p3) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC")
    public void authenticate(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2) {}

    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult p0) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationAcquired(int p0) {}
        public void onSystemEvent(int p0) {}
    }

    public static class AuthenticationResult extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationResult {
        public AuthenticationResult(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, int p1) { super(); }
        public android.hardware.biometrics.BiometricPrompt.CryptoObject getCryptoObject() { return null; }
        public int getAuthenticationType() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthenticationResultType {
    }

    public static class Builder {
        public Builder(android.content.Context p0) {}
        @android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
        @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setLogoRes(int p0) { return null; }
        @android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
        @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setLogoBitmap(android.graphics.Bitmap p0) { return null; }
        @android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
        @android.annotation.RequiresPermission("android.permission.SET_BIOMETRIC_DIALOG_ADVANCED")
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setLogoDescription(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setTitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setUseDefaultTitle() { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setUseDefaultSubtitle() { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setDescription(java.lang.CharSequence p0) { return null; }
        @android.annotation.FlaggedApi("android.hardware.biometrics.custom_biometric_prompt")
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setContentView(android.hardware.biometrics.PromptContentView p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setService(android.hardware.biometrics.IAuthService p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setTextForDeviceCredential(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setNegativeButton(java.lang.CharSequence p0, java.util.concurrent.Executor p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setConfirmationRequired(boolean p0) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setDeviceCredentialAllowed(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowedAuthenticators(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf={"android.permission.TEST_BIOMETRIC", "android.permission.USE_BIOMETRIC_INTERNAL"})
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowedSensorIds(java.util.List<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf={"android.permission.TEST_BIOMETRIC", "android.permission.USE_BIOMETRIC_INTERNAL"})
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowBackgroundAuthentication(boolean p0) { return null; }
        @android.annotation.FlaggedApi("android.os.allow_private_profile")
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf={"android.permission.TEST_BIOMETRIC", "android.permission.USE_BIOMETRIC_INTERNAL"})
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowBackgroundAuthentication(boolean p0, boolean p1) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf="android.permission.USE_BIOMETRIC_INTERNAL")
        public android.hardware.biometrics.BiometricPrompt.Builder setDisallowBiometricsIfPolicyExists(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf="android.permission.USE_BIOMETRIC_INTERNAL")
        public android.hardware.biometrics.BiometricPrompt.Builder setReceiveSystemEvents(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf={"android.permission.TEST_BIOMETRIC", "android.permission.USE_BIOMETRIC_INTERNAL"})
        public android.hardware.biometrics.BiometricPrompt.Builder setIgnoreEnrollmentState(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf={"android.permission.TEST_BIOMETRIC", "android.permission.USE_BIOMETRIC_INTERNAL"})
        public android.hardware.biometrics.BiometricPrompt.Builder setIsForLegacyFingerprintManager(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf={"android.permission.TEST_BIOMETRIC", "android.permission.USE_BIOMETRIC_INTERNAL"})
        public android.hardware.biometrics.BiometricPrompt.Builder setShowEmergencyCallButton(boolean p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission(anyOf={"android.permission.TEST_BIOMETRIC", "android.permission.USE_BIOMETRIC_INTERNAL"})
        public android.hardware.biometrics.BiometricPrompt.Builder setComponentNameForConfirmDeviceCredentialActivity(android.content.ComponentName p0) { return null; }
        @android.annotation.NonNull
        public android.hardware.biometrics.BiometricPrompt build() { return null; }
    }

    static class ButtonInfo {
        java.util.concurrent.Executor executor;
        android.content.DialogInterface.OnClickListener listener;
        ButtonInfo(java.util.concurrent.Executor p0, android.content.DialogInterface.OnClickListener p1) {}
    }

    public static final class CryptoObject extends android.hardware.biometrics.CryptoObject {
        public CryptoObject(java.security.Signature p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Cipher p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Mac p0) { super((java.security.Signature)null); }
        @java.lang.Deprecated
        public CryptoObject(android.security.identity.IdentityCredential p0) { super((java.security.Signature)null); }
        public CryptoObject(android.security.identity.PresentationSession p0) { super((java.security.Signature)null); }
        @android.annotation.FlaggedApi("android.hardware.biometrics.add_key_agreement_crypto_object")
        public CryptoObject(javax.crypto.KeyAgreement p0) { super((java.security.Signature)null); }
        @android.annotation.FlaggedApi("android.hardware.biometrics.get_op_id_crypto_object")
        public CryptoObject(long p0) { super((java.security.Signature)null); }
        @android.annotation.Nullable
        public java.security.Signature getSignature() { return null; }
        @android.annotation.Nullable
        public javax.crypto.Cipher getCipher() { return null; }
        @android.annotation.Nullable
        public javax.crypto.Mac getMac() { return null; }
        @java.lang.Deprecated
        @android.annotation.Nullable
        public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
        @android.annotation.Nullable
        public android.security.identity.PresentationSession getPresentationSession() { return null; }
        @android.annotation.FlaggedApi("android.hardware.biometrics.add_key_agreement_crypto_object")
        @android.annotation.Nullable
        public javax.crypto.KeyAgreement getKeyAgreement() { return null; }
        @android.annotation.FlaggedApi("android.hardware.biometrics.get_op_id_crypto_object")
        public long getOperationHandle() { return 0L; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DismissedReason {
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        OnAuthenticationCancelListener(android.hardware.biometrics.BiometricPrompt p0, long p1) {}
        public void onCancel() {}
    }
}
