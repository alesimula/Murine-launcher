package android.service.attention;

@android.annotation.SystemApi
public abstract class AttentionService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.attention.AttentionService";
    public static final int ATTENTION_SUCCESS_ABSENT = 0;
    public static final int ATTENTION_SUCCESS_PRESENT = 1;
    public static final int ATTENTION_FAILURE_UNKNOWN = 2;
    public static final int ATTENTION_FAILURE_CANCELLED = 3;
    public static final int ATTENTION_FAILURE_PREEMPTED = 4;
    public static final int ATTENTION_FAILURE_TIMED_OUT = 5;
    public static final int ATTENTION_FAILURE_CAMERA_PERMISSION_ABSENT = 6;
    public static final double PROXIMITY_UNKNOWN = -1.0;
    public AttentionService() { super(); }
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onCheckAttention(android.service.attention.AttentionService.AttentionCallback p0);
    public abstract void onCancelAttentionCheck(android.service.attention.AttentionService.AttentionCallback p0);
    public void onStartProximityUpdates(android.service.attention.AttentionService.ProximityUpdateCallback p0) {}
    public void onStopProximityUpdates() {}

    public static final class AttentionCallback {
        public void onSuccess(int p0, long p1) {}
        public void onFailure(int p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttentionFailureCodes {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AttentionSuccessCodes {
    }

    public static final class ProximityUpdateCallback {
        public void onProximityUpdate(double p0) {}
    }
}
