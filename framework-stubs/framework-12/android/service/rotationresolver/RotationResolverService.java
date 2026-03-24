package android.service.rotationresolver;

@android.annotation.SystemApi
public abstract class RotationResolverService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.rotationresolver.RotationResolverService";
    public static final int ROTATION_RESULT_FAILURE_CANCELLED = 0;
    public static final int ROTATION_RESULT_FAILURE_TIMED_OUT = 1;
    public static final int ROTATION_RESULT_FAILURE_PREEMPTED = 2;
    public static final int ROTATION_RESULT_FAILURE_UNKNOWN = 3;
    public static final int ROTATION_RESULT_FAILURE_NOT_SUPPORTED = 4;
    private final android.os.Handler mMainThreadHandler = null;
    private android.service.rotationresolver.RotationResolverService.RotationResolverCallbackWrapper mPendingCallback;
    private android.os.CancellationSignal mCancellationSignal;
    public RotationResolverService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    private void resolveRotation(android.service.rotationresolver.IRotationResolverCallback p0, android.service.rotationresolver.RotationResolutionRequest p1, android.os.ICancellationSignal p2) {}
    private void sendRotationResult(android.service.rotationresolver.IRotationResolverCallback p0, int p1) {}
    private void sendFailureResult(android.service.rotationresolver.IRotationResolverCallback p0, int p1) {}
    private void reportFailures(android.service.rotationresolver.IRotationResolverCallback p0, int p1) {}
    public abstract void onResolveRotation(android.service.rotationresolver.RotationResolutionRequest p0, android.os.CancellationSignal p1, android.service.rotationresolver.RotationResolverService.RotationResolverCallback p2);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FailureCodes {
    }

    public static interface RotationResolverCallback {
        public void onSuccess(int p0);
        public void onFailure(int p0);
    }

    public static final class RotationResolverCallbackWrapper implements android.service.rotationresolver.RotationResolverService.RotationResolverCallback {
        private final android.service.rotationresolver.IRotationResolverCallback mCallback = null;
        private final android.service.rotationresolver.RotationResolverService mService = null;
        private final android.os.Handler mHandler = null;
        private final long mExpirationTime = 0L;
        private RotationResolverCallbackWrapper(android.service.rotationresolver.IRotationResolverCallback p0, android.service.rotationresolver.RotationResolverService p1, long p2) {}
        public void onSuccess(int p0) {}
        public void onFailure(int p0) {}
    }
}
