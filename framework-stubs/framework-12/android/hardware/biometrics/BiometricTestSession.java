package android.hardware.biometrics;

public class BiometricTestSession implements java.lang.AutoCloseable {
    private static final java.lang.String BASE_TAG = "BiometricTestSession";
    private final android.content.Context mContext = null;
    private final int mSensorId = 0;
    private final android.hardware.biometrics.ITestSession mTestSession = null;
    private final android.util.ArraySet<java.lang.Integer> mTestedUsers = null;
    private java.util.concurrent.CountDownLatch mCloseLatch;
    private final android.util.ArraySet<java.lang.Integer> mUsersCleaningUp = null;
    private final android.hardware.biometrics.ITestSessionCallback mCallback = null;
    public BiometricTestSession(android.content.Context p0, int p1, android.hardware.biometrics.BiometricTestSession.TestSessionProvider p2) throws android.os.RemoteException {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    private void setTestHalEnabled(boolean p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public void startEnroll(int p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public void finishEnroll(int p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public void acceptAuthentication(int p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public void rejectAuthentication(int p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public void notifyAcquired(int p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public void notifyError(int p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public void cleanupInternalState(int p0) {}
    @android.annotation.RequiresPermission("android.permission.TEST_BIOMETRIC")
    public void close() {}
    private java.lang.String getTag() { return null; }

    public static interface TestSessionProvider {
        public android.hardware.biometrics.ITestSession createTestSession(android.content.Context p0, int p1, android.hardware.biometrics.ITestSessionCallback p2) throws android.os.RemoteException;
    }
}
