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
    private static final int MSG_CHALLENGE_GENERATED = 106;
    private static final int MSG_FINGERPRINT_DETECTED = 107;
    private static final int MSG_UDFPS_POINTER_DOWN = 108;
    private static final int MSG_UDFPS_POINTER_UP = 109;
    public static final int ENROLL_FIND_SENSOR = 1;
    public static final int ENROLL_ENROLL = 2;
    public static final int SENSOR_ID_ANY = -1;
    private android.hardware.fingerprint.IFingerprintService mService;
    private android.content.Context mContext;
    private android.os.IBinder mToken;
    private android.hardware.fingerprint.FingerprintManager.AuthenticationCallback mAuthenticationCallback;
    private android.hardware.fingerprint.FingerprintManager.FingerprintDetectionCallback mFingerprintDetectionCallback;
    private android.hardware.fingerprint.FingerprintManager.EnrollmentCallback mEnrollmentCallback;
    private android.hardware.fingerprint.FingerprintManager.RemovalCallback mRemovalCallback;
    private android.hardware.fingerprint.FingerprintManager.GenerateChallengeCallback mGenerateChallengeCallback;
    private android.hardware.fingerprint.FingerprintManager.CryptoObject mCryptoObject;
    private android.hardware.fingerprint.FingerprintManager.RemoveTracker mRemoveTracker;
    private android.os.Handler mHandler;
    private android.hardware.fingerprint.IFingerprintServiceReceiver mServiceReceiver;
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public java.util.List<android.hardware.biometrics.SensorProperties> getSensorProperties() { return null; }
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public android.hardware.biometrics.BiometricTestSession createTestSession(int p0) { return null; }
    private void useHandler(android.os.Handler p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.USE_BIOMETRIC", "android.permission.USE_FINGERPRINT"})
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, int p2, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p3, android.os.Handler p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.USE_BIOMETRIC", "android.permission.USE_FINGERPRINT"})
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p2, android.os.Handler p3, int p4) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.USE_BIOMETRIC", "android.permission.USE_FINGERPRINT"})
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p2, android.os.Handler p3, int p4, int p5) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void detectFingerprint(android.os.CancellationSignal p0, android.hardware.fingerprint.FingerprintManager.FingerprintDetectionCallback p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_FINGERPRINT")
    public void enroll(byte[] p0, android.os.CancellationSignal p1, int p2, android.hardware.fingerprint.FingerprintManager.EnrollmentCallback p3, int p4) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_FINGERPRINT")
    public void generateChallenge(int p0, int p1, android.hardware.fingerprint.FingerprintManager.GenerateChallengeCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_FINGERPRINT")
    public void generateChallenge(int p0, android.hardware.fingerprint.FingerprintManager.GenerateChallengeCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_FINGERPRINT")
    public void revokeChallenge(int p0, long p1) {}
    @android.annotation.RequiresPermission("android.permission.RESET_FINGERPRINT_LOCKOUT")
    public void resetLockout(int p0, int p1, byte[] p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_FINGERPRINT")
    public void remove(android.hardware.fingerprint.Fingerprint p0, int p1, android.hardware.fingerprint.FingerprintManager.RemovalCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_FINGERPRINT")
    public void removeAll(int p0, android.hardware.fingerprint.FingerprintManager.RemovalCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_FINGERPRINT")
    public void rename(int p0, int p1, java.lang.String p2) {}
    @android.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public java.util.List<android.hardware.fingerprint.Fingerprint> getEnrolledFingerprints() { return null; }
    public boolean hasEnrolledTemplates() { return false; }
    public boolean hasEnrolledTemplates(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean hasEnrolledTemplatesForAnySensor(int p0, java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> p1) { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void setSidefpsController(android.hardware.fingerprint.ISidefpsController p0) {}
    public void registerFingerprintStateListener(android.hardware.fingerprint.FingerprintStateListener p0) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPointerDown(int p0, int p1, int p2, float p3, float p4) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPointerUp(int p0) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onUiReady(int p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean hasEnrolledFingerprints() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.USE_FINGERPRINT", "android.permission.INTERACT_ACROSS_USERS"})
    public boolean hasEnrolledFingerprints(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean isHardwareDetected() { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal() { return null; }
    public boolean isPowerbuttonFps() { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) {}
    public void addLockoutResetCallback(android.hardware.fingerprint.FingerprintManager.LockoutResetCallback p0) {}
    private void sendRemovedResult(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    private void sendEnrollResult(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    private void sendAuthenticatedSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1, boolean p2) {}
    private void sendAuthenticatedFailed() {}
    private void sendAcquiredResult(int p0, int p1) {}
    private void sendErrorResult(int p0, int p1) {}
    private void sendChallengeGenerated(int p0, int p1, long p2) {}
    private void sendFingerprintDetected(int p0, int p1, boolean p2) {}
    private void sendUdfpsPointerDown(int p0) {}
    private void sendUdfpsPointerUp(int p0) {}
    public FingerprintManager(android.content.Context p0, android.hardware.fingerprint.IFingerprintService p1) {}
    private int getCurrentUserId() { return 0; }
    private android.hardware.fingerprint.FingerprintSensorPropertiesInternal getFirstFingerprintSensor() { return null; }
    private void cancelEnrollment() {}
    private void cancelAuthentication(android.hardware.biometrics.CryptoObject p0) {}
    private void cancelFingerprintDetect() {}
    public static java.lang.String getErrorString(android.content.Context p0, int p1, int p2) { return null; }
    public static java.lang.String getAcquiredString(android.content.Context p0, int p1, int p2) { return null; }

    @java.lang.Deprecated
    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.fingerprint.FingerprintManager.AuthenticationResult p0) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationAcquired(int p0) {}
        public void onUdfpsPointerDown(int p0) {}
        public void onUdfpsPointerUp(int p0) {}
    }

    @java.lang.Deprecated
    public static class AuthenticationResult {
        private android.hardware.fingerprint.Fingerprint mFingerprint;
        private android.hardware.fingerprint.FingerprintManager.CryptoObject mCryptoObject;
        private int mUserId;
        private boolean mIsStrongBiometric;
        public AuthenticationResult(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.hardware.fingerprint.Fingerprint p1, int p2, boolean p3) {}
        public android.hardware.fingerprint.FingerprintManager.CryptoObject getCryptoObject() { return null; }
        public android.hardware.fingerprint.Fingerprint getFingerprint() { return null; }
        public int getUserId() { return 0; }
        public boolean isStrongBiometric() { return false; }
    }

    @java.lang.Deprecated
    public static final class CryptoObject extends android.hardware.biometrics.CryptoObject {
        public CryptoObject(java.security.Signature p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Cipher p0) { super((java.security.Signature)null); }
        public CryptoObject(javax.crypto.Mac p0) { super((java.security.Signature)null); }
        public java.security.Signature getSignature() { return null; }
        public javax.crypto.Cipher getCipher() { return null; }
        public javax.crypto.Mac getMac() { return null; }
        public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnrollReason {
    }

    public static abstract class EnrollmentCallback {
        public EnrollmentCallback() {}
        public void onEnrollmentError(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentHelp(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentProgress(int p0) {}
    }

    public static interface FingerprintDetectionCallback {
        public void onFingerprintDetected(int p0, int p1, boolean p2);
    }

    public static interface GenerateChallengeCallback {
        public void onChallengeGenerated(int p0, int p1, long p2);
    }

    public static abstract class LockoutResetCallback {
        public LockoutResetCallback() {}
        public void onLockoutReset(int p0) {}
    }

    private class MyHandler extends android.os.Handler {
        private MyHandler(android.hardware.fingerprint.FingerprintManager p0, android.content.Context p1) { super(); }
        private MyHandler(android.hardware.fingerprint.FingerprintManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private android.hardware.biometrics.CryptoObject mCrypto;
        public OnAuthenticationCancelListener(android.hardware.fingerprint.FingerprintManager p0, android.hardware.biometrics.CryptoObject p1) {}
        public void onCancel() {}
    }

    private class OnEnrollCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private OnEnrollCancelListener(android.hardware.fingerprint.FingerprintManager p0) {}
        public void onCancel() {}
    }

    private class OnFingerprintDetectionCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private OnFingerprintDetectionCancelListener(android.hardware.fingerprint.FingerprintManager p0) {}
        public void onCancel() {}
    }

    public static abstract class RemovalCallback {
        public RemovalCallback() {}
        public void onRemovalError(android.hardware.fingerprint.Fingerprint p0, int p1, java.lang.CharSequence p2) {}
        public void onRemovalSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    }

    private static class RemoveTracker {
        static final int REMOVE_SINGLE = 1;
        static final int REMOVE_ALL = 2;
        @android.hardware.fingerprint.FingerprintManager.RemoveTracker.RemoveRequest
        final int mRemoveRequest = 0;
        final android.hardware.fingerprint.Fingerprint mSingleFingerprint = null;
        RemoveTracker(int p0, android.hardware.fingerprint.Fingerprint p1) {}

        static @interface RemoveRequest {
        }
    }
}
