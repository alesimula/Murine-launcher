package android.service.rotationresolver;

@android.annotation.SystemApi
public abstract class RotationResolverService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.rotationresolver.RotationResolverService";
    public static final int ROTATION_RESULT_FAILURE_CANCELLED = 0;
    public static final int ROTATION_RESULT_FAILURE_TIMED_OUT = 1;
    public static final int ROTATION_RESULT_FAILURE_PREEMPTED = 2;
    public static final int ROTATION_RESULT_FAILURE_UNKNOWN = 3;
    public static final int ROTATION_RESULT_FAILURE_NOT_SUPPORTED = 4;
    public RotationResolverService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onResolveRotation(android.service.rotationresolver.RotationResolutionRequest p0, android.os.CancellationSignal p1, android.service.rotationresolver.RotationResolverService.RotationResolverCallback p2);

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FailureCodes {
    }

    public static interface RotationResolverCallback {
        public void onSuccess(int p0);
        public void onFailure(int p0);
    }

    public static final class RotationResolverCallbackWrapper implements android.service.rotationresolver.RotationResolverService.RotationResolverCallback {
        public void onSuccess(int p0) {}
        public void onFailure(int p0) {}
    }
}
