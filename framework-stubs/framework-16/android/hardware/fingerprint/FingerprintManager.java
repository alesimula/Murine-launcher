package android.hardware.fingerprint;

@java.lang.Deprecated
public class FingerprintManager implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricFingerprintConstants {
    public static final int ENROLL_FIND_SENSOR = 1;
    public static final int ENROLL_ENROLL = 2;
    public static final int UDFPS_UI_OVERLAY_SHOWN = 1;
    public static final int UDFPS_UI_READY = 2;
    public static final int SENSOR_ID_ANY = -1;
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public java.util.List<android.hardware.biometrics.SensorProperties> getSensorProperties() { return null; }
    @android.annotation.NonNull
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public android.hardware.biometrics.BiometricTestSession createTestSession(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.USE_BIOMETRIC", "android.permission.USE_FINGERPRINT"})
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, int p2, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p3, android.os.Handler p4) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.USE_BIOMETRIC", "android.permission.USE_FINGERPRINT"})
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p2, android.os.Handler p3, int p4) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.USE_BIOMETRIC", "android.permission.USE_FINGERPRINT"})
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p2, android.os.Handler p3, int p4, int p5, int p6) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.USE_BIOMETRIC", "android.permission.USE_FINGERPRINT"})
    public void authenticate(android.hardware.fingerprint.FingerprintManager.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.fingerprint.FingerprintManager.AuthenticationCallback p2, android.os.Handler p3, android.hardware.fingerprint.FingerprintAuthenticateOptions p4) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void detectFingerprint(android.os.CancellationSignal p0, android.hardware.fingerprint.FingerprintManager.FingerprintDetectionCallback p1, android.hardware.fingerprint.FingerprintAuthenticateOptions p2) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void setIgnoreDisplayTouches(long p0, int p1, boolean p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_FINGERPRINT")
    public void enroll(byte[] p0, android.os.CancellationSignal p1, int p2, android.hardware.fingerprint.FingerprintManager.EnrollmentCallback p3, int p4, android.hardware.fingerprint.FingerprintEnrollOptions p5) {}
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
    public void setUdfpsOverlayController(android.hardware.fingerprint.IUdfpsOverlayController p0) {}
    public void registerBiometricStateListener(android.hardware.biometrics.BiometricStateListener p0) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPointerDown(long p0, int p1, int p2, int p3, float p4, float p5) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPointerUp(long p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPointerDown(long p0, int p1, int p2, float p3, float p4, float p5, float p6, float p7, long p8, long p9, boolean p10) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPointerUp(long p0, int p1, int p2, float p3, float p4, float p5, float p6, float p7, long p8, long p9, boolean p10) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onUdfpsUiEvent(int p0, long p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void onPowerPressed() {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean hasEnrolledFingerprints() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.USE_FINGERPRINT", "android.permission.INTERACT_ACROSS_USERS"})
    public boolean hasEnrolledFingerprints(int p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public boolean isHardwareDetected() { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    @android.annotation.NonNull
    public java.util.List<android.hardware.fingerprint.FingerprintSensorPropertiesInternal> getSensorPropertiesInternal() { return null; }
    public boolean isPowerbuttonFps() { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void addAuthenticatorsRegisteredCallback(android.hardware.fingerprint.IFingerprintAuthenticatorsRegisteredCallback p0) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int getLockoutModeForUser(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void scheduleWatchdog() {}
    public void addLockoutResetCallback(android.hardware.fingerprint.FingerprintManager.LockoutResetCallback p0) {}
    public FingerprintManager(android.content.Context p0, android.hardware.fingerprint.IFingerprintService p1) {}
    public int getEnrollStageCount() { return 0; }
    public float getEnrollStageThreshold(int p0) { return 0.0f; }
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
        @java.lang.Deprecated
        public android.security.identity.IdentityCredential getIdentityCredential() { return null; }
        public android.security.identity.PresentationSession getPresentationSession() { return null; }
        @android.annotation.FlaggedApi("android.hardware.biometrics.add_key_agreement_crypto_object")
        public javax.crypto.KeyAgreement getKeyAgreement() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EnrollReason {
    }

    public static abstract class EnrollmentCallback {
        public EnrollmentCallback() {}
        public void onEnrollmentError(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentHelp(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentProgress(int p0) {}
        public void onAcquired(boolean p0) {}
        public void onUdfpsPointerDown(int p0) {}
        public void onUdfpsPointerUp(int p0) {}
        public void onUdfpsOverlayShown() {}
    }

    public static interface FingerprintDetectionCallback {
        public void onFingerprintDetected(int p0, int p1, boolean p2);
        default public void onDetectionError(int p0) {}
    }

    class FingerprintServiceReceiver extends android.hardware.fingerprint.IFingerprintServiceReceiver.Stub {
        FingerprintServiceReceiver(android.hardware.fingerprint.FingerprintManager p0, android.hardware.fingerprint.FingerprintCallback p1) { super(); }
        public void onEnrollResult(android.hardware.fingerprint.Fingerprint p0, int p1) {}
        public void onAcquired(int p0, int p1) {}
        public void onAuthenticationSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1, boolean p2) {}
        public void onFingerprintDetected(int p0, int p1, boolean p2) {}
        public void onAuthenticationFailed() {}
        public void onError(int p0, int p1) {}
        public void onRemoved(android.hardware.fingerprint.Fingerprint p0, int p1) {}
        public void onChallengeGenerated(int p0, int p1, long p2) {}
        public void onUdfpsPointerDown(int p0) {}
        public void onUdfpsPointerUp(int p0) {}
        public void onUdfpsOverlayShown() {}
    }

    public static interface GenerateChallengeCallback {
        public void onChallengeGenerated(int p0, int p1, long p2);
    }

    public static abstract class LockoutResetCallback {
        public LockoutResetCallback() {}
        public void onLockoutReset(int p0) {}
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        OnAuthenticationCancelListener(android.hardware.fingerprint.FingerprintManager p0, long p1) {}
        public void onCancel() {}
    }

    private class OnEnrollCancelListener implements android.os.CancellationSignal.OnCancelListener {
        public void onCancel() {}
    }

    private class OnFingerprintDetectionCancelListener implements android.os.CancellationSignal.OnCancelListener {
        OnFingerprintDetectionCancelListener(android.hardware.fingerprint.FingerprintManager p0, long p1) {}
        public void onCancel() {}
    }

    public static abstract class RemovalCallback {
        public RemovalCallback() {}
        public void onRemovalError(android.hardware.fingerprint.Fingerprint p0, int p1, java.lang.CharSequence p2) {}
        public void onRemovalSucceeded(android.hardware.fingerprint.Fingerprint p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface UdfpsUiEvent {
    }
}
