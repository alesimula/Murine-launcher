package android.hardware.face;

public class FaceManager implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricFaceConstants {
    public FaceManager(android.content.Context p0, android.hardware.face.IFaceService p1) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void authenticate(android.hardware.biometrics.CryptoObject p0, android.os.CancellationSignal p1, android.hardware.face.FaceManager.AuthenticationCallback p2, android.os.Handler p3, int p4, boolean p5) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void detectFace(android.os.CancellationSignal p0, android.hardware.face.FaceManager.FaceDetectionCallback p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void enroll(int p0, byte[] p1, android.os.CancellationSignal p2, android.hardware.face.FaceManager.EnrollmentCallback p3, int[] p4) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void enroll(int p0, byte[] p1, android.os.CancellationSignal p2, android.hardware.face.FaceManager.EnrollmentCallback p3, int[] p4, android.view.Surface p5, boolean p6) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void enrollRemotely(int p0, byte[] p1, android.os.CancellationSignal p2, android.hardware.face.FaceManager.EnrollmentCallback p3, int[] p4) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void generateChallenge(int p0, int p1, android.hardware.face.FaceManager.GenerateChallengeCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void generateChallenge(int p0, android.hardware.face.FaceManager.GenerateChallengeCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void revokeChallenge(int p0, int p1, long p2) {}
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void resetLockout(int p0, int p1, byte[] p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void setFeature(int p0, int p1, boolean p2, byte[] p3, android.hardware.face.FaceManager.SetFeatureCallback p4) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void getFeature(int p0, int p1, android.hardware.face.FaceManager.GetFeatureCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void remove(android.hardware.face.Face p0, int p1, android.hardware.face.FaceManager.RemovalCallback p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public void removeAll(int p0, android.hardware.face.FaceManager.RemovalCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_BIOMETRIC")
    public java.util.List<android.hardware.face.Face> getEnrolledFaces() { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean hasEnrolledTemplates() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.USE_BIOMETRIC_INTERNAL", "android.permission.INTERACT_ACROSS_USERS"})
    public boolean hasEnrolledTemplates(int p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public boolean isHardwareDetected() { return false; }
    public java.util.List<android.hardware.face.FaceSensorProperties> getSensorProperties() { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public java.util.List<android.hardware.face.FaceSensorPropertiesInternal> getSensorPropertiesInternal() { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public int getLockoutModeForUser(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.USE_BIOMETRIC_INTERNAL")
    public void addLockoutResetCallback(android.hardware.face.FaceManager.LockoutResetCallback p0) {}
    public static java.lang.String getErrorString(android.content.Context p0, int p1, int p2) { return null; }
    public static int getMappedAcquiredInfo(int p0, int p1) { return 0; }
    public static java.lang.String getAuthHelpMessage(android.content.Context p0, int p1, int p2) { return null; }
    public static java.lang.String getEnrollHelpMessage(android.content.Context p0, int p1, int p2) { return null; }

    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.face.FaceManager.AuthenticationResult p0) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationAcquired(int p0) {}
    }

    public static class AuthenticationResult {
        public AuthenticationResult(android.hardware.biometrics.CryptoObject p0, android.hardware.face.Face p1, int p2, boolean p3) {}
        public android.hardware.biometrics.CryptoObject getCryptoObject() { return null; }
        public android.hardware.face.Face getFace() { return null; }
        public int getUserId() { return 0; }
        public boolean isStrongBiometric() { return false; }
    }

    public static abstract class EnrollmentCallback {
        public EnrollmentCallback() {}
        public void onEnrollmentError(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentHelp(int p0, java.lang.CharSequence p1) {}
        public void onEnrollmentFrame(int p0, java.lang.CharSequence p1, android.hardware.face.FaceEnrollCell p2, int p3, float p4, float p5, float p6) {}
        public void onEnrollmentProgress(int p0) {}
    }

    public static interface FaceDetectionCallback {
        public void onFaceDetected(int p0, int p1, boolean p2);
    }

    public static interface GenerateChallengeCallback {
        public void onGenerateChallengeResult(int p0, int p1, long p2);
    }

    public static abstract class GetFeatureCallback {
        public GetFeatureCallback() {}
        public abstract void onCompleted(boolean p0, int[] p1, boolean[] p2);
    }

    public static abstract class LockoutResetCallback {
        public LockoutResetCallback() {}
        public void onLockoutReset(int p0) {}
    }

    private class MyHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        OnAuthenticationCancelListener(android.hardware.face.FaceManager p0, long p1) {}
        public void onCancel() {}
    }

    private class OnEnrollCancelListener implements android.os.CancellationSignal.OnCancelListener {
        public void onCancel() {}
    }

    private class OnFaceDetectionCancelListener implements android.os.CancellationSignal.OnCancelListener {
        OnFaceDetectionCancelListener(android.hardware.face.FaceManager p0, long p1) {}
        public void onCancel() {}
    }

    public static abstract class RemovalCallback {
        public RemovalCallback() {}
        public void onRemovalError(android.hardware.face.Face p0, int p1, java.lang.CharSequence p2) {}
        public void onRemovalSucceeded(android.hardware.face.Face p0, int p1) {}
    }

    public static abstract class SetFeatureCallback {
        public SetFeatureCallback() {}
        public abstract void onCompleted(boolean p0, int p1);
    }
}
