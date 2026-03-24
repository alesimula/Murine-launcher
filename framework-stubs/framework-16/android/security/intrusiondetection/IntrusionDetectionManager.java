package android.security.intrusiondetection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.security.afl_api")
public class IntrusionDetectionManager {
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_DISABLED = 1;
    public static final int STATE_ENABLED = 2;
    public static final int ERROR_UNKNOWN = 0;
    public static final int ERROR_PERMISSION_DENIED = 1;
    public static final int ERROR_TRANSPORT_UNAVAILABLE = 3;
    public static final int ERROR_DATA_SOURCE_UNAVAILABLE = 4;
    public IntrusionDetectionManager(android.security.intrusiondetection.IIntrusionDetectionService p0) {}
    @android.annotation.RequiresPermission("android.permission.READ_INTRUSION_DETECTION_STATE")
    public void addStateCallback(java.util.concurrent.Executor p0, java.util.function.Consumer<java.lang.Integer> p1) {}
    @android.annotation.RequiresPermission("android.permission.READ_INTRUSION_DETECTION_STATE")
    public void removeStateCallback(java.util.function.Consumer<java.lang.Integer> p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_INTRUSION_DETECTION_STATE")
    public void enable(java.util.concurrent.Executor p0, android.security.intrusiondetection.IntrusionDetectionManager.CommandCallback p1) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_INTRUSION_DETECTION_STATE")
    public void disable(java.util.concurrent.Executor p0, android.security.intrusiondetection.IntrusionDetectionManager.CommandCallback p1) {}

    public static interface CommandCallback {
        public void onSuccess();
        public void onFailure(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IntrusionDetectionError {
    }

    @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IntrusionDetectionState {
    }
}
