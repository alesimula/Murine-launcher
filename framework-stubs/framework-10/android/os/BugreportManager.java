package android.os;

@android.annotation.SystemApi
public final class BugreportManager {
    private static final java.lang.String TAG = "BugreportManager";
    private final android.content.Context mContext = null;
    private final android.os.IDumpstate mBinder = null;
    public BugreportManager(android.content.Context p0, android.os.IDumpstate p1) {}
    public void startBugreport(android.os.ParcelFileDescriptor p0, android.os.ParcelFileDescriptor p1, android.os.BugreportParams p2, java.util.concurrent.Executor p3, android.os.BugreportManager.BugreportCallback p4) {}
    public void cancelBugreport() {}

    private final class DumpstateListener extends android.os.IDumpstateListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.os.BugreportManager.BugreportCallback mCallback = null;
        DumpstateListener(android.os.BugreportManager p0, java.util.concurrent.Executor p1, android.os.BugreportManager.BugreportCallback p2) { super(); }
        public void onProgress(int p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public void onFinished() throws android.os.RemoteException {}
        public void onProgressUpdated(int p0) throws android.os.RemoteException {}
        public void onMaxProgressUpdated(int p0) throws android.os.RemoteException {}
        public void onSectionComplete(java.lang.String p0, int p1, int p2, int p3) throws android.os.RemoteException {}
    }

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

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface BugreportErrorCode {
        }
    }
}
