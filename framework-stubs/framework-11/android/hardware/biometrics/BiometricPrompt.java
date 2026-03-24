package android.hardware.biometrics;

public class BiometricPrompt implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricConstants {
    private static final java.lang.String TAG = "BiometricPrompt";
    public static final java.lang.String KEY_TITLE = "title";
    public static final java.lang.String KEY_USE_DEFAULT_TITLE = "use_default_title";
    public static final java.lang.String KEY_SUBTITLE = "subtitle";
    public static final java.lang.String KEY_DESCRIPTION = "description";
    public static final java.lang.String KEY_DEVICE_CREDENTIAL_TITLE = "device_credential_title";
    public static final java.lang.String KEY_DEVICE_CREDENTIAL_SUBTITLE = "device_credential_subtitle";
    public static final java.lang.String KEY_DEVICE_CREDENTIAL_DESCRIPTION = "device_credential_description";
    public static final java.lang.String KEY_NEGATIVE_TEXT = "negative_text";
    public static final java.lang.String KEY_REQUIRE_CONFIRMATION = "require_confirmation";
    public static final java.lang.String KEY_ALLOW_DEVICE_CREDENTIAL = "allow_device_credential";
    public static final java.lang.String KEY_AUTHENTICATORS_ALLOWED = "authenticators_allowed";
    public static final java.lang.String EXTRA_DISALLOW_BIOMETRICS_IF_POLICY_EXISTS = "check_dpm";
    public static final java.lang.String KEY_RECEIVE_SYSTEM_EVENTS = "receive_system_events";
    public static final int HIDE_DIALOG_DELAY = 2000;
    public static final int DISMISSED_REASON_BIOMETRIC_CONFIRMED = 1;
    public static final int DISMISSED_REASON_NEGATIVE = 2;
    public static final int DISMISSED_REASON_USER_CANCEL = 3;
    public static final int DISMISSED_REASON_BIOMETRIC_CONFIRM_NOT_REQUIRED = 4;
    public static final int DISMISSED_REASON_ERROR = 5;
    public static final int DISMISSED_REASON_SERVER_REQUESTED = 6;
    public static final int DISMISSED_REASON_CREDENTIAL_CONFIRMED = 7;
    private final android.os.IBinder mToken = null;
    private final android.content.Context mContext = null;
    private final android.hardware.biometrics.IAuthService mService = null;
    private final android.os.Bundle mBundle = null;
    private final android.hardware.biometrics.BiometricPrompt.ButtonInfo mPositiveButtonInfo = null;
    private final android.hardware.biometrics.BiometricPrompt.ButtonInfo mNegativeButtonInfo = null;
    private android.hardware.biometrics.BiometricPrompt.CryptoObject mCryptoObject;
    private java.util.concurrent.Executor mExecutor;
    private android.hardware.biometrics.BiometricPrompt.AuthenticationCallback mAuthenticationCallback;
    private final android.hardware.biometrics.IBiometricServiceReceiver mBiometricServiceReceiver = null;
    public static final int AUTHENTICATION_RESULT_TYPE_DEVICE_CREDENTIAL = 1;
    public static final int AUTHENTICATION_RESULT_TYPE_BIOMETRIC = 2;
    private BiometricPrompt(android.content.Context p0, android.os.Bundle p1, android.hardware.biometrics.BiometricPrompt.ButtonInfo p2, android.hardware.biometrics.BiometricPrompt.ButtonInfo p3) {}
    public java.lang.CharSequence getTitle() { return null; }
    public boolean shouldUseDefaultTitle() { return false; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public java.lang.CharSequence getDescription() { return null; }
    public java.lang.CharSequence getNegativeButtonText() { return null; }
    public boolean isConfirmationRequired() { return false; }
    public int getAllowedAuthenticators() { return 0; }
    public void authenticateUser(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2, int p3) {}
    public void authenticate(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p3) {}
    public void authenticate(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2) {}
    private void cancelAuthentication() {}
    private void authenticateInternal(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p3, int p4) {}

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
        private final android.os.Bundle mBundle = null;
        private android.hardware.biometrics.BiometricPrompt.ButtonInfo mPositiveButtonInfo;
        private android.hardware.biometrics.BiometricPrompt.ButtonInfo mNegativeButtonInfo;
        private android.content.Context mContext;
        public Builder(android.content.Context p0) {}
        public android.hardware.biometrics.BiometricPrompt.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setUseDefaultTitle() { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setDescription(java.lang.CharSequence p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setTextForDeviceCredential(java.lang.CharSequence p0, java.lang.CharSequence p1, java.lang.CharSequence p2) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setNegativeButton(java.lang.CharSequence p0, java.util.concurrent.Executor p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setConfirmationRequired(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.hardware.biometrics.BiometricPrompt.Builder setDeviceCredentialAllowed(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setAllowedAuthenticators(int p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setDisallowBiometricsIfPolicyExists(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setReceiveSystemEvents(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt build() { return null; }
    }

    private static class ButtonInfo {
        java.util.concurrent.Executor executor;
        android.content.DialogInterface.OnClickListener listener;
        ButtonInfo(java.util.concurrent.Executor p0, android.content.DialogInterface.OnClickListener p1) {}
    }

    public static final class CryptoObject extends android.hardware.biometrics.CryptoObject {
        public CryptoObject(java.security.Signature p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Cipher p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Mac p0) { super((java.security.Signature)null); }
        public CryptoObject(android.security.identity.IdentityCredential p0) { super((java.security.Signature)null); }
        public java.security.Signature getSignature() { return null; }
        public javax.crypto.Cipher getCipher() { return null; }
        public javax.crypto.Mac getMac() { return null; }
        public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private OnAuthenticationCancelListener(android.hardware.biometrics.BiometricPrompt p0) {}
        public void onCancel() {}
    }
}
