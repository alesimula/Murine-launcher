package android.os;

public final class BugreportManager {
    public BugreportManager(android.content.Context p0, android.os.IDumpstate p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public void startBugreport(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.BugreportParams p2, java.util.concurrent.Executor p3, android.os.BugreportManager.BugreportCallback p4) {}
    public void startConnectivityBugreport(android.os.ParcelFileDescriptor p0, java.util.concurrent.Executor p1, android.os.BugreportManager.BugreportCallback p2) {}
    public void cancelBugreport() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.DUMP")
    public void requestBugreport(android.os.BugreportParams p0, java.lang.CharSequence p1, java.lang.CharSequence p2) {}

    public static abstract class BugreportCallback {
        public static final int BUGREPORT_ERROR_INVALID_INPUT = 1;
        public static final int BUGREPORT_ERROR_RUNTIME = 2;
        public static final int BUGREPORT_ERROR_USER_DENIED_CONSENT = 3;
        public static final int BUGREPORT_ERROR_USER_CONSENT_TIMED_OUT = 4;
        public static final int BUGREPORT_ERROR_ANOTHER_REPORT_IN_PROGRESS = 5;
        public BugreportCallback() {}
        public void onProgress(float p0) {}
        public void onError(int p0) {}
        public void onFinished() {}
        public void onEarlyReportFinished() {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BugreportErrorCode {
        }
    }

    private final class DumpstateListener extends android.os.IDumpstateListener.Stub {
        DumpstateListener(android.os.BugreportManager p0, java.util.concurrent.Executor p1, android.os.BugreportManager.BugreportCallback p2, boolean p3) { super(); }
        public void onProgress(int p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public void onFinished() throws android.os.RemoteException {}
        public void onScreenshotTaken(boolean p0) throws android.os.RemoteException {}
        public void onUiIntensiveBugreportDumpsFinished() throws android.os.RemoteException {}
    }
}
