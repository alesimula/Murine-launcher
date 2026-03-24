package android.hardware.face;

public class FaceManager implements android.hardware.biometrics.BiometricAuthenticator, android.hardware.biometrics.BiometricFaceConstants {
    private static final java.lang.String TAG = "FaceManager";
    private static final boolean DEBUG = true;
    private static final int MSG_ENROLL_RESULT = 100;
    private static final int MSG_ACQUIRED = 101;
    private static final int MSG_AUTHENTICATION_SUCCEEDED = 102;
    private static final int MSG_AUTHENTICATION_FAILED = 103;
    private static final int MSG_ERROR = 104;
    private static final int MSG_REMOVED = 105;
    private static final int MSG_GET_FEATURE_COMPLETED = 106;
    private static final int MSG_SET_FEATURE_COMPLETED = 107;
    private android.hardware.face.IFaceService mService;
    private final android.content.Context mContext = null;
    private android.os.IBinder mToken;
    private android.hardware.face.FaceManager.AuthenticationCallback mAuthenticationCallback;
    private android.hardware.face.FaceManager.EnrollmentCallback mEnrollmentCallback;
    private android.hardware.face.FaceManager.RemovalCallback mRemovalCallback;
    private android.hardware.face.FaceManager.SetFeatureCallback mSetFeatureCallback;
    private android.hardware.face.FaceManager.GetFeatureCallback mGetFeatureCallback;
    private android.hardware.biometrics.CryptoObject mCryptoObject;
    private android.hardware.face.Face mRemovalFace;
    private android.os.Handler mHandler;
    private android.hardware.face.IFaceServiceReceiver mServiceReceiver;
    public FaceManager(android.content.Context p0, android.hardware.face.IFaceService p1) {}
    public void authenticate(android.hardware.biometrics.CryptoObject p0, android.os.CancellationSignal p1, int p2, android.hardware.face.FaceManager.AuthenticationCallback p3, android.os.Handler p4) {}
    private void useHandler(android.os.Handler p0) {}
    public void authenticate(android.hardware.biometrics.CryptoObject p0, android.os.CancellationSignal p1, int p2, android.hardware.face.FaceManager.AuthenticationCallback p3, android.os.Handler p4, int p5) {}
    public void enroll(int p0, byte[] p1, android.os.CancellationSignal p2, android.hardware.face.FaceManager.EnrollmentCallback p3, int[] p4) {}
    public long generateChallenge() { return 0L; }
    public int revokeChallenge() { return 0; }
    public void setFeature(int p0, int p1, boolean p2, byte[] p3, android.hardware.face.FaceManager.SetFeatureCallback p4) {}
    public void getFeature(int p0, int p1, android.hardware.face.FaceManager.GetFeatureCallback p2) {}
    public void userActivity() {}
    public void setActiveUser(int p0) {}
    public void remove(android.hardware.face.Face p0, int p1, android.hardware.face.FaceManager.RemovalCallback p2) {}
    public java.util.List<android.hardware.face.Face> getEnrolledFaces(int p0) { return null; }
    public java.util.List<android.hardware.face.Face> getEnrolledFaces() { return null; }
    public boolean hasEnrolledTemplates() { return false; }
    public boolean hasEnrolledTemplates(int p0) { return false; }
    public boolean isHardwareDetected() { return false; }
    public void addLockoutResetCallback(android.hardware.face.FaceManager.LockoutResetCallback p0) {}
    private int getCurrentUserId() { return 0; }
    private void cancelEnrollment() {}
    private void cancelAuthentication(android.hardware.biometrics.CryptoObject p0) {}
    public static java.lang.String getErrorString(android.content.Context p0, int p1, int p2) { return null; }
    public static java.lang.String getAcquiredString(android.content.Context p0, int p1, int p2) { return null; }
    public static int getMappedAcquiredInfo(int p0, int p1) { return 0; }
    private void sendSetFeatureCompleted(boolean p0, int p1) {}
    private void sendGetFeatureCompleted(boolean p0, int p1, boolean p2) {}
    private void sendRemovedResult(android.hardware.face.Face p0, int p1) {}
    private void sendErrorResult(long p0, int p1, int p2) {}
    private void sendEnrollResult(android.hardware.face.Face p0, int p1) {}
    private void sendAuthenticatedSucceeded(android.hardware.face.Face p0, int p1, boolean p2) {}
    private void sendAuthenticatedFailed() {}
    private void sendAcquiredResult(long p0, int p1, int p2) {}

    public static abstract class AuthenticationCallback extends android.hardware.biometrics.BiometricAuthenticator.AuthenticationCallback {
        public AuthenticationCallback() { super(); }
        public void onAuthenticationError(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationHelp(int p0, java.lang.CharSequence p1) {}
        public void onAuthenticationSucceeded(android.hardware.face.FaceManager.AuthenticationResult p0) {}
        public void onAuthenticationFailed() {}
        public void onAuthenticationAcquired(int p0) {}
    }

    public static class AuthenticationResult {
        private android.hardware.face.Face mFace;
        private android.hardware.biometrics.CryptoObject mCryptoObject;
        private int mUserId;
        private boolean mIsStrongBiometric;
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
        public void onEnrollmentProgress(int p0) {}
    }

    public static abstract class GetFeatureCallback {
        public GetFeatureCallback() {}
        public abstract void onCompleted(boolean p0, int p1, boolean p2);
    }

    public static abstract class LockoutResetCallback {
        public LockoutResetCallback() {}
        public void onLockoutReset() {}
    }

    private class MyHandler extends android.os.Handler {
        private MyHandler(android.hardware.face.FaceManager p0, android.content.Context p1) { super(); }
        private MyHandler(android.hardware.face.FaceManager p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private class OnAuthenticationCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private android.hardware.biometrics.CryptoObject mCrypto;
        OnAuthenticationCancelListener(android.hardware.face.FaceManager p0, android.hardware.biometrics.CryptoObject p1) {}
        public void onCancel() {}
    }

    private class OnEnrollCancelListener implements android.os.CancellationSignal.OnCancelListener {
        private OnEnrollCancelListener(android.hardware.face.FaceManager p0) {}
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
