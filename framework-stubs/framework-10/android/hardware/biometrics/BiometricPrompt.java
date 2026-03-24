package android.hardware.biometrics;

public class BiometricPrompt implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricConstants {
    private static final java.lang.String TAG = "BiometricPrompt";
    public static final java.lang.String KEY_TITLE = "title";
    public static final java.lang.String KEY_USE_DEFAULT_TITLE = "use_default_title";
    public static final java.lang.String KEY_SUBTITLE = "subtitle";
    public static final java.lang.String KEY_DESCRIPTION = "description";
    public static final java.lang.String KEY_POSITIVE_TEXT = "positive_text";
    public static final java.lang.String KEY_NEGATIVE_TEXT = "negative_text";
    public static final java.lang.String KEY_REQUIRE_CONFIRMATION = "require_confirmation";
    public static final java.lang.String KEY_ALLOW_DEVICE_CREDENTIAL = "allow_device_credential";
    public static final java.lang.String KEY_FROM_CONFIRM_DEVICE_CREDENTIAL = "from_confirm_device_credential";
    public static final int HIDE_DIALOG_DELAY = 2000;
    public static final int DISMISSED_REASON_POSITIVE = 1;
    public static final int DISMISSED_REASON_NEGATIVE = 2;
    public static final int DISMISSED_REASON_USER_CANCEL = 3;
    private final android.os.IBinder mToken = null;
    private final android.content.Context mContext = null;
    private final android.hardware.biometrics.IBiometricService mService = null;
    private final android.os.Bundle mBundle = null;
    private final android.hardware.biometrics.BiometricPrompt.ButtonInfo mPositiveButtonInfo = null;
    private final android.hardware.biometrics.BiometricPrompt.ButtonInfo mNegativeButtonInfo = null;
    private android.hardware.biometrics.BiometricPrompt.CryptoObject mCryptoObject;
    private java.util.concurrent.Executor mExecutor;
    private android.hardware.biometrics.BiometricPrompt.AuthenticationCallback mAuthenticationCallback;
    private final android.hardware.biometrics.IBiometricServiceReceiver mBiometricServiceReceiver = null;
    private BiometricPrompt(android.content.Context p0, android.os.Bundle p1, android.hardware.biometrics.BiometricPrompt.ButtonInfo p2, android.hardware.biometrics.BiometricPrompt.ButtonInfo p3) {}
    public void authenticateUser(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2, int p3, android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback p4) {}
    public void authenticate(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p3) {}
    public void authenticate(android.os.CancellationSignal p0, java.util.concurrent.Executor p1, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p2) {}
    private void cancelAuthentication() {}
    private void authenticateInternal(android.hardware.biometrics.BiometricPrompt.CryptoObject p0, android.os.CancellationSignal p1, java.util.concurrent.Executor p2, android.hardware.biometrics.BiometricPrompt.AuthenticationCallback p3, int p4, android.hardware.biometrics.IBiometricConfirmDeviceCredentialCallback p5) {}

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private OnAuthenticationCancelListener(android.hardware.biometrics.BiometricPrompt p0) {}
        public void onCancel() {}
    }

    public static final class CryptoObject extends android.hardware.biometrics.CryptoObject {
        public CryptoObject(java.security.Signature p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Cipher p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Mac p0) { super((java.security.Signature)null); }
        public java.security.Signature getSignature() { return null; }
        public javax.crypto.Cipher getCipher() { return null; }
        public javax.crypto.Mac getMac() { return null; }
    }

    private static class ButtonInfo {
        java.util.concurrent.Executor executor;
        android.content.DialogInterface.OnClickListener listener;
        ButtonInfo(java.util.concurrent.Executor p0, android.content.DialogInterface.OnClickListener p1) {}
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
        public android.hardware.biometrics.BiometricPrompt.Builder setPositiveButton(java.lang.CharSequence p0, java.util.concurrent.Executor p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setNegativeButton(java.lang.CharSequence p0, java.util.concurrent.Executor p1, android.content.DialogInterface.OnClickListener p2) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setConfirmationRequired(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setDeviceCredentialAllowed(boolean p0) { return null; }
        public android.hardware.biometrics.BiometricPrompt.Builder setFromConfirmDeviceCredential() { return null; }
        public android.hardware.biometrics.BiometricPrompt build() { return null; }
    }

    public static class AuthenticationResult extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationResult {
        public AuthenticationResult(android.hardware.biometrics.BiometricPrompt.CryptoObject p0) { super(); }
        public android.hardware.biometrics.BiometricPrompt.CryptoObject getCryptoObject() { return null; }
    }

    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.biometrics.BiometricPrompt.AuthenticationResult p0) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationAcquired(int p0) {}
    }
}
