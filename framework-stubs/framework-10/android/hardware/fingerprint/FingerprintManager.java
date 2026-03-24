package android.hardware.fingerprint;

@java.lang.Deprecated
public class FingerprintManager implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricFingerprintConstants {
    private static final java.lang.String TAG = "FingerprintManager";
    private static final boolean DEBUG = true;
    private static final int MSG_ENROLL_RESULT = 100;
    private static final int MSG_ACQUIRED = 101;
    private static final int MSG_AUTHENTICATION_SUCCEEDED = 102;
    private static final int MSG_AUTHENTICATION_FAILED = 103;
    private static final int MSG_ERROR = 104;
    private static final int MSG_REMOVED = 105;
    private static final int MSG_ENUMERATED = 106;
    private android.hardware.fingerprint.IFingerprintService mService;
    private android.content.Context mContext;
    private android.os.IBinder mToken;
    private android.hardware.fingerprint.FingerprintManager.AuthenticationCallback mAuthenticationCallback;
    private android.hardware.fingerprint.FingerprintManager.EnrollmentCallback mEnrollmentCallback;
    private android.hardware.fingerprint.FingerprintManager.RemovalCallback mRemovalCallback;
    private android.hardware.fingerprint.FingerprintManager.EnumerateCallback mEnumerateCallback;
    private android.hardware.fingerprint.FingerprintManager.CryptoObject mCryptoObject;
    private android.hardware.fingerprint.Fingerprint mRemovalFingerprint;
    private android.os.Handler mHandler;
    private android.hardware.fingerprint.IFingerprintServiceReceiver mServiceReceiver;
    @java.lang.Deprecated
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, int p2, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p3, android.os.Handler p4) {}
    private void useHandler(android.os.Handler p0) {}
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, int p2, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p3, android.os.Handler p4, int p5) {}
    public void enroll(byte[] p0, android.os.CancellationSignal p1, int p2, int p3, android.hardware.fingerprint.FingerprintManager.EnrollmentCallback p4) {}
    public long preEnroll() { return 0L; }
    public int postEnroll() { return 0; }
    public void setActiveUser(int p0) {}
    public void remove(android.hardware.fingerprint.Fingerprint p0, int p1, android.hardware.fingerprint.FingerprintManager.RemovalCallback p2) {}
    public void enumerate(int p0, android.hardware.fingerprint.FingerprintManager.EnumerateCallback p1) {}
    public void rename(int p0, int p1, java.lang.String p2) {}
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints() { return null; }
    public boolean hasEnrolledTemplates() { return false; }
    public boolean hasEnrolledTemplates(int p0) { return false; }
    @java.lang.Deprecated
    public boolean hasEnrolledFingerprints() { return false; }
    public boolean hasEnrolledFingerprints(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isHardwareDetected() { return false; }
    @android.annotation.UnsupportedAppUsage
    public long getAuthenticatorId() { return 0L; }
    public void addLockoutResetCallback(android.hardware.fingerprint.FingerprintManager.LockoutResetCallback p0) {}
    private void sendRemovedResult(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    private void sendEnumeratedResult(long p0, int p1, int p2) {}
    private void sendEnrollResult(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    private void sendAuthenticatedSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    private void sendAuthenticatedFailed() {}
    private void sendAcquiredResult(long p0, int p1, int p2) {}
    private void sendErrorResult(long p0, int p1, int p2) {}
    public FingerprintManager(android.content.Context p0, android.hardware.fingerprint.IFingerprintService p1) {}
    private int getCurrentUserId() { return 0; }
    private void cancelEnrollment() {}
    private void cancelAuthentication(android.hardware.biometrics.CryptoObject p0) {}
    public static java.lang.String getErrorString(android.content.Context p0, int p1, int p2) { return null; }
    public static java.lang.String getAcquiredString(android.content.Context p0, int p1, int p2) { return null; }

    public static abstract class RemovalCallback {
        public RemovalCallback() {}
        public void onRemovalError(android.hardware.fingerprint.Fingerprint p0, int p1, java.lang.CharSequence p2) {}
        public void onRemovalSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    }

    private class OnEnrollCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private OnEnrollCancelListener(android.hardware.fingerprint.FingerprintManager p0) {}
        public void onCancel() {}
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private android.hardware.biometrics.CryptoObject mCrypto;
        public OnAuthenticationCancelListener(android.hardware.fingerprint.FingerprintManager p0, android.hardware.biometrics.CryptoObject p1) {}
        public void onCancel() {}
    }

    private class MyHandler extends android.os.Handler {
        private MyHandler(android.hardware.fingerprint.FingerprintManager p0, android.content.Context p1) { super(); }
        private MyHandler(android.hardware.fingerprint.FingerprintManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static abstract class LockoutResetCallback {
        public LockoutResetCallback() {}
        public void onLockoutReset() {}
    }

    public static abstract class EnumerateCallback {
        public EnumerateCallback() {}
        public void onEnumerateError(int p0, java.lang.CharSequence p1) {}
        public void onEnumerate(android.hardware.fingerprint.Fingerprint p0) {}
    }

    public static abstract class EnrollmentCallback {
        public EnrollmentCallback() {}
        public void onEnrollmentError(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentHelp(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentProgress(int p0) {}
    }

    @java.lang.Deprecated
    public static final class CryptoObject extends android.hardware.biometrics.CryptoObject {
        public CryptoObject(java.security.Signature p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Cipher p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Mac p0) { super((java.security.Signature)null); }
        public java.security.Signature getSignature() { return null; }
        public javax.crypto.Cipher getCipher() { return null; }
        public javax.crypto.Mac getMac() { return null; }
    }

    @java.lang.Deprecated
    public static class AuthenticationResult {
        private android.hardware.fingerprint.Fingerprint mFingerprint;
        private android.hardware.fingerprint.FingerprintManager.CryptoObject mCryptoObject;
        private int mUserId;
        public AuthenticationResult(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.hardware.fingerprint.Fingerprint p1, int p2) {}
        public android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject() { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.hardware.fingerprint.Fingerprint getFingerprint() { return null; }
        public int getUserId() { return 0; }
    }

    @java.lang.Deprecated
    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult p0) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationAcquired(int p0) {}
    }
}
