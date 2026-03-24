package android.hardware.biometrics;

public class BiometricTestSession implements java.lang.AutoCloseable {
    public BiometricTestSession(android.content.Context p0, java.util.List<android.hardware.biometrics.SensorProperties> p1, int p2, android.hardware.biometrics.BiometricTestSession.TestSessionProvider p3) throws android.os.RemoteException {}
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

    private class TestSessionCallbackIml extends android.hardware.biometrics.ITestSessionCallback.Stub {
        public void onCleanupStarted(int p0) {}
        public void onCleanupFinished(int p0) {}
    }

    public static interface TestSessionProvider {
        @android.annotation.NonNull
        public android.hardware.biometrics.ITestSession createTestSession(android.content.Context p0, int p1, android.hardware.biometrics.ITestSessionCallback p2) throws android.os.RemoteException;
    }
}
