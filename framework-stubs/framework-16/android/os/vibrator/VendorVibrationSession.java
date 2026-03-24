package android.os.vibrator;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.os.vibrator.vendor_vibration_effects")
public final class VendorVibrationSession implements java.lang.AutoCloseable {
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_IGNORED = 2;
    public static final int STATUS_UNSUPPORTED = 3;
    public static final int STATUS_CANCELED = 4;
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_UNKNOWN_ERROR = 5;
    public VendorVibrationSession(android.os.vibrator.IVibrationSession p0) {}
    @android.annotation.RequiresPermission("android.permission.VIBRATE")
    public void vibrate(android.os.VibrationEffect p0, java.lang.String p1) {}
    public void cancel() {}
    public void close() {}

    public static interface Callback {
        public void onStarted(android.os.vibrator.VendorVibrationSession p0);
        public void onFinishing();
        public void onFinished(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
